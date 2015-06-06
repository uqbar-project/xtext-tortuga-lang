/**
 */
package org.uqbar.paco.dsl.tortugaDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REPEAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.REPEAT#getTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getREPEAT()
 * @model
 * @generated
 */
public interface REPEAT extends CONTROL_SENTENCES
{
  /**
   * Returns the value of the '<em><b>Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Times</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Times</em>' containment reference.
   * @see #setTimes(EXPRESSION)
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getREPEAT_Times()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getTimes();

  /**
   * Sets the value of the '{@link org.uqbar.paco.dsl.tortugaDSL.REPEAT#getTimes <em>Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Times</em>' containment reference.
   * @see #getTimes()
   * @generated
   */
  void setTimes(EXPRESSION value);

} // REPEAT
