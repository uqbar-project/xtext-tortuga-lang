/**
 */
package org.uqbar.paco.dsl.tortugaDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage
 * @generated
 */
public interface TortugaDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TortugaDSLFactory eINSTANCE = org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Tortuga Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tortuga Program</em>'.
   * @generated
   */
  TortugaProgram createTortugaProgram();

  /**
   * Returns a new object of class '<em>SENTENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SENTENCE</em>'.
   * @generated
   */
  SENTENCE createSENTENCE();

  /**
   * Returns a new object of class '<em>MOVE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MOVE</em>'.
   * @generated
   */
  MOVE createMOVE();

  /**
   * Returns a new object of class '<em>FORWARD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FORWARD</em>'.
   * @generated
   */
  FORWARD createFORWARD();

  /**
   * Returns a new object of class '<em>LEFT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LEFT</em>'.
   * @generated
   */
  LEFT createLEFT();

  /**
   * Returns a new object of class '<em>RIGHT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RIGHT</em>'.
   * @generated
   */
  RIGHT createRIGHT();

  /**
   * Returns a new object of class '<em>SET X</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SET X</em>'.
   * @generated
   */
  SET_X createSET_X();

  /**
   * Returns a new object of class '<em>SET Y</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SET Y</em>'.
   * @generated
   */
  SET_Y createSET_Y();

  /**
   * Returns a new object of class '<em>DRAWING SENTENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DRAWING SENTENCE</em>'.
   * @generated
   */
  DRAWING_SENTENCE createDRAWING_SENTENCE();

  /**
   * Returns a new object of class '<em>PENDOWN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PENDOWN</em>'.
   * @generated
   */
  PENDOWN createPENDOWN();

  /**
   * Returns a new object of class '<em>PENUP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PENUP</em>'.
   * @generated
   */
  PENUP createPENUP();

  /**
   * Returns a new object of class '<em>COLOREABLE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COLOREABLE</em>'.
   * @generated
   */
  COLOREABLE createCOLOREABLE();

  /**
   * Returns a new object of class '<em>PENCOLOR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PENCOLOR</em>'.
   * @generated
   */
  PENCOLOR createPENCOLOR();

  /**
   * Returns a new object of class '<em>CANVAS COLOR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CANVAS COLOR</em>'.
   * @generated
   */
  CANVAS_COLOR createCANVAS_COLOR();

  /**
   * Returns a new object of class '<em>COLOR SPEC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COLOR SPEC</em>'.
   * @generated
   */
  COLOR_SPEC createCOLOR_SPEC();

  /**
   * Returns a new object of class '<em>FONT SPEC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FONT SPEC</em>'.
   * @generated
   */
  FONT_SPEC createFONT_SPEC();

  /**
   * Returns a new object of class '<em>FONT SIZE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FONT SIZE</em>'.
   * @generated
   */
  FONT_SIZE createFONT_SIZE();

  /**
   * Returns a new object of class '<em>FONT STYLE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FONT STYLE</em>'.
   * @generated
   */
  FONT_STYLE createFONT_STYLE();

  /**
   * Returns a new object of class '<em>Font Style Values</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Font Style Values</em>'.
   * @generated
   */
  FontStyleValues createFontStyleValues();

  /**
   * Returns a new object of class '<em>CLEAR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CLEAR</em>'.
   * @generated
   */
  CLEAR createCLEAR();

  /**
   * Returns a new object of class '<em>HOME</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>HOME</em>'.
   * @generated
   */
  HOME createHOME();

  /**
   * Returns a new object of class '<em>DRAW STRING</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DRAW STRING</em>'.
   * @generated
   */
  DRAW_STRING createDRAW_STRING();

  /**
   * Returns a new object of class '<em>REFERENCIABLE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REFERENCIABLE</em>'.
   * @generated
   */
  REFERENCIABLE createREFERENCIABLE();

  /**
   * Returns a new object of class '<em>MAKE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MAKE</em>'.
   * @generated
   */
  MAKE createMAKE();

  /**
   * Returns a new object of class '<em>VARIABLE REF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VARIABLE REF</em>'.
   * @generated
   */
  VARIABLE_REF createVARIABLE_REF();

  /**
   * Returns a new object of class '<em>EXPRESSION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EXPRESSION</em>'.
   * @generated
   */
  EXPRESSION createEXPRESSION();

  /**
   * Returns a new object of class '<em>VALUE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VALUE</em>'.
   * @generated
   */
  VALUE createVALUE();

  /**
   * Returns a new object of class '<em>CONTENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CONTENT</em>'.
   * @generated
   */
  CONTENT createCONTENT();

  /**
   * Returns a new object of class '<em>OPERATION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OPERATION</em>'.
   * @generated
   */
  OPERATION createOPERATION();

  /**
   * Returns a new object of class '<em>SUM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SUM</em>'.
   * @generated
   */
  SUM createSUM();

  /**
   * Returns a new object of class '<em>SUBTRACT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SUBTRACT</em>'.
   * @generated
   */
  SUBTRACT createSUBTRACT();

  /**
   * Returns a new object of class '<em>MULTIPLY</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MULTIPLY</em>'.
   * @generated
   */
  MULTIPLY createMULTIPLY();

  /**
   * Returns a new object of class '<em>DIVIDE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DIVIDE</em>'.
   * @generated
   */
  DIVIDE createDIVIDE();

  /**
   * Returns a new object of class '<em>CONTROL SENTENCES</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CONTROL SENTENCES</em>'.
   * @generated
   */
  CONTROL_SENTENCES createCONTROL_SENTENCES();

  /**
   * Returns a new object of class '<em>REPEAT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>REPEAT</em>'.
   * @generated
   */
  REPEAT createREPEAT();

  /**
   * Returns a new object of class '<em>TO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TO</em>'.
   * @generated
   */
  TO createTO();

  /**
   * Returns a new object of class '<em>PARAM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PARAM</em>'.
   * @generated
   */
  PARAM createPARAM();

  /**
   * Returns a new object of class '<em>PROCEDURE CALL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PROCEDURE CALL</em>'.
   * @generated
   */
  PROCEDURE_CALL createPROCEDURE_CALL();

  /**
   * Returns a new object of class '<em>IF</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IF</em>'.
   * @generated
   */
  IF createIF();

  /**
   * Returns a new object of class '<em>BOOLEAN EXPRESSION</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOLEAN EXPRESSION</em>'.
   * @generated
   */
  BOOLEAN_EXPRESSION createBOOLEAN_EXPRESSION();

  /**
   * Returns a new object of class '<em>EQUALS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EQUALS</em>'.
   * @generated
   */
  EQUALS createEQUALS();

  /**
   * Returns a new object of class '<em>GREATER THAN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>GREATER THAN</em>'.
   * @generated
   */
  GREATER_THAN createGREATER_THAN();

  /**
   * Returns a new object of class '<em>LESSER THAN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LESSER THAN</em>'.
   * @generated
   */
  LESSER_THAN createLESSER_THAN();

  /**
   * Returns a new object of class '<em>BOLD</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOLD</em>'.
   * @generated
   */
  BOLD createBOLD();

  /**
   * Returns a new object of class '<em>ITALIC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ITALIC</em>'.
   * @generated
   */
  ITALIC createITALIC();

  /**
   * Returns a new object of class '<em>PLAIN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PLAIN</em>'.
   * @generated
   */
  PLAIN createPLAIN();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TortugaDSLPackage getTortugaDSLPackage();

} //TortugaDSLFactory
