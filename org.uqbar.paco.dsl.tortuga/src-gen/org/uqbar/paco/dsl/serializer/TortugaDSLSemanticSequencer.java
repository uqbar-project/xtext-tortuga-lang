package org.uqbar.paco.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.uqbar.paco.dsl.services.TortugaDSLGrammarAccess;
import org.uqbar.paco.dsl.tortugaDSL.BOLD;
import org.uqbar.paco.dsl.tortugaDSL.CANVAS_COLOR;
import org.uqbar.paco.dsl.tortugaDSL.CLEAR;
import org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC;
import org.uqbar.paco.dsl.tortugaDSL.CONTENT;
import org.uqbar.paco.dsl.tortugaDSL.DIVIDE;
import org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING;
import org.uqbar.paco.dsl.tortugaDSL.EQUALS;
import org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE;
import org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE;
import org.uqbar.paco.dsl.tortugaDSL.FORWARD;
import org.uqbar.paco.dsl.tortugaDSL.GREATER_THAN;
import org.uqbar.paco.dsl.tortugaDSL.HOME;
import org.uqbar.paco.dsl.tortugaDSL.IF;
import org.uqbar.paco.dsl.tortugaDSL.ITALIC;
import org.uqbar.paco.dsl.tortugaDSL.LEFT;
import org.uqbar.paco.dsl.tortugaDSL.LESSER_THAN;
import org.uqbar.paco.dsl.tortugaDSL.MAKE;
import org.uqbar.paco.dsl.tortugaDSL.MULTIPLY;
import org.uqbar.paco.dsl.tortugaDSL.PARAM;
import org.uqbar.paco.dsl.tortugaDSL.PENCOLOR;
import org.uqbar.paco.dsl.tortugaDSL.PENDOWN;
import org.uqbar.paco.dsl.tortugaDSL.PENUP;
import org.uqbar.paco.dsl.tortugaDSL.PLAIN;
import org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL;
import org.uqbar.paco.dsl.tortugaDSL.REPEAT;
import org.uqbar.paco.dsl.tortugaDSL.RIGHT;
import org.uqbar.paco.dsl.tortugaDSL.SET_X;
import org.uqbar.paco.dsl.tortugaDSL.SET_Y;
import org.uqbar.paco.dsl.tortugaDSL.SUBTRACT;
import org.uqbar.paco.dsl.tortugaDSL.SUM;
import org.uqbar.paco.dsl.tortugaDSL.TO;
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage;
import org.uqbar.paco.dsl.tortugaDSL.TortugaProgram;
import org.uqbar.paco.dsl.tortugaDSL.VALUE;
import org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF;

