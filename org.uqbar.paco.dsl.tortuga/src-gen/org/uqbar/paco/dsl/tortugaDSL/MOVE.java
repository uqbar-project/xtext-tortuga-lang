/**
 */
package org.uqbar.paco.dsl.tortugaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOVE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.MOVE#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getMOVE()
 * @model
 * @generated
 */
public interface MOVE extends SENTENCE
{
  /**
   * Returns the value of the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' containment reference.
   * @see #setAmount(EXPRESSION)
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getMOVE_Amount()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getAmount();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.tortugaDSL.MOVE#getAmount <em>Amount</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' containment reference.
   * @see #getAmount()
   * @generated
   */
  void setAmount(EXPRESSION value);

} // MOVE
