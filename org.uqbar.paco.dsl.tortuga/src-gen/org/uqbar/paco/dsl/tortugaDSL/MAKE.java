/**
 */
package org.uqbar.paco.dsl.tortugaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAKE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.MAKE#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getMAKE()
 * @model
 * @generated
 */
public interface MAKE extends SENTENCE, REFERENCIABLE
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(EXPRESSION)
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getMAKE_Value()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getValue();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.tortugaDSL.MAKE#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EXPRESSION value);

} // MAKE
