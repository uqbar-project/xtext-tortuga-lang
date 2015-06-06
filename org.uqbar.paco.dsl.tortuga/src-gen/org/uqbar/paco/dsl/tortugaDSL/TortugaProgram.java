/**
 */
package org.uqbar.paco.dsl.tortugaDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tortuga Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.TortugaProgram#getSentences <em>Sentences</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getTortugaProgram()
 * @model
 * @generated
 */
public interface TortugaProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link org.uqbar.paco.dsl.tortugaDSL.SENTENCE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage#getTortugaProgram_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<SENTENCE> getSentences();

} // TortugaProgram
