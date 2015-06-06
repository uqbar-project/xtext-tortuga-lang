/**
 */
package org.uqbar.paco.dsl.tortugaDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.uqbar.paco.dsl.tortugaDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TortugaDSLFactoryImpl extends EFactoryImpl implements TortugaDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TortugaDSLFactory init()
  {
    try
    {
      TortugaDSLFactory theTortugaDSLFactory = (TortugaDSLFactory)EPackage.Registry.INSTANCE.getEFactory(TortugaDSLPackage.eNS_URI);
      if (theTortugaDSLFactory != null)
      {
        return theTortugaDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TortugaDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TortugaDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TortugaDSLPackage.TORTUGA_PROGRAM: return createTortugaProgram();
      case TortugaDSLPackage.SENTENCE: return createSENTENCE();
      case TortugaDSLPackage.MOVE: return createMOVE();
      case TortugaDSLPackage.FORWARD: return createFORWARD();
      case TortugaDSLPackage.LEFT: return createLEFT();
      case TortugaDSLPackage.RIGHT: return createRIGHT();
      case TortugaDSLPackage.SET_X: return createSET_X();
      case TortugaDSLPackage.SET_Y: return createSET_Y();
      case TortugaDSLPackage.DRAWING_SENTENCE: return createDRAWING_SENTENCE();
      case TortugaDSLPackage.PENDOWN: return createPENDOWN();
      case TortugaDSLPackage.PENUP: return createPENUP();
      case TortugaDSLPackage.COLOREABLE: return createCOLOREABLE();
      case TortugaDSLPackage.PENCOLOR: return createPENCOLOR();
      case TortugaDSLPackage.CANVAS_COLOR: return createCANVAS_COLOR();
      case TortugaDSLPackage.COLOR_SPEC: return createCOLOR_SPEC();
      case TortugaDSLPackage.FONT_SPEC: return createFONT_SPEC();
      case TortugaDSLPackage.FONT_SIZE: return createFONT_SIZE();
      case TortugaDSLPackage.FONT_STYLE: return createFONT_STYLE();
      case TortugaDSLPackage.FONT_STYLE_VALUES: return createFontStyleValues();
      case TortugaDSLPackage.CLEAR: return createCLEAR();
      case TortugaDSLPackage.HOME: return createHOME();
      case TortugaDSLPackage.DRAW_STRING: return createDRAW_STRING();
      case TortugaDSLPackage.REFERENCIABLE: return createREFERENCIABLE();
      case TortugaDSLPackage.MAKE: return createMAKE();
      case TortugaDSLPackage.VARIABLE_REF: return createVARIABLE_REF();
      case TortugaDSLPackage.EXPRESSION: return createEXPRESSION();
      case TortugaDSLPackage.VALUE: return createVALUE();
      case TortugaDSLPackage.CONTENT: return createCONTENT();
      case TortugaDSLPackage.OPERATION: return createOPERATION();
      case TortugaDSLPackage.SUM: return createSUM();
      case TortugaDSLPackage.SUBTRACT: return createSUBTRACT();
      case TortugaDSLPackage.MULTIPLY: return createMULTIPLY();
      case TortugaDSLPackage.DIVIDE: return createDIVIDE();
      case TortugaDSLPackage.CONTROL_SENTENCES: return createCONTROL_SENTENCES();
      case TortugaDSLPackage.REPEAT: return createREPEAT();
      case TortugaDSLPackage.TO: return createTO();
      case TortugaDSLPackage.PARAM: return createPARAM();
      case TortugaDSLPackage.PROCEDURE_CALL: return createPROCEDURE_CALL();
      case TortugaDSLPackage.IF: return createIF();
      case TortugaDSLPackage.BOOLEAN_EXPRESSION: return createBOOLEAN_EXPRESSION();
      case TortugaDSLPackage.EQUALS: return createEQUALS();
      case TortugaDSLPackage.GREATER_THAN: return createGREATER_THAN();
      case TortugaDSLPackage.LESSER_THAN: return createLESSER_THAN();
      case TortugaDSLPackage.BOLD: return createBOLD();
      case TortugaDSLPackage.ITALIC: return createITALIC();
      case TortugaDSLPackage.PLAIN: return createPLAIN();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TortugaProgram createTortugaProgram()
  {
    TortugaProgramImpl tortugaProgram = new TortugaProgramImpl();
    return tortugaProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SENTENCE createSENTENCE()
  {
    SENTENCEImpl sentence = new SENTENCEImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MOVE createMOVE()
  {
    MOVEImpl move = new MOVEImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FORWARD createFORWARD()
  {
    FORWARDImpl forward = new FORWARDImpl();
    return forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEFT createLEFT()
  {
    LEFTImpl left = new LEFTImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RIGHT createRIGHT()
  {
    RIGHTImpl right = new RIGHTImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SET_X createSET_X()
  {
    SET_XImpl seT_X = new SET_XImpl();
    return seT_X;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SET_Y createSET_Y()
  {
    SET_YImpl seT_Y = new SET_YImpl();
    return seT_Y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DRAWING_SENTENCE createDRAWING_SENTENCE()
  {
    DRAWING_SENTENCEImpl drawinG_SENTENCE = new DRAWING_SENTENCEImpl();
    return drawinG_SENTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PENDOWN createPENDOWN()
  {
    PENDOWNImpl pendown = new PENDOWNImpl();
    return pendown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PENUP createPENUP()
  {
    PENUPImpl penup = new PENUPImpl();
    return penup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLOREABLE createCOLOREABLE()
  {
    COLOREABLEImpl coloreable = new COLOREABLEImpl();
    return coloreable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PENCOLOR createPENCOLOR()
  {
    PENCOLORImpl pencolor = new PENCOLORImpl();
    return pencolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CANVAS_COLOR createCANVAS_COLOR()
  {
    CANVAS_COLORImpl canvaS_COLOR = new CANVAS_COLORImpl();
    return canvaS_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLOR_SPEC createCOLOR_SPEC()
  {
    COLOR_SPECImpl coloR_SPEC = new COLOR_SPECImpl();
    return coloR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONT_SPEC createFONT_SPEC()
  {
    FONT_SPECImpl fonT_SPEC = new FONT_SPECImpl();
    return fonT_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONT_SIZE createFONT_SIZE()
  {
    FONT_SIZEImpl fonT_SIZE = new FONT_SIZEImpl();
    return fonT_SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONT_STYLE createFONT_STYLE()
  {
    FONT_STYLEImpl fonT_STYLE = new FONT_STYLEImpl();
    return fonT_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyleValues createFontStyleValues()
  {
    FontStyleValuesImpl fontStyleValues = new FontStyleValuesImpl();
    return fontStyleValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLEAR createCLEAR()
  {
    CLEARImpl clear = new CLEARImpl();
    return clear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOME createHOME()
  {
    HOMEImpl home = new HOMEImpl();
    return home;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DRAW_STRING createDRAW_STRING()
  {
    DRAW_STRINGImpl draW_STRING = new DRAW_STRINGImpl();
    return draW_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REFERENCIABLE createREFERENCIABLE()
  {
    REFERENCIABLEImpl referenciable = new REFERENCIABLEImpl();
    return referenciable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAKE createMAKE()
  {
    MAKEImpl make = new MAKEImpl();
    return make;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARIABLE_REF createVARIABLE_REF()
  {
    VARIABLE_REFImpl variablE_REF = new VARIABLE_REFImpl();
    return variablE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION createEXPRESSION()
  {
    EXPRESSIONImpl expression = new EXPRESSIONImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VALUE createVALUE()
  {
    VALUEImpl value = new VALUEImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CONTENT createCONTENT()
  {
    CONTENTImpl content = new CONTENTImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OPERATION createOPERATION()
  {
    OPERATIONImpl operation = new OPERATIONImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SUM createSUM()
  {
    SUMImpl sum = new SUMImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SUBTRACT createSUBTRACT()
  {
    SUBTRACTImpl subtract = new SUBTRACTImpl();
    return subtract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MULTIPLY createMULTIPLY()
  {
    MULTIPLYImpl multiply = new MULTIPLYImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DIVIDE createDIVIDE()
  {
    DIVIDEImpl divide = new DIVIDEImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CONTROL_SENTENCES createCONTROL_SENTENCES()
  {
    CONTROL_SENTENCESImpl controL_SENTENCES = new CONTROL_SENTENCESImpl();
    return controL_SENTENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REPEAT createREPEAT()
  {
    REPEATImpl repeat = new REPEATImpl();
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TO createTO()
  {
    TOImpl to = new TOImpl();
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PARAM createPARAM()
  {
    PARAMImpl param = new PARAMImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PROCEDURE_CALL createPROCEDURE_CALL()
  {
    PROCEDURE_CALLImpl procedurE_CALL = new PROCEDURE_CALLImpl();
    return procedurE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IF createIF()
  {
    IFImpl if_ = new IFImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOLEAN_EXPRESSION createBOOLEAN_EXPRESSION()
  {
    BOOLEAN_EXPRESSIONImpl booleaN_EXPRESSION = new BOOLEAN_EXPRESSIONImpl();
    return booleaN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQUALS createEQUALS()
  {
    EQUALSImpl equals = new EQUALSImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GREATER_THAN createGREATER_THAN()
  {
    GREATER_THANImpl greateR_THAN = new GREATER_THANImpl();
    return greateR_THAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LESSER_THAN createLESSER_THAN()
  {
    LESSER_THANImpl lesseR_THAN = new LESSER_THANImpl();
    return lesseR_THAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOLD createBOLD()
  {
    BOLDImpl bold = new BOLDImpl();
    return bold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ITALIC createITALIC()
  {
    ITALICImpl italic = new ITALICImpl();
    return italic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PLAIN createPLAIN()
  {
    PLAINImpl plain = new PLAINImpl();
    return plain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TortugaDSLPackage getTortugaDSLPackage()
  {
    return (TortugaDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TortugaDSLPackage getPackage()
  {
    return TortugaDSLPackage.eINSTANCE;
  }

} //TortugaDSLFactoryImpl
