package org.uqbar.paco.dsl.interpreter

import org.uqbar.paco.dsl.tortugaDSL.FORWARD
import org.uqbar.paco.dsl.tortugaDSL.LEFT
import org.uqbar.paco.dsl.tortugaDSL.MAKE
import org.uqbar.paco.dsl.tortugaDSL.PENDOWN
import org.uqbar.paco.dsl.tortugaDSL.PENUP
import org.uqbar.paco.dsl.tortugaDSL.RIGHT
import org.uqbar.paco.dsl.tortugaDSL.SENTENCE
import org.uqbar.paco.dsl.tortugaDSL.TortugaProgram
import org.uqbar.paco.dsl.tortugaDSL.VALUE
import org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF
import org.swhite.tortue.TortueCanvas
import org.uqbar.paco.dsl.tortugaDSL.REPEAT
import org.uqbar.paco.dsl.tortugaDSL.TO
import org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL
import org.uqbar.paco.dsl.tortugaDSL.PENCOLOR
import org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC
import java.awt.Color
import org.uqbar.paco.dsl.tortugaDSL.^IF
import org.uqbar.paco.dsl.tortugaDSL.EQUALS
import org.uqbar.paco.dsl.tortugaDSL.GREATER_THAN
import org.uqbar.paco.dsl.tortugaDSL.LESSER_THAN
import org.uqbar.paco.dsl.tortugaDSL.SUM
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLFactory
import org.uqbar.paco.dsl.tortugaDSL.DIVIDE
import org.uqbar.paco.dsl.tortugaDSL.MULTIPLY
import org.uqbar.paco.dsl.tortugaDSL.SUBTRACT
import org.uqbar.paco.dsl.tortugaDSL.COLOREABLE
import org.uqbar.paco.dsl.tortugaDSL.OPERATION
import org.uqbar.paco.dsl.tortugaDSL.CANVAS_COLOR
import org.uqbar.paco.dsl.tortugaDSL.HOME
import org.uqbar.paco.dsl.tortugaDSL.CLEAR
import org.uqbar.paco.dsl.tortugaDSL.SET_X
import org.uqbar.paco.dsl.tortugaDSL.SET_Y
import org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE
import org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE
import org.uqbar.paco.dsl.tortugaDSL.BOLD
import org.uqbar.paco.dsl.tortugaDSL.ITALIC
import org.uqbar.paco.dsl.tortugaDSL.PLAIN
import org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING

import org.uqbar.paco.dsl.tortugaDSL.PARAM
import java.util.Stack
import java.util.Map

/**
 * Interprete del modélo semantico para su ejecución.
 * Implementa el comportamiento como extension methods a las clases del modelo.
 * Convierte en "ejecutables" a todas las sentencias, y en "evaluables" 
 * a todas las expresiones.
 * 
 * @author jfernandes
 */
class TortugaInterpreter {
	extension TortugaExtensions extensions = new TortugaExtensions
	TortueCanvas canvas
	var stack = new Stack<Map<PARAM, Double>>
	
	new(TortueCanvas canvas) {
		this.canvas = canvas;
	}
	
	// ******************************
	// ** EXECs
	// ******************************
	
	def dispatch void exec(TortugaProgram p) {
		canvas.newCommand
		p.sentences.forEach[s | s.exec ; canvas.repaint ]
	}

	// DUMMY IMPL FOR UNCATCHED CASES: esto se deberia borrar luego
	def dispatch void exec(SENTENCE s) { throw new UnsupportedOperationException("ERROR !!! No implementado para: " + s) }
	
	def dispatch void exec(MAKE m) { m.value = m.value.evaluate.asValue }
	
	// moves
	def dispatch void exec(LEFT l) { canvas.left(l.amount.evaluate) }
	def dispatch void exec(RIGHT r) { canvas.right(r.amount.evaluate) }
	def dispatch void exec(FORWARD f) { canvas.forward(f.amount.evaluate.intValue) }
	def dispatch void exec(SET_X s) { canvas.setX(s.amount.evaluate.intValue) }
	def dispatch void exec(SET_Y s) { canvas.setY(s.amount.evaluate.intValue) }
	
