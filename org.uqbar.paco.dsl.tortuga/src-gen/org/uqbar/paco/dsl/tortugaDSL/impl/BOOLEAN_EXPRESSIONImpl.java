/**
 */
package org.uqbar.paco.dsl.tortugaDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.uqbar.paco.dsl.tortugaDSL.BOOLEAN_EXPRESSION;
import org.uqbar.paco.dsl.tortugaDSL.EXPRESSION;
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOOLEAN EXPRESSION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.BOOLEAN_EXPRESSIONImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.BOOLEAN_EXPRESSIONImpl#getOp2 <em>Op2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BOOLEAN_EXPRESSIONImpl extends MinimalEObjectImpl.Container implements BOOLEAN_EXPRESSION
{
  /**
   * The cached value of the '{@link #getOp1() <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp1()
   * @generated
   * @ordered
   */
  protected EXPRESSION op1;

  /**
   * The cached value of the '{@link #getOp2() <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp2()
   * @generated
   * @ordered
   */
  protected EXPRESSION op2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BOOLEAN_EXPRESSIONImpl()
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
    return TortugaDSLPackage.Literals.BOOLEAN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getOp1()
  {
    return op1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp1(EXPRESSION newOp1, NotificationChain msgs)
  {
    EXPRESSION oldOp1 = op1;
    op1 = newOp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1, oldOp1, newOp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp1(EXPRESSION newOp1)
  {
    if (newOp1 != op1)
    {
      NotificationChain msgs = null;
      if (op1 != null)
        msgs = ((InternalEObject)op1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1, null, msgs);
      if (newOp1 != null)
        msgs = ((InternalEObject)newOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1, null, msgs);
      msgs = basicSetOp1(newOp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1, newOp1, newOp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getOp2()
  {
    return op2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp2(EXPRESSION newOp2, NotificationChain msgs)
  {
    EXPRESSION oldOp2 = op2;
    op2 = newOp2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2, oldOp2, newOp2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp2(EXPRESSION newOp2)
  {
    if (newOp2 != op2)
    {
      NotificationChain msgs = null;
      if (op2 != null)
        msgs = ((InternalEObject)op2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2, null, msgs);
      if (newOp2 != null)
        msgs = ((InternalEObject)newOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2, null, msgs);
      msgs = basicSetOp2(newOp2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2, newOp2, newOp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1:
        return basicSetOp1(null, msgs);
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2:
        return basicSetOp2(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1:
        return getOp1();
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2:
        return getOp2();
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
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1:
        setOp1((EXPRESSION)newValue);
        return;
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2:
        setOp2((EXPRESSION)newValue);
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
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1:
        setOp1((EXPRESSION)null);
        return;
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2:
        setOp2((EXPRESSION)null);
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
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP1:
        return op1 != null;
      case TortugaDSLPackage.BOOLEAN_EXPRESSION__OP2:
        return op2 != null;
    }
    return super.eIsSet(featureID);
  }

} //BOOLEAN_EXPRESSIONImpl