@SuppressWarnings("all")
public class TortugaDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TortugaDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TortugaDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TortugaDSLPackage.BOLD:
				if(context == grammarAccess.getFontStyleValuesRule()) {
					sequence_FontStyleValues(context, (BOLD) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.CANVAS_COLOR:
				if(context == grammarAccess.getCANVAS_COLORRule() ||
				   context == grammarAccess.getCOLOREABLERule() ||
				   context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_CANVAS_COLOR(context, (CANVAS_COLOR) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.CLEAR:
				if(context == grammarAccess.getCLEARRule() ||
				   context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_CLEAR(context, (CLEAR) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.COLOR_SPEC:
				if(context == grammarAccess.getCOLOR_SPECRule()) {
					sequence_COLOR_SPEC(context, (COLOR_SPEC) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.CONTENT:
				if(context == grammarAccess.getCONTENTRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_CONTENT(context, (CONTENT) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.DIVIDE:
				if(context == grammarAccess.getDIVIDERule() ||
				   context == grammarAccess.getOPERATIONRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_DIVIDE(context, (DIVIDE) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.DRAW_STRING:
				if(context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getDRAW_STRINGRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_DRAW_STRING(context, (DRAW_STRING) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.EQUALS:
				if(context == grammarAccess.getBOOLEAN_EXPRESSIONRule() ||
				   context == grammarAccess.getEQUALSRule()) {
					sequence_EQUALS(context, (EQUALS) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.FONT_SIZE:
				if(context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getFONT_SIZERule() ||
				   context == grammarAccess.getFONT_SPECRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_FONT_SIZE(context, (FONT_SIZE) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.FONT_STYLE:
				if(context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getFONT_SPECRule() ||
				   context == grammarAccess.getFONT_STYLERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_FONT_STYLE(context, (FONT_STYLE) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.FORWARD:
				if(context == grammarAccess.getFORWARDRule() ||
				   context == grammarAccess.getMOVERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_FORWARD(context, (FORWARD) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.GREATER_THAN:
				if(context == grammarAccess.getBOOLEAN_EXPRESSIONRule() ||
				   context == grammarAccess.getGREATER_THANRule()) {
					sequence_GREATER_THAN(context, (GREATER_THAN) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.HOME:
				if(context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getHOMERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_HOME(context, (HOME) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.IF:
				if(context == grammarAccess.getCONTROL_SENTENCESRule() ||
				   context == grammarAccess.getIFRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_IF(context, (IF) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.ITALIC:
				if(context == grammarAccess.getFontStyleValuesRule()) {
					sequence_FontStyleValues(context, (ITALIC) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.LEFT:
				if(context == grammarAccess.getLEFTRule() ||
				   context == grammarAccess.getMOVERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_LEFT(context, (LEFT) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.LESSER_THAN:
				if(context == grammarAccess.getBOOLEAN_EXPRESSIONRule() ||
				   context == grammarAccess.getLESSER_THANRule()) {
					sequence_LESSER_THAN(context, (LESSER_THAN) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.MAKE:
				if(context == grammarAccess.getMAKERule() ||
				   context == grammarAccess.getREFERENCIABLERule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_MAKE(context, (MAKE) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.MULTIPLY:
				if(context == grammarAccess.getMULTIPLYRule() ||
				   context == grammarAccess.getOPERATIONRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_MULTIPLY(context, (MULTIPLY) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.PARAM:
				if(context == grammarAccess.getPARAMRule() ||
				   context == grammarAccess.getREFERENCIABLERule()) {
					sequence_PARAM(context, (PARAM) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.PENCOLOR:
				if(context == grammarAccess.getCOLOREABLERule() ||
				   context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getPENCOLORRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_PENCOLOR(context, (PENCOLOR) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.PENDOWN:
				if(context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getPENDOWNRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_PENDOWN(context, (PENDOWN) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.PENUP:
				if(context == grammarAccess.getDRAWING_SENTENCERule() ||
				   context == grammarAccess.getPENUPRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_PENUP(context, (PENUP) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.PLAIN:
				if(context == grammarAccess.getFontStyleValuesRule()) {
					sequence_FontStyleValues(context, (PLAIN) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.PROCEDURE_CALL:
				if(context == grammarAccess.getPROCEDURE_CALLRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_PROCEDURE_CALL(context, (PROCEDURE_CALL) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.REPEAT:
				if(context == grammarAccess.getCONTROL_SENTENCESRule() ||
				   context == grammarAccess.getREPEATRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_REPEAT(context, (REPEAT) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.RIGHT:
				if(context == grammarAccess.getMOVERule() ||
				   context == grammarAccess.getRIGHTRule() ||
				   context == grammarAccess.getSENTENCERule()) {
					sequence_RIGHT(context, (RIGHT) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.SET_X:
				if(context == grammarAccess.getMOVERule() ||
				   context == grammarAccess.getSENTENCERule() ||
				   context == grammarAccess.getSET_XRule()) {
					sequence_SET_X(context, (SET_X) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.SET_Y:
				if(context == grammarAccess.getMOVERule() ||
				   context == grammarAccess.getSENTENCERule() ||
				   context == grammarAccess.getSET_YRule()) {
					sequence_SET_Y(context, (SET_Y) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.SUBTRACT:
				if(context == grammarAccess.getOPERATIONRule() ||
				   context == grammarAccess.getSENTENCERule() ||
				   context == grammarAccess.getSUBTRACTRule()) {
					sequence_SUBTRACT(context, (SUBTRACT) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.SUM:
				if(context == grammarAccess.getOPERATIONRule() ||
				   context == grammarAccess.getSENTENCERule() ||
				   context == grammarAccess.getSUMRule()) {
					sequence_SUM(context, (SUM) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.TO:
				if(context == grammarAccess.getCONTROL_SENTENCESRule() ||
				   context == grammarAccess.getSENTENCERule() ||
				   context == grammarAccess.getTORule()) {
					sequence_TO(context, (TO) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.TORTUGA_PROGRAM:
				if(context == grammarAccess.getTortugaProgramRule()) {
					sequence_TortugaProgram(context, (TortugaProgram) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.VALUE:
				if(context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getVALUERule()) {
					sequence_VALUE(context, (VALUE) semanticObject); 
					return; 
				}
				else break;
			case TortugaDSLPackage.VARIABLE_REF:
				if(context == grammarAccess.getEXPRESSIONRule() ||
				   context == grammarAccess.getVARIABLE_REFRule()) {
					sequence_VARIABLE_REF(context, (VARIABLE_REF) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (color=COLOR | colorSpec=COLOR_SPEC)
	 */
	protected void sequence_CANVAS_COLOR(EObject context, CANVAS_COLOR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CLEAR}
	 */
	protected void sequence_CLEAR(EObject context, CLEAR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (red=EXPRESSION green=EXPRESSION blue=EXPRESSION alpha=EXPRESSION)
	 */
	protected void sequence_COLOR_SPEC(EObject context, COLOR_SPEC semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__RED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__RED));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__GREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__GREEN));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__BLUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__BLUE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__ALPHA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.COLOR_SPEC__ALPHA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCOLOR_SPECAccess().getRedEXPRESSIONParserRuleCall_0_0(), semanticObject.getRed());
		feeder.accept(grammarAccess.getCOLOR_SPECAccess().getGreenEXPRESSIONParserRuleCall_1_0(), semanticObject.getGreen());
		feeder.accept(grammarAccess.getCOLOR_SPECAccess().getBlueEXPRESSIONParserRuleCall_2_0(), semanticObject.getBlue());
		feeder.accept(grammarAccess.getCOLOR_SPECAccess().getAlphaEXPRESSIONParserRuleCall_3_0(), semanticObject.getAlpha());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     var=[MAKE|ID]
	 */
	protected void sequence_CONTENT(EObject context, CONTENT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.CONTENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.CONTENT__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCONTENTAccess().getVarMAKEIDTerminalRuleCall_1_0_1(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (targetVariable=[MAKE|ID] valOne=EXPRESSION valTwo=EXPRESSION)
	 */
	protected void sequence_DIVIDE(EObject context, DIVIDE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDIVIDEAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1(), semanticObject.getTargetVariable());
		feeder.accept(grammarAccess.getDIVIDEAccess().getValOneEXPRESSIONParserRuleCall_3_0(), semanticObject.getValOne());
		feeder.accept(grammarAccess.getDIVIDEAccess().getValTwoEXPRESSIONParserRuleCall_5_0(), semanticObject.getValTwo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_DRAW_STRING(EObject context, DRAW_STRING semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.DRAW_STRING__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.DRAW_STRING__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDRAW_STRINGAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op1=EXPRESSION op2=EXPRESSION)
	 */
	protected void sequence_EQUALS(EObject context, EQUALS semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP1));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEQUALSAccess().getOp1EXPRESSIONParserRuleCall_0_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getEQUALSAccess().getOp2EXPRESSIONParserRuleCall_2_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     size=EXPRESSION
	 */
	protected void sequence_FONT_SIZE(EObject context, FONT_SIZE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.FONT_SIZE__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.FONT_SIZE__SIZE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFONT_SIZEAccess().getSizeEXPRESSIONParserRuleCall_1_0(), semanticObject.getSize());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     style=FontStyleValues
	 */
	protected void sequence_FONT_STYLE(EObject context, FONT_STYLE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.FONT_STYLE__STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.FONT_STYLE__STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFONT_STYLEAccess().getStyleFontStyleValuesParserRuleCall_1_0(), semanticObject.getStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     amount=EXPRESSION
	 */
	protected void sequence_FORWARD(EObject context, FORWARD semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFORWARDAccess().getAmountEXPRESSIONParserRuleCall_1_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {BOLD}
	 */
	protected void sequence_FontStyleValues(EObject context, BOLD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ITALIC}
	 */
	protected void sequence_FontStyleValues(EObject context, ITALIC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PLAIN}
	 */
	protected void sequence_FontStyleValues(EObject context, PLAIN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (op1=EXPRESSION op2=EXPRESSION)
	 */
	protected void sequence_GREATER_THAN(EObject context, GREATER_THAN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP1));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGREATER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getGREATER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {HOME}
	 */
	protected void sequence_HOME(EObject context, HOME semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=BOOLEAN_EXPRESSION commands+=SENTENCE+)
	 */
	protected void sequence_IF(EObject context, IF semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     amount=EXPRESSION
	 */
	protected void sequence_LEFT(EObject context, LEFT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLEFTAccess().getAmountEXPRESSIONParserRuleCall_1_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (op1=EXPRESSION op2=EXPRESSION)
	 */
	protected void sequence_LESSER_THAN(EObject context, LESSER_THAN semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP1));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION__OP2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLESSER_THANAccess().getOp1EXPRESSIONParserRuleCall_0_0(), semanticObject.getOp1());
		feeder.accept(grammarAccess.getLESSER_THANAccess().getOp2EXPRESSIONParserRuleCall_2_0(), semanticObject.getOp2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=EXPRESSION)
	 */
	protected void sequence_MAKE(EObject context, MAKE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.REFERENCIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.REFERENCIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.MAKE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.MAKE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMAKEAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMAKEAccess().getValueEXPRESSIONParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (targetVariable=[MAKE|ID] valOne=EXPRESSION valTwo=EXPRESSION)
	 */
	protected void sequence_MULTIPLY(EObject context, MULTIPLY semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMULTIPLYAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1(), semanticObject.getTargetVariable());
		feeder.accept(grammarAccess.getMULTIPLYAccess().getValOneEXPRESSIONParserRuleCall_3_0(), semanticObject.getValOne());
		feeder.accept(grammarAccess.getMULTIPLYAccess().getValTwoEXPRESSIONParserRuleCall_5_0(), semanticObject.getValTwo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PARAM(EObject context, PARAM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.REFERENCIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.REFERENCIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPARAMAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (color=COLOR | colorSpec=COLOR_SPEC)
	 */
	protected void sequence_PENCOLOR(EObject context, PENCOLOR semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PENDOWN}
	 */
	protected void sequence_PENDOWN(EObject context, PENDOWN semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PENUP}
	 */
	protected void sequence_PENUP(EObject context, PENUP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (to=[TO|ID] params+=EXPRESSION*)
	 */
	protected void sequence_PROCEDURE_CALL(EObject context, PROCEDURE_CALL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (times=EXPRESSION commands+=SENTENCE+)
	 */
	protected void sequence_REPEAT(EObject context, REPEAT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     amount=EXPRESSION
	 */
	protected void sequence_RIGHT(EObject context, RIGHT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRIGHTAccess().getAmountEXPRESSIONParserRuleCall_1_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     amount=EXPRESSION
	 */
	protected void sequence_SET_X(EObject context, SET_X semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSET_XAccess().getAmountEXPRESSIONParserRuleCall_1_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     amount=EXPRESSION
	 */
	protected void sequence_SET_Y(EObject context, SET_Y semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.MOVE__AMOUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSET_YAccess().getAmountEXPRESSIONParserRuleCall_1_0(), semanticObject.getAmount());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (targetVariable=[MAKE|ID] valOne=EXPRESSION valTwo=EXPRESSION)
	 */
	protected void sequence_SUBTRACT(EObject context, SUBTRACT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSUBTRACTAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1(), semanticObject.getTargetVariable());
		feeder.accept(grammarAccess.getSUBTRACTAccess().getValOneEXPRESSIONParserRuleCall_3_0(), semanticObject.getValOne());
		feeder.accept(grammarAccess.getSUBTRACTAccess().getValTwoEXPRESSIONParserRuleCall_5_0(), semanticObject.getValTwo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (targetVariable=[MAKE|ID] valOne=EXPRESSION valTwo=EXPRESSION)
	 */
	protected void sequence_SUM(EObject context, SUM semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__TARGET_VARIABLE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_ONE));
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.OPERATION__VAL_TWO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSUMAccess().getTargetVariableMAKEIDTerminalRuleCall_1_0_1(), semanticObject.getTargetVariable());
		feeder.accept(grammarAccess.getSUMAccess().getValOneEXPRESSIONParserRuleCall_3_0(), semanticObject.getValOne());
		feeder.accept(grammarAccess.getSUMAccess().getValTwoEXPRESSIONParserRuleCall_5_0(), semanticObject.getValTwo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parameters+=PARAM* commands+=SENTENCE+)
	 */
	protected void sequence_TO(EObject context, TO semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sentences+=SENTENCE*
	 */
	protected void sequence_TortugaProgram(EObject context, TortugaProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=DOUBLE
	 */
	protected void sequence_VALUE(EObject context, VALUE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.VALUE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.VALUE__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVALUEAccess().getValDOUBLETerminalRuleCall_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     toVar=[REFERENCIABLE|ID]
	 */
	protected void sequence_VARIABLE_REF(EObject context, VARIABLE_REF semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TortugaDSLPackage.Literals.VARIABLE_REF__TO_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TortugaDSLPackage.Literals.VARIABLE_REF__TO_VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVARIABLE_REFAccess().getToVarREFERENCIABLEIDTerminalRuleCall_0_1(), semanticObject.getToVar());
		feeder.finish();
	}
}
