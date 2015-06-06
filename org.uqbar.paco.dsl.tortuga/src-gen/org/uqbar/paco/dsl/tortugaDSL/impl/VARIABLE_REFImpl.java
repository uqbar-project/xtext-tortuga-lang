/**
 */
package org.uqbar.paco.dsl.tortugaDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.uqbar.paco.dsl.tortugaDSL.REFERENCIABLE;
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage;
import org.uqbar.paco.dsl.tortugaDSL.VARIABLE_REF;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VARIABLE REF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.VARIABLE_REFImpl#getToVar <em>To Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VARIABLE_REFImpl extends EXPRESSIONImpl implements VARIABLE_REF
{
  /**
   * The cached value of the '{@link #getToVar() <em>To Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToVar()
   * @generated
   * @ordered
   */
  protected REFERENCIABLE toVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VARIABLE_REFImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TortugaDSLPackage.Literals.VARIABLE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REFERENCIABLE getToVar()
  {
    if (toVar != null && toVar.eIsProxy())
    {
      InternalEObject oldToVar = (InternalEObject)toVar;
      toVar = (REFERENCIABLE)eResolveProxy(oldToVar);
      if (toVar != oldToVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TortugaDSLPackage.VARIABLE_REF__TO_VAR, oldToVar, toVar));
      }
    }
    return toVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REFERENCIABLE basicGetToVar()
  {
    return toVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToVar(REFERENCIABLE newToVar)
  {
    REFERENCIABLE oldToVar = toVar;
    toVar = newToVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.VARIABLE_REF__TO_VAR, oldToVar, toVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TortugaDSLPackage.VARIABLE_REF__TO_VAR:
        if (resolve) return getToVar();
        return basicGetToVar();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TortugaDSLPackage.VARIABLE_REF__TO_VAR:
        setToVar((REFERENCIABLE)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TortugaDSLPackage.VARIABLE_REF__TO_VAR:
        setToVar((REFERENCIABLE)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TortugaDSLPackage.VARIABLE_REF__TO_VAR:
        return toVar != null;
    }
    return super.eIsSet(featureID);
  }

} //VARIABLE_REFImpl
