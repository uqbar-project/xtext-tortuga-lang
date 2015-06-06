package org.uqbar.paco.dsl.interpreter

import java.awt.Color
import org.swhite.tortue.TortueCanvas
import org.uqbar.paco.dsl.tortugaDSL.COLOREABLE
import org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC

import static java.awt.Color.*

/**
 * 
 * @author jfernandes
 */
class TortugaExtensions {
	
	def toColorObject(String colorName) {
		// esto es porque no anda esta funcionalidad en tortue (tira error al cargar la i18n)
		switch (colorName.toUpperCase) {
			case 'BLACK': BLACK
			case 'BLUE': BLUE
			case 'CYAN': CYAN
			case 'DARK GRAY': DARK_GRAY
			case 'GRAY': GRAY
			case 'GREEN': GREEN
			case 'LIGHTGRAY': LIGHT_GRAY
			case 'MAGENTA': MAGENTA
			case 'ORANGE': ORANGE
			case 'PINK': PINK
			case 'RED': RED
			case 'WHITE': WHITE
			case 'YELLOW': YELLOW
		}
	}

	def penColor(TortueCanvas canvas, Color color) {
		canvas.pencolor(color.red.max(255), color.green.max(255), color.blue.max(255), color.alpha.max(255))
	}
	
	def canvasColor(TortueCanvas canvas, Color color) {
		canvas.canvascolor(color.red.max(255), color.green.max(255), color.blue.max(255))
	}
	
	def max(Integer v, Integer max) {
		if (v > max) max else v
	}
	
}