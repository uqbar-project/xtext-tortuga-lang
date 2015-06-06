/**
 */
package org.uqbar.paco.dsl.tortugaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FONT STYLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getFONT_STYLE()
 * @model
 * @generated
 */
public interface FONT_STYLE extends FONT_SPEC
{
  /**
   * Returns the value of the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' containment reference.
   * @see #setStyle(FontStyleValues)
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getFONT_STYLE_Style()
   * @model containment="true"
   * @generated
   */
  FontStyleValues getStyle();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_STYLE#getStyle <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' containment reference.
   * @see #getStyle()
   * @generated
   */
  void setStyle(FontStyleValues value);

} // FONT_STYLE
