/**
 */
package org.uqbar.paco.dsl.tortugaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FONT SIZE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getFONT_SIZE()
 * @model
 * @generated
 */
public interface FONT_SIZE extends FONT_SPEC
{
  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(EXPRESSION)
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getFONT_SIZE_Size()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getSize();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.tortugaDSL.FONT_SIZE#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(EXPRESSION value);

} // FONT_SIZE
