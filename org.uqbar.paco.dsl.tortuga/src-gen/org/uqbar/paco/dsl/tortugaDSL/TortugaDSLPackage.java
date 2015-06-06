/**
 */
package org.uqbar.paco.dsl.tortugaDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLFactory
 * @model kind="package"
 * @generated
 */
public interface TortugaDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tortugaDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uqbar.org/paco/dsl/TortugaDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tortugaDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TortugaDSLPackage eINSTANCE = org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.TortugaProgramImpl <em>Tortuga Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaProgramImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getTortugaProgram()
   * @generated
   */
  int TORTUGA_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TORTUGA_PROGRAM__SENTENCES = 0;

  /**
   * The number of structural features of the '<em>Tortuga Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TORTUGA_PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SENTENCEImpl <em>SENTENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.SENTENCEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSENTENCE()
   * @generated
   */
  int SENTENCE = 1;

  /**
   * The number of structural features of the '<em>SENTENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.MOVEImpl <em>MOVE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.MOVEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getMOVE()
   * @generated
   */
  int MOVE = 2;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__AMOUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MOVE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FORWARDImpl <em>FORWARD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.FORWARDImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFORWARD()
   * @generated
   */
  int FORWARD = 3;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>FORWARD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.LEFTImpl <em>LEFT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.LEFTImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getLEFT()
   * @generated
   */
  int LEFT = 4;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>LEFT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.RIGHTImpl <em>RIGHT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.RIGHTImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getRIGHT()
   * @generated
   */
  int RIGHT = 5;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>RIGHT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SET_XImpl <em>SET X</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.SET_XImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSET_X()
   * @generated
   */
  int SET_X = 6;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_X__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>SET X</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_X_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SET_YImpl <em>SET Y</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.SET_YImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSET_Y()
   * @generated
   */
  int SET_Y = 7;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_Y__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>SET Y</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_Y_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.DRAWING_SENTENCEImpl <em>DRAWING SENTENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.DRAWING_SENTENCEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getDRAWING_SENTENCE()
   * @generated
   */
  int DRAWING_SENTENCE = 8;

  /**
   * The number of structural features of the '<em>DRAWING SENTENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWING_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PENDOWNImpl <em>PENDOWN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.PENDOWNImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPENDOWN()
   * @generated
   */
  int PENDOWN = 9;

  /**
   * The number of structural features of the '<em>PENDOWN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENDOWN_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PENUPImpl <em>PENUP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.PENUPImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPENUP()
   * @generated
   */
  int PENUP = 10;

  /**
   * The number of structural features of the '<em>PENUP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENUP_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOREABLEImpl <em>COLOREABLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.COLOREABLEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCOLOREABLE()
   * @generated
   */
  int COLOREABLE = 11;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOREABLE__COLOR = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOREABLE__COLOR_SPEC = DRAWING_SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>COLOREABLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOREABLE_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PENCOLORImpl <em>PENCOLOR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.PENCOLORImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPENCOLOR()
   * @generated
   */
  int PENCOLOR = 12;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENCOLOR__COLOR = COLOREABLE__COLOR;

  /**
   * The feature id for the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENCOLOR__COLOR_SPEC = COLOREABLE__COLOR_SPEC;

  /**
   * The number of structural features of the '<em>PENCOLOR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENCOLOR_FEATURE_COUNT = COLOREABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CANVAS_COLORImpl <em>CANVAS COLOR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.CANVAS_COLORImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCANVAS_COLOR()
   * @generated
   */
  int CANVAS_COLOR = 13;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_COLOR__COLOR = COLOREABLE__COLOR;

  /**
   * The feature id for the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_COLOR__COLOR_SPEC = COLOREABLE__COLOR_SPEC;

  /**
   * The number of structural features of the '<em>CANVAS COLOR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_COLOR_FEATURE_COUNT = COLOREABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl <em>COLOR SPEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCOLOR_SPEC()
   * @generated
   */
  int COLOR_SPEC = 14;

  /**
   * The feature id for the '<em><b>Red</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__RED = 0;

  /**
   * The feature id for the '<em><b>Green</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__GREEN = 1;

  /**
   * The feature id for the '<em><b>Blue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__BLUE = 2;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__ALPHA = 3;

  /**
   * The number of structural features of the '<em>COLOR SPEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SPECImpl <em>FONT SPEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SPECImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFONT_SPEC()
   * @generated
   */
  int FONT_SPEC = 15;

  /**
   * The number of structural features of the '<em>FONT SPEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SPEC_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SIZEImpl <em>FONT SIZE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SIZEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFONT_SIZE()
   * @generated
   */
  int FONT_SIZE = 16;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE__SIZE = FONT_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FONT SIZE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SIZE_FEATURE_COUNT = FONT_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FONT_STYLEImpl <em>FONT STYLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.FONT_STYLEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFONT_STYLE()
   * @generated
   */
  int FONT_STYLE = 17;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE__STYLE = FONT_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FONT STYLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_FEATURE_COUNT = FONT_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FontStyleValuesImpl <em>Font Style Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.FontStyleValuesImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFontStyleValues()
   * @generated
   */
  int FONT_STYLE_VALUES = 18;

  /**
   * The number of structural features of the '<em>Font Style Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_VALUES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CLEARImpl <em>CLEAR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.CLEARImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCLEAR()
   * @generated
   */
  int CLEAR = 19;

  /**
   * The number of structural features of the '<em>CLEAR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.HOMEImpl <em>HOME</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.HOMEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getHOME()
   * @generated
   */
  int HOME = 20;

  /**
   * The number of structural features of the '<em>HOME</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.DRAW_STRINGImpl <em>DRAW STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.DRAW_STRINGImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getDRAW_STRING()
   * @generated
   */
  int DRAW_STRING = 21;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAW_STRING__TEXT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DRAW STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAW_STRING_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.REFERENCIABLEImpl <em>REFERENCIABLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.REFERENCIABLEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getREFERENCIABLE()
   * @generated
   */
  int REFERENCIABLE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>REFERENCIABLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.MAKEImpl <em>MAKE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.MAKEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getMAKE()
   * @generated
   */
  int MAKE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE__NAME = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE__VALUE = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MAKE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.EXPRESSIONImpl <em>EXPRESSION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.EXPRESSIONImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getEXPRESSION()
   * @generated
   */
  int EXPRESSION = 25;

  /**
   * The number of structural features of the '<em>EXPRESSION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.VARIABLE_REFImpl <em>VARIABLE REF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.VARIABLE_REFImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getVARIABLE_REF()
   * @generated
   */
  int VARIABLE_REF = 24;

  /**
   * The feature id for the '<em><b>To Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__TO_VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>VARIABLE REF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.VALUEImpl <em>VALUE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.VALUEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getVALUE()
   * @generated
   */
  int VALUE = 26;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VAL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>VALUE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CONTENTImpl <em>CONTENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.CONTENTImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCONTENT()
   * @generated
   */
  int CONTENT = 27;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__VAR = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CONTENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl <em>OPERATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getOPERATION()
   * @generated
   */
  int OPERATION = 28;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TARGET_VARIABLE = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VAL_ONE = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VAL_TWO = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>OPERATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SUMImpl <em>SUM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.SUMImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSUM()
   * @generated
   */
  int SUM = 29;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>SUM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SUBTRACTImpl <em>SUBTRACT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.SUBTRACTImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSUBTRACT()
   * @generated
   */
  int SUBTRACT = 30;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>SUBTRACT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.MULTIPLYImpl <em>MULTIPLY</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.MULTIPLYImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getMULTIPLY()
   * @generated
   */
  int MULTIPLY = 31;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>MULTIPLY</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.DIVIDEImpl <em>DIVIDE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.DIVIDEImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getDIVIDE()
   * @generated
   */
  int DIVIDE = 32;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>DIVIDE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CONTROL_SENTENCESImpl <em>CONTROL SENTENCES</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.CONTROL_SENTENCESImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCONTROL_SENTENCES()
   * @generated
   */
  int CONTROL_SENTENCES = 33;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SENTENCES__COMMANDS = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CONTROL SENTENCES</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SENTENCES_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.REPEATImpl <em>REPEAT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.REPEATImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getREPEAT()
   * @generated
   */
  int REPEAT = 34;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__COMMANDS = CONTROL_SENTENCES__COMMANDS;

  /**
   * The feature id for the '<em><b>Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__TIMES = CONTROL_SENTENCES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>REPEAT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = CONTROL_SENTENCES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.TOImpl <em>TO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TOImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getTO()
   * @generated
   */
  int TO = 35;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__COMMANDS = CONTROL_SENTENCES__COMMANDS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__NAME = CONTROL_SENTENCES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__PARAMETERS = CONTROL_SENTENCES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_FEATURE_COUNT = CONTROL_SENTENCES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PARAMImpl <em>PARAM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.PARAMImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPARAM()
   * @generated
   */
  int PARAM = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = REFERENCIABLE__NAME;

  /**
   * The number of structural features of the '<em>PARAM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = REFERENCIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PROCEDURE_CALLImpl <em>PROCEDURE CALL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.PROCEDURE_CALLImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPROCEDURE_CALL()
   * @generated
   */
  int PROCEDURE_CALL = 37;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__TO = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__PARAMS = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PROCEDURE CALL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.IFImpl <em>IF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.IFImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getIF()
   * @generated
   */
  int IF = 38;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__COMMANDS = CONTROL_SENTENCES__COMMANDS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CONDITION = CONTROL_SENTENCES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = CONTROL_SENTENCES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.BOOLEAN_EXPRESSIONImpl <em>BOOLEAN EXPRESSION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.BOOLEAN_EXPRESSIONImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getBOOLEAN_EXPRESSION()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__OP1 = 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__OP2 = 1;

  /**
   * The number of structural features of the '<em>BOOLEAN EXPRESSION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.EQUALSImpl <em>EQUALS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.EQUALSImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getEQUALS()
   * @generated
   */
  int EQUALS = 40;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP1 = BOOLEAN_EXPRESSION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP2 = BOOLEAN_EXPRESSION__OP2;

  /**
   * The number of structural features of the '<em>EQUALS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.GREATER_THANImpl <em>GREATER THAN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.GREATER_THANImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getGREATER_THAN()
   * @generated
   */
  int GREATER_THAN = 41;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN__OP1 = BOOLEAN_EXPRESSION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN__OP2 = BOOLEAN_EXPRESSION__OP2;

  /**
   * The number of structural features of the '<em>GREATER THAN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.LESSER_THANImpl <em>LESSER THAN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.LESSER_THANImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getLESSER_THAN()
   * @generated
   */
  int LESSER_THAN = 42;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSER_THAN__OP1 = BOOLEAN_EXPRESSION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSER_THAN__OP2 = BOOLEAN_EXPRESSION__OP2;

  /**
   * The number of structural features of the '<em>LESSER THAN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSER_THAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.BOLDImpl <em>BOLD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.BOLDImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getBOLD()
   * @generated
   */
  int BOLD = 43;

  /**
   * The number of structural features of the '<em>BOLD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_FEATURE_COUNT = FONT_STYLE_VALUES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.ITALICImpl <em>ITALIC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.ITALICImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getITALIC()
   * @generated
   */
  int ITALIC = 44;

  /**
   * The number of structural features of the '<em>ITALIC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_FEATURE_COUNT = FONT_STYLE_VALUES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PLAINImpl <em>PLAIN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.PLAINImpl
   * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPLAIN()
   * @generated
   */
  int PLAIN = 45;

  /**
   * The number of structural features of the '<em>PLAIN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_FEATURE_COUNT = FONT_STYLE_VALUES_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.TortugaProgram <em>Tortuga Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tortuga Program</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaProgram
   * @generated
   */
  EClass getTortugaProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.paco.dsl.tortugaDSL.TortugaProgram#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaProgram#getSentences()
   * @see #getTortugaProgram()
   * @generated
   */
  EReference getTortugaProgram_Sentences();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.SENTENCE <em>SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SENTENCE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.SENTENCE
   * @generated
   */
  EClass getSENTENCE();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.MOVE <em>MOVE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MOVE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.MOVE
   * @generated
   */
  EClass getMOVE();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.MOVE#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Amount</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.MOVE#getAmount()
   * @see #getMOVE()
   * @generated
   */
  EReference getMOVE_Amount();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.FORWARD <em>FORWARD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FORWARD</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FORWARD
   * @generated
   */
  EClass getFORWARD();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.LEFT <em>LEFT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEFT</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.LEFT
   * @generated
   */
  EClass getLEFT();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.RIGHT <em>RIGHT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RIGHT</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.RIGHT
   * @generated
   */
  EClass getRIGHT();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.SET_X <em>SET X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SET X</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.SET_X
   * @generated
   */
  EClass getSET_X();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.SET_Y <em>SET Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SET Y</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.SET_Y
   * @generated
   */
  EClass getSET_Y();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.DRAWING_SENTENCE <em>DRAWING SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DRAWING SENTENCE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.DRAWING_SENTENCE
   * @generated
   */
  EClass getDRAWING_SENTENCE();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.PENDOWN <em>PENDOWN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PENDOWN</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PENDOWN
   * @generated
   */
  EClass getPENDOWN();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.PENUP <em>PENUP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PENUP</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PENUP
   * @generated
   */
  EClass getPENUP();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.COLOREABLE <em>COLOREABLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COLOREABLE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOREABLE
   * @generated
   */
  EClass getCOLOREABLE();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.paco.dsl.tortugaDSL.COLOREABLE#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOREABLE#getColor()
   * @see #getCOLOREABLE()
   * @generated
   */
  EAttribute getCOLOREABLE_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.COLOREABLE#getColorSpec <em>Color Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color Spec</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOREABLE#getColorSpec()
   * @see #getCOLOREABLE()
   * @generated
   */
  EReference getCOLOREABLE_ColorSpec();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.PENCOLOR <em>PENCOLOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PENCOLOR</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PENCOLOR
   * @generated
   */
  EClass getPENCOLOR();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.CANVAS_COLOR <em>CANVAS COLOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CANVAS COLOR</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.CANVAS_COLOR
   * @generated
   */
  EClass getCANVAS_COLOR();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC <em>COLOR SPEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COLOR SPEC</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC
   * @generated
   */
  EClass getCOLOR_SPEC();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Red</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getRed()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Red();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Green</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getGreen()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Green();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blue</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getBlue()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Blue();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC#getAlpha()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Alpha();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_SPEC <em>FONT SPEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONT SPEC</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FONT_SPEC
   * @generated
   */
  EClass getFONT_SPEC();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE <em>FONT SIZE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONT SIZE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE
   * @generated
   */
  EClass getFONT_SIZE();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE#getSize()
   * @see #getFONT_SIZE()
   * @generated
   */
  EReference getFONT_SIZE_Size();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE <em>FONT STYLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONT STYLE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE
   * @generated
   */
  EClass getFONT_STYLE();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE#getStyle()
   * @see #getFONT_STYLE()
   * @generated
   */
  EReference getFONT_STYLE_Style();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.FontStyleValues <em>Font Style Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style Values</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.FontStyleValues
   * @generated
   */
  EClass getFontStyleValues();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.CLEAR <em>CLEAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLEAR</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.CLEAR
   * @generated
   */
  EClass getCLEAR();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.HOME <em>HOME</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HOME</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.HOME
   * @generated
   */
  EClass getHOME();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING <em>DRAW STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DRAW STRING</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING
   * @generated
   */
  EClass getDRAW_STRING();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING#getText()
   * @see #getDRAW_STRING()
   * @generated
   */
  EAttribute getDRAW_STRING_Text();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.REFERENCIABLE <em>REFERENCIABLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REFERENCIABLE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.REFERENCIABLE
   * @generated
   */
  EClass getREFERENCIABLE();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.paco.dsl.tortugaDSL.REFERENCIABLE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.REFERENCIABLE#getName()
   * @see #getREFERENCIABLE()
   * @generated
   */
  EAttribute getREFERENCIABLE_Name();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.MAKE <em>MAKE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MAKE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.MAKE
   * @generated
   */
  EClass getMAKE();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.MAKE#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.MAKE#getValue()
   * @see #getMAKE()
   * @generated
   */
  EReference getMAKE_Value();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF <em>VARIABLE REF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VARIABLE REF</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF
   * @generated
   */
  EClass getVARIABLE_REF();

  /**
   * Returns the meta object for the reference '{@link org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF#getToVar <em>To Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Var</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF#getToVar()
   * @see #getVARIABLE_REF()
   * @generated
   */
  EReference getVARIABLE_REF_ToVar();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.EXPRESSION <em>EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPRESSION</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.EXPRESSION
   * @generated
   */
  EClass getEXPRESSION();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.VALUE <em>VALUE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VALUE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.VALUE
   * @generated
   */
  EClass getVALUE();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.paco.dsl.tortugaDSL.VALUE#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.VALUE#getVal()
   * @see #getVALUE()
   * @generated
   */
  EAttribute getVALUE_Val();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.CONTENT <em>CONTENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTENT</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.CONTENT
   * @generated
   */
  EClass getCONTENT();

  /**
   * Returns the meta object for the reference '{@link org.uqbar.paco.dsl.tortugaDSL.CONTENT#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.CONTENT#getVar()
   * @see #getCONTENT()
   * @generated
   */
  EReference getCONTENT_Var();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.OPERATION <em>OPERATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OPERATION</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.OPERATION
   * @generated
   */
  EClass getOPERATION();

  /**
   * Returns the meta object for the reference '{@link org.uqbar.paco.dsl.tortugaDSL.OPERATION#getTargetVariable <em>Target Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Variable</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.OPERATION#getTargetVariable()
   * @see #getOPERATION()
   * @generated
   */
  EReference getOPERATION_TargetVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.OPERATION#getValOne <em>Val One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val One</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.OPERATION#getValOne()
   * @see #getOPERATION()
   * @generated
   */
  EReference getOPERATION_ValOne();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.OPERATION#getValTwo <em>Val Two</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val Two</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.OPERATION#getValTwo()
   * @see #getOPERATION()
   * @generated
   */
  EReference getOPERATION_ValTwo();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.SUM <em>SUM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SUM</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.SUM
   * @generated
   */
  EClass getSUM();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.SUBTRACT <em>SUBTRACT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SUBTRACT</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.SUBTRACT
   * @generated
   */
  EClass getSUBTRACT();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.MULTIPLY <em>MULTIPLY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MULTIPLY</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.MULTIPLY
   * @generated
   */
  EClass getMULTIPLY();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.DIVIDE <em>DIVIDE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DIVIDE</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.DIVIDE
   * @generated
   */
  EClass getDIVIDE();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.CONTROL_SENTENCES <em>CONTROL SENTENCES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTROL SENTENCES</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.CONTROL_SENTENCES
   * @generated
   */
  EClass getCONTROL_SENTENCES();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.paco.dsl.tortugaDSL.CONTROL_SENTENCES#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.CONTROL_SENTENCES#getCommands()
   * @see #getCONTROL_SENTENCES()
   * @generated
   */
  EReference getCONTROL_SENTENCES_Commands();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.REPEAT <em>REPEAT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REPEAT</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.REPEAT
   * @generated
   */
  EClass getREPEAT();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.REPEAT#getTimes <em>Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Times</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.REPEAT#getTimes()
   * @see #getREPEAT()
   * @generated
   */
  EReference getREPEAT_Times();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.TO <em>TO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TO</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.TO
   * @generated
   */
  EClass getTO();

  /**
   * Returns the meta object for the attribute '{@link org.uqbar.paco.dsl.tortugaDSL.TO#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.TO#getName()
   * @see #getTO()
   * @generated
   */
  EAttribute getTO_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.paco.dsl.tortugaDSL.TO#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.TO#getParameters()
   * @see #getTO()
   * @generated
   */
  EReference getTO_Parameters();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.PARAM <em>PARAM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PARAM</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PARAM
   * @generated
   */
  EClass getPARAM();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL <em>PROCEDURE CALL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PROCEDURE CALL</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL
   * @generated
   */
  EClass getPROCEDURE_CALL();

  /**
   * Returns the meta object for the reference '{@link org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL#getTo()
   * @see #getPROCEDURE_CALL()
   * @generated
   */
  EReference getPROCEDURE_CALL_To();

  /**
   * Returns the meta object for the containment reference list '{@link org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PROCEDURE_CALL#getParams()
   * @see #getPROCEDURE_CALL()
   * @generated
   */
  EReference getPROCEDURE_CALL_Params();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.IF <em>IF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IF</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.IF
   * @generated
   */
  EClass getIF();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.IF#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.IF#getCondition()
   * @see #getIF()
   * @generated
   */
  EReference getIF_Condition();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION <em>BOOLEAN EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN EXPRESSION</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION
   * @generated
   */
  EClass getBOOLEAN_EXPRESSION();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION#getOp1()
   * @see #getBOOLEAN_EXPRESSION()
   * @generated
   */
  EReference getBOOLEAN_EXPRESSION_Op1();

  /**
   * Returns the meta object for the containment reference '{@link org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION#getOp2()
   * @see #getBOOLEAN_EXPRESSION()
   * @generated
   */
  EReference getBOOLEAN_EXPRESSION_Op2();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.EQUALS <em>EQUALS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EQUALS</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.EQUALS
   * @generated
   */
  EClass getEQUALS();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.GREATER_THAN <em>GREATER THAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GREATER THAN</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.GREATER_THAN
   * @generated
   */
  EClass getGREATER_THAN();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.LESSER_THAN <em>LESSER THAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LESSER THAN</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.LESSER_THAN
   * @generated
   */
  EClass getLESSER_THAN();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.BOLD <em>BOLD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOLD</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.BOLD
   * @generated
   */
  EClass getBOLD();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.ITALIC <em>ITALIC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ITALIC</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.ITALIC
   * @generated
   */
  EClass getITALIC();

  /**
   * Returns the meta object for class '{@link org.uqbar.paco.dsl.tortugaDSL.PLAIN <em>PLAIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PLAIN</em>'.
   * @see org.uqbar.paco.dsl.tortugaDSL.PLAIN
   * @generated
   */
  EClass getPLAIN();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TortugaDSLFactory getTortugaDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.TortugaProgramImpl <em>Tortuga Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaProgramImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getTortugaProgram()
     * @generated
     */
    EClass TORTUGA_PROGRAM = eINSTANCE.getTortugaProgram();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TORTUGA_PROGRAM__SENTENCES = eINSTANCE.getTortugaProgram_Sentences();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SENTENCEImpl <em>SENTENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.SENTENCEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSENTENCE()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSENTENCE();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.MOVEImpl <em>MOVE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.MOVEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getMOVE()
     * @generated
     */
    EClass MOVE = eINSTANCE.getMOVE();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVE__AMOUNT = eINSTANCE.getMOVE_Amount();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FORWARDImpl <em>FORWARD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.FORWARDImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFORWARD()
     * @generated
     */
    EClass FORWARD = eINSTANCE.getFORWARD();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.LEFTImpl <em>LEFT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.LEFTImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getLEFT()
     * @generated
     */
    EClass LEFT = eINSTANCE.getLEFT();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.RIGHTImpl <em>RIGHT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.RIGHTImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getRIGHT()
     * @generated
     */
    EClass RIGHT = eINSTANCE.getRIGHT();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SET_XImpl <em>SET X</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.SET_XImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSET_X()
     * @generated
     */
    EClass SET_X = eINSTANCE.getSET_X();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SET_YImpl <em>SET Y</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.SET_YImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSET_Y()
     * @generated
     */
    EClass SET_Y = eINSTANCE.getSET_Y();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.DRAWING_SENTENCEImpl <em>DRAWING SENTENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.DRAWING_SENTENCEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getDRAWING_SENTENCE()
     * @generated
     */
    EClass DRAWING_SENTENCE = eINSTANCE.getDRAWING_SENTENCE();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PENDOWNImpl <em>PENDOWN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.PENDOWNImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPENDOWN()
     * @generated
     */
    EClass PENDOWN = eINSTANCE.getPENDOWN();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PENUPImpl <em>PENUP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.PENUPImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPENUP()
     * @generated
     */
    EClass PENUP = eINSTANCE.getPENUP();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOREABLEImpl <em>COLOREABLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.COLOREABLEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCOLOREABLE()
     * @generated
     */
    EClass COLOREABLE = eINSTANCE.getCOLOREABLE();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOREABLE__COLOR = eINSTANCE.getCOLOREABLE_Color();

    /**
     * The meta object literal for the '<em><b>Color Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOREABLE__COLOR_SPEC = eINSTANCE.getCOLOREABLE_ColorSpec();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PENCOLORImpl <em>PENCOLOR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.PENCOLORImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPENCOLOR()
     * @generated
     */
    EClass PENCOLOR = eINSTANCE.getPENCOLOR();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CANVAS_COLORImpl <em>CANVAS COLOR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.CANVAS_COLORImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCANVAS_COLOR()
     * @generated
     */
    EClass CANVAS_COLOR = eINSTANCE.getCANVAS_COLOR();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl <em>COLOR SPEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCOLOR_SPEC()
     * @generated
     */
    EClass COLOR_SPEC = eINSTANCE.getCOLOR_SPEC();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__RED = eINSTANCE.getCOLOR_SPEC_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__GREEN = eINSTANCE.getCOLOR_SPEC_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__BLUE = eINSTANCE.getCOLOR_SPEC_Blue();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__ALPHA = eINSTANCE.getCOLOR_SPEC_Alpha();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SPECImpl <em>FONT SPEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SPECImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFONT_SPEC()
     * @generated
     */
    EClass FONT_SPEC = eINSTANCE.getFONT_SPEC();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SIZEImpl <em>FONT SIZE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.FONT_SIZEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFONT_SIZE()
     * @generated
     */
    EClass FONT_SIZE = eINSTANCE.getFONT_SIZE();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_SIZE__SIZE = eINSTANCE.getFONT_SIZE_Size();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FONT_STYLEImpl <em>FONT STYLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.FONT_STYLEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFONT_STYLE()
     * @generated
     */
    EClass FONT_STYLE = eINSTANCE.getFONT_STYLE();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_STYLE__STYLE = eINSTANCE.getFONT_STYLE_Style();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.FontStyleValuesImpl <em>Font Style Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.FontStyleValuesImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getFontStyleValues()
     * @generated
     */
    EClass FONT_STYLE_VALUES = eINSTANCE.getFontStyleValues();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CLEARImpl <em>CLEAR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.CLEARImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCLEAR()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getCLEAR();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.HOMEImpl <em>HOME</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.HOMEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getHOME()
     * @generated
     */
    EClass HOME = eINSTANCE.getHOME();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.DRAW_STRINGImpl <em>DRAW STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.DRAW_STRINGImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getDRAW_STRING()
     * @generated
     */
    EClass DRAW_STRING = eINSTANCE.getDRAW_STRING();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRAW_STRING__TEXT = eINSTANCE.getDRAW_STRING_Text();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.REFERENCIABLEImpl <em>REFERENCIABLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.REFERENCIABLEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getREFERENCIABLE()
     * @generated
     */
    EClass REFERENCIABLE = eINSTANCE.getREFERENCIABLE();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCIABLE__NAME = eINSTANCE.getREFERENCIABLE_Name();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.MAKEImpl <em>MAKE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.MAKEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getMAKE()
     * @generated
     */
    EClass MAKE = eINSTANCE.getMAKE();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAKE__VALUE = eINSTANCE.getMAKE_Value();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.VARIABLE_REFImpl <em>VARIABLE REF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.VARIABLE_REFImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getVARIABLE_REF()
     * @generated
     */
    EClass VARIABLE_REF = eINSTANCE.getVARIABLE_REF();

    /**
     * The meta object literal for the '<em><b>To Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF__TO_VAR = eINSTANCE.getVARIABLE_REF_ToVar();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.EXPRESSIONImpl <em>EXPRESSION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.EXPRESSIONImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getEXPRESSION()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getEXPRESSION();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.VALUEImpl <em>VALUE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.VALUEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getVALUE()
     * @generated
     */
    EClass VALUE = eINSTANCE.getVALUE();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__VAL = eINSTANCE.getVALUE_Val();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CONTENTImpl <em>CONTENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.CONTENTImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCONTENT()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getCONTENT();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__VAR = eINSTANCE.getCONTENT_Var();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl <em>OPERATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getOPERATION()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOPERATION();

    /**
     * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TARGET_VARIABLE = eINSTANCE.getOPERATION_TargetVariable();

    /**
     * The meta object literal for the '<em><b>Val One</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__VAL_ONE = eINSTANCE.getOPERATION_ValOne();

    /**
     * The meta object literal for the '<em><b>Val Two</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__VAL_TWO = eINSTANCE.getOPERATION_ValTwo();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SUMImpl <em>SUM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.SUMImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSUM()
     * @generated
     */
    EClass SUM = eINSTANCE.getSUM();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.SUBTRACTImpl <em>SUBTRACT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.SUBTRACTImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getSUBTRACT()
     * @generated
     */
    EClass SUBTRACT = eINSTANCE.getSUBTRACT();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.MULTIPLYImpl <em>MULTIPLY</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.MULTIPLYImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getMULTIPLY()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMULTIPLY();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.DIVIDEImpl <em>DIVIDE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.DIVIDEImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getDIVIDE()
     * @generated
     */
    EClass DIVIDE = eINSTANCE.getDIVIDE();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.CONTROL_SENTENCESImpl <em>CONTROL SENTENCES</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.CONTROL_SENTENCESImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getCONTROL_SENTENCES()
     * @generated
     */
    EClass CONTROL_SENTENCES = eINSTANCE.getCONTROL_SENTENCES();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SENTENCES__COMMANDS = eINSTANCE.getCONTROL_SENTENCES_Commands();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.REPEATImpl <em>REPEAT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.REPEATImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getREPEAT()
     * @generated
     */
    EClass REPEAT = eINSTANCE.getREPEAT();

    /**
     * The meta object literal for the '<em><b>Times</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__TIMES = eINSTANCE.getREPEAT_Times();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.TOImpl <em>TO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TOImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getTO()
     * @generated
     */
    EClass TO = eINSTANCE.getTO();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TO__NAME = eINSTANCE.getTO_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TO__PARAMETERS = eINSTANCE.getTO_Parameters();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PARAMImpl <em>PARAM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.PARAMImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPARAM()
     * @generated
     */
    EClass PARAM = eINSTANCE.getPARAM();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PROCEDURE_CALLImpl <em>PROCEDURE CALL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.PROCEDURE_CALLImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPROCEDURE_CALL()
     * @generated
     */
    EClass PROCEDURE_CALL = eINSTANCE.getPROCEDURE_CALL();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__TO = eINSTANCE.getPROCEDURE_CALL_To();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__PARAMS = eINSTANCE.getPROCEDURE_CALL_Params();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.IFImpl <em>IF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.IFImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getIF()
     * @generated
     */
    EClass IF = eINSTANCE.getIF();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__CONDITION = eINSTANCE.getIF_Condition();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.BOOLEAN_EXPRESSIONImpl <em>BOOLEAN EXPRESSION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.BOOLEAN_EXPRESSIONImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getBOOLEAN_EXPRESSION()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBOOLEAN_EXPRESSION();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__OP1 = eINSTANCE.getBOOLEAN_EXPRESSION_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__OP2 = eINSTANCE.getBOOLEAN_EXPRESSION_Op2();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.EQUALSImpl <em>EQUALS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.EQUALSImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getEQUALS()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEQUALS();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.GREATER_THANImpl <em>GREATER THAN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.GREATER_THANImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getGREATER_THAN()
     * @generated
     */
    EClass GREATER_THAN = eINSTANCE.getGREATER_THAN();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.LESSER_THANImpl <em>LESSER THAN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.LESSER_THANImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getLESSER_THAN()
     * @generated
     */
    EClass LESSER_THAN = eINSTANCE.getLESSER_THAN();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.BOLDImpl <em>BOLD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.BOLDImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getBOLD()
     * @generated
     */
    EClass BOLD = eINSTANCE.getBOLD();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.ITALICImpl <em>ITALIC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.ITALICImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getITALIC()
     * @generated
     */
    EClass ITALIC = eINSTANCE.getITALIC();

    /**
     * The meta object literal for the '{@link org.uqbar.paco.dsl.tortugaDSL.impl.PLAINImpl <em>PLAIN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.PLAINImpl
     * @see org.uqbar.paco.dsl.tortugaDSL.impl.TortugaDSLPackageImpl#getPLAIN()
     * @generated
     */
    EClass PLAIN = eINSTANCE.getPLAIN();

  }

} //TortugaDSLPackage
