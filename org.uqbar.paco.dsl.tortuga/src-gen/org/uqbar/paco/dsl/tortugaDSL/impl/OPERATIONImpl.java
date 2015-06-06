/**
 */
package org.uqbar.paco.dsl.tortugaDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.uqbar.paco.dsl.tortugaDSL.EXPRESSION;
import org.uqbar.paco.dsl.tortugaDSL.MAKE;
import org.uqbar.paco.dsl.tortugaDSL.OPERATION;
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPERATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl#getValOne <em>Val One</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.OPERATIONImpl#getValTwo <em>Val Two</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPERATIONImpl extends SENTENCEImpl implements OPERATION
{
  /**
   * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetVariable()
   * @generated
   * @ordered
   */
  protected MAKE targetVariable;

  /**
   * The cached value of the '{@link #getValOne() <em>Val One</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValOne()
   * @generated
   * @ordered
   */
  protected EXPRESSION valOne;

  /**
   * The cached value of the '{@link #getValTwo() <em>Val Two</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValTwo()
   * @generated
   * @ordered
   */
  protected EXPRESSION valTwo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OPERATIONImpl()
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
    return TortugaDSLPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAKE getTargetVariable()
  {
    if (targetVariable != null && targetVariable.eIsProxy())
    {
      InternalEObject oldTargetVariable = (InternalEObject)targetVariable;
      targetVariable = (MAKE)eResolveProxy(oldTargetVariable);
      if (targetVariable != oldTargetVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TortugaDSLPackage.OPERATION__TARGET_VARIABLE, oldTargetVariable, targetVariable));
      }
    }
    return targetVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAKE basicGetTargetVariable()
  {
    return targetVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetVariable(MAKE newTargetVariable)
  {
    MAKE oldTargetVariable = targetVariable;
    targetVariable = newTargetVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.OPERATION__TARGET_VARIABLE, oldTargetVariable, targetVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getValOne()
  {
    return valOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValOne(EXPRESSION newValOne, NotificationChain msgs)
  {
    EXPRESSION oldValOne = valOne;
    valOne = newValOne;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.OPERATION__VAL_ONE, oldValOne, newValOne);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValOne(EXPRESSION newValOne)
  {
    if (newValOne != valOne)
    {
      NotificationChain msgs = null;
      if (valOne != null)
        msgs = ((InternalEObject)valOne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.OPERATION__VAL_ONE, null, msgs);
      if (newValOne != null)
        msgs = ((InternalEObject)newValOne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.OPERATION__VAL_ONE, null, msgs);
      msgs = basicSetValOne(newValOne, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.OPERATION__VAL_ONE, newValOne, newValOne));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getValTwo()
  {
    return valTwo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValTwo(EXPRESSION newValTwo, NotificationChain msgs)
  {
    EXPRESSION oldValTwo = valTwo;
    valTwo = newValTwo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.OPERATION__VAL_TWO, oldValTwo, newValTwo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValTwo(EXPRESSION newValTwo)
  {
    if (newValTwo != valTwo)
    {
      NotificationChain msgs = null;
      if (valTwo != null)
        msgs = ((InternalEObject)valTwo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.OPERATION__VAL_TWO, null, msgs);
      if (newValTwo != null)
        msgs = ((InternalEObject)newValTwo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.OPERATION__VAL_TWO, null, msgs);
      msgs = basicSetValTwo(newValTwo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.OPERATION__VAL_TWO, newValTwo, newValTwo));
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
      case TortugaDSLPackage.OPERATION__VAL_ONE:
        return basicSetValOne(null, msgs);
      case TortugaDSLPackage.OPERATION__VAL_TWO:
        return basicSetValTwo(null, msgs);
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
      case TortugaDSLPackage.OPERATION__TARGET_VARIABLE:
        if (resolve) return getTargetVariable();
        return basicGetTargetVariable();
      case TortugaDSLPackage.OPERATION__VAL_ONE:
        return getValOne();
      case TortugaDSLPackage.OPERATION__VAL_TWO:
        return getValTwo();
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
      case TortugaDSLPackage.OPERATION__TARGET_VARIABLE:
        setTargetVariable((MAKE)newValue);
        return;
      case TortugaDSLPackage.OPERATION__VAL_ONE:
        setValOne((EXPRESSION)newValue);
        return;
      case TortugaDSLPackage.OPERATION__VAL_TWO:
        setValTwo((EXPRESSION)newValue);
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
      case TortugaDSLPackage.OPERATION__TARGET_VARIABLE:
        setTargetVariable((MAKE)null);
        return;
      case TortugaDSLPackage.OPERATION__VAL_ONE:
        setValOne((EXPRESSION)null);
        return;
      case TortugaDSLPackage.OPERATION__VAL_TWO:
        setValTwo((EXPRESSION)null);
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
      case TortugaDSLPackage.OPERATION__TARGET_VARIABLE:
        return targetVariable != null;
      case TortugaDSLPackage.OPERATION__VAL_ONE:
        return valOne != null;
      case TortugaDSLPackage.OPERATION__VAL_TWO:
        return valTwo != null;
    }
    return super.eIsSet(featureID);
  }

} //OPERATIONImpl
