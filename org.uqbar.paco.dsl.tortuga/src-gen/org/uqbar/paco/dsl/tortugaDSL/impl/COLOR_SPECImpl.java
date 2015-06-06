/**
 */
package org.uqbar.paco.dsl.tortugaDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.uqbar.paco.dsl.tortugaDSL.COLOR_SPEC;
import org.uqbar.paco.dsl.tortugaDSL.EXPRESSION;
import org.uqbar.paco.dsl.tortugaDSL.TortugaDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COLOR SPEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.uqbar.paco.dsl.tortugaDSL.impl.COLOR_SPECImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class COLOR_SPECImpl extends MinimalEObjectImpl.Container implements COLOR_SPEC
{
  /**
   * The cached value of the '{@link #getRed() <em>Red</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRed()
   * @generated
   * @ordered
   */
  protected EXPRESSION red;

  /**
   * The cached value of the '{@link #getGreen() <em>Green</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreen()
   * @generated
   * @ordered
   */
  protected EXPRESSION green;

  /**
   * The cached value of the '{@link #getBlue() <em>Blue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlue()
   * @generated
   * @ordered
   */
  protected EXPRESSION blue;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected EXPRESSION alpha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected COLOR_SPECImpl()
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
    return TortugaDSLPackage.Literals.COLOR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getRed()
  {
    return red;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRed(EXPRESSION newRed, NotificationChain msgs)
  {
    EXPRESSION oldRed = red;
    red = newRed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__RED, oldRed, newRed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRed(EXPRESSION newRed)
  {
    if (newRed != red)
    {
      NotificationChain msgs = null;
      if (red != null)
        msgs = ((InternalEObject)red).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__RED, null, msgs);
      if (newRed != null)
        msgs = ((InternalEObject)newRed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__RED, null, msgs);
      msgs = basicSetRed(newRed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__RED, newRed, newRed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getGreen()
  {
    return green;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGreen(EXPRESSION newGreen, NotificationChain msgs)
  {
    EXPRESSION oldGreen = green;
    green = newGreen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__GREEN, oldGreen, newGreen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreen(EXPRESSION newGreen)
  {
    if (newGreen != green)
    {
      NotificationChain msgs = null;
      if (green != null)
        msgs = ((InternalEObject)green).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__GREEN, null, msgs);
      if (newGreen != null)
        msgs = ((InternalEObject)newGreen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__GREEN, null, msgs);
      msgs = basicSetGreen(newGreen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__GREEN, newGreen, newGreen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getBlue()
  {
    return blue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlue(EXPRESSION newBlue, NotificationChain msgs)
  {
    EXPRESSION oldBlue = blue;
    blue = newBlue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__BLUE, oldBlue, newBlue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlue(EXPRESSION newBlue)
  {
    if (newBlue != blue)
    {
      NotificationChain msgs = null;
      if (blue != null)
        msgs = ((InternalEObject)blue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__BLUE, null, msgs);
      if (newBlue != null)
        msgs = ((InternalEObject)newBlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__BLUE, null, msgs);
      msgs = basicSetBlue(newBlue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__BLUE, newBlue, newBlue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlpha(EXPRESSION newAlpha, NotificationChain msgs)
  {
    EXPRESSION oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__ALPHA, oldAlpha, newAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(EXPRESSION newAlpha)
  {
    if (newAlpha != alpha)
    {
      NotificationChain msgs = null;
      if (alpha != null)
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TortugaDSLPackage.COLOR_SPEC__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TortugaDSLPackage.COLOR_SPEC__ALPHA, newAlpha, newAlpha));
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
      case TortugaDSLPackage.COLOR_SPEC__RED:
        return basicSetRed(null, msgs);
      case TortugaDSLPackage.COLOR_SPEC__GREEN:
        return basicSetGreen(null, msgs);
      case TortugaDSLPackage.COLOR_SPEC__BLUE:
        return basicSetBlue(null, msgs);
      case TortugaDSLPackage.COLOR_SPEC__ALPHA:
        return basicSetAlpha(null, msgs);
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
      case TortugaDSLPackage.COLOR_SPEC__RED:
        return getRed();
      case TortugaDSLPackage.COLOR_SPEC__GREEN:
        return getGreen();
      case TortugaDSLPackage.COLOR_SPEC__BLUE:
        return getBlue();
      case TortugaDSLPackage.COLOR_SPEC__ALPHA:
        return getAlpha();
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
      case TortugaDSLPackage.COLOR_SPEC__RED:
        setRed((EXPRESSION)newValue);
        return;
      case TortugaDSLPackage.COLOR_SPEC__GREEN:
        setGreen((EXPRESSION)newValue);
        return;
      case TortugaDSLPackage.COLOR_SPEC__BLUE:
        setBlue((EXPRESSION)newValue);
        return;
      case TortugaDSLPackage.COLOR_SPEC__ALPHA:
        setAlpha((EXPRESSION)newValue);
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
      case TortugaDSLPackage.COLOR_SPEC__RED:
        setRed((EXPRESSION)null);
        return;
      case TortugaDSLPackage.COLOR_SPEC__GREEN:
        setGreen((EXPRESSION)null);
        return;
      case TortugaDSLPackage.COLOR_SPEC__BLUE:
        setBlue((EXPRESSION)null);
        return;
      case TortugaDSLPackage.COLOR_SPEC__ALPHA:
        setAlpha((EXPRESSION)null);
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
      case TortugaDSLPackage.COLOR_SPEC__RED:
        return red != null;
      case TortugaDSLPackage.COLOR_SPEC__GREEN:
        return green != null;
      case TortugaDSLPackage.COLOR_SPEC__BLUE:
        return blue != null;
      case TortugaDSLPackage.COLOR_SPEC__ALPHA:
        return alpha != null;
    }
    return super.eIsSet(featureID);
  }

} //COLOR_SPECImpl
