/**
 */
package org.uqbar.paco.dsl.tortugaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DRAW STRING</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getDRAW_STRING()
 * @model
 * @generated
 */
public interface DRAW_STRING extends DRAWING_SENTENCE
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getDRAW_STRING_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.tortugaDSL.DRAW_STRING#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // DRAW_STRING