	// drawing
	def dispatch void exec(PENDOWN r) { canvas.penDown }
	def dispatch void exec(PENUP r) { canvas.penUp }
	def dispatch void exec(PENCOLOR coloreable) { canvas.penColor(coloreable.colorObject) }
	def dispatch void exec(CANVAS_COLOR coloreable) { canvas.canvasColor(coloreable.colorObject) }
	def dispatch void exec(HOME h) { canvas.home }
	def dispatch void exec(CLEAR c) { canvas.clear }
	def dispatch void exec(FONT_SIZE c) { canvas.fontSize(c.size.evaluate.intValue) }
	def dispatch void exec(FONT_STYLE c) { canvas.fontStyle(c.style.asTortueInt) }
		def dispatch int asTortueInt(BOLD n) { 1 }
		def dispatch int asTortueInt(ITALIC n) { 2 }
		def dispatch int asTortueInt(PLAIN n) { 0 }
	def dispatch void exec(DRAW_STRING string) { canvas.drawString(string.text) }
	
	// control statements
	def dispatch void exec(REPEAT r) { 
		(1..(r.times.evaluate.intValue)).forEach[
			r.commands.forEach[c| c.exec]
		]
	}
	def dispatch void exec(TO t) { /* does nothing. It's just a declaration */ }
	def dispatch void exec(PROCEDURE_CALL call) {
		stack.push(call.createContext())
		call.to.commands.forEach[c | c.exec]
		stack.pop 
	}
	
	def Map<PARAM,Double> createContext(PROCEDURE_CALL call) {
		val map = newHashMap
		// param - value
		call.params.forEach[p, i|
			map.put(call.to.parameters.get(i), p.evaluate)  
		]
		map
	}
	
	def dispatch void exec(^IF bif) {
		if (bif.condition.evalBool) 
			bif.commands.forEach[c| c.exec ]
	}
	
	def dispatch void exec(SUM s) 			{ s.updateVar[a,b| a + b] }
	def dispatch void exec(DIVIDE s) 		{ s.updateVar[a,b| a / b] }
	def dispatch void exec(MULTIPLY s) 		{ s.updateVar[a,b| a * b] }
	def dispatch void exec(SUBTRACT s) 		{ s.updateVar[a,b| a - b] }
	
	def updateVar(OPERATION s, (Double,Double)=>Double function) {
		s.targetVariable.value = function.apply(s.valOne.evaluate, s.valTwo.evaluate).asValue
	}
	
	// ******************************
	// ** Boolean Evaluation
	// ******************************
	
	def dispatch boolean evalBool(EQUALS e) { e.op1.evaluate == e.op2.evaluate }
	def dispatch boolean evalBool(GREATER_THAN e) { e.op1.evaluate > e.op2.evaluate }
	def dispatch boolean evalBool(LESSER_THAN e) { e.op1.evaluate < e.op2.evaluate }
	
	
	// ******************************
	// ** VALUE's Evaluation
	// ******************************

	def dispatch Double evaluate(VALUE v) { v.^val }
	def dispatch Double evaluate(VARIABLE_REF r) { r.toVar.evaluate }
	def dispatch Double evaluate(MAKE m) { m.value.evaluate }
	def dispatch Double evaluate(PARAM p) { stack.peek.get(p) }
	
	// ******************************
	// ** TORTUE extension methods
	// ******************************

	def asValue(Double i) {
		val v = TortugaDSLFactory.eINSTANCE.createVALUE
		v.^val = i
		v
	}
	
	def toColorObject(COLOR_SPEC spec) {
		new Color(spec.red.evaluate.intValue, 
			spec.green.evaluate.intValue, 
			spec.blue.evaluate.intValue, 
			spec.alpha.evaluate.intValue)
	}
	
	def colorObject(COLOREABLE coloreable) {
		if (coloreable.color != null) coloreable.color.toColorObject  else coloreable.colorSpec.toColorObject
	}
	
}