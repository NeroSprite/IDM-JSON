/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Remove;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RemoveImpl#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.RemoveImpl#getNameObjectRemove <em>Name Object Remove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveImpl extends CommandesImpl implements Remove
{
  /**
   * The default value of the '{@link #getTargetNode() <em>Target Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNode()
   * @generated
   * @ordered
   */
  protected static final String TARGET_NODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNode()
   * @generated
   * @ordered
   */
  protected String targetNode = TARGET_NODE_EDEFAULT;

  /**
   * The default value of the '{@link #getNameObjectRemove() <em>Name Object Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameObjectRemove()
   * @generated
   * @ordered
   */
  protected static final String NAME_OBJECT_REMOVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameObjectRemove() <em>Name Object Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameObjectRemove()
   * @generated
   * @ordered
   */
  protected String nameObjectRemove = NAME_OBJECT_REMOVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemoveImpl()
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
    return MyDslPackage.Literals.REMOVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTargetNode()
  {
    return targetNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargetNode(String newTargetNode)
  {
    String oldTargetNode = targetNode;
    targetNode = newTargetNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REMOVE__TARGET_NODE, oldTargetNode, targetNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameObjectRemove()
  {
    return nameObjectRemove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameObjectRemove(String newNameObjectRemove)
  {
    String oldNameObjectRemove = nameObjectRemove;
    nameObjectRemove = newNameObjectRemove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.REMOVE__NAME_OBJECT_REMOVE, oldNameObjectRemove, nameObjectRemove));
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
      case MyDslPackage.REMOVE__TARGET_NODE:
        return getTargetNode();
      case MyDslPackage.REMOVE__NAME_OBJECT_REMOVE:
        return getNameObjectRemove();
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
      case MyDslPackage.REMOVE__TARGET_NODE:
        setTargetNode((String)newValue);
        return;
      case MyDslPackage.REMOVE__NAME_OBJECT_REMOVE:
        setNameObjectRemove((String)newValue);
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
      case MyDslPackage.REMOVE__TARGET_NODE:
        setTargetNode(TARGET_NODE_EDEFAULT);
        return;
      case MyDslPackage.REMOVE__NAME_OBJECT_REMOVE:
        setNameObjectRemove(NAME_OBJECT_REMOVE_EDEFAULT);
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
      case MyDslPackage.REMOVE__TARGET_NODE:
        return TARGET_NODE_EDEFAULT == null ? targetNode != null : !TARGET_NODE_EDEFAULT.equals(targetNode);
      case MyDslPackage.REMOVE__NAME_OBJECT_REMOVE:
        return NAME_OBJECT_REMOVE_EDEFAULT == null ? nameObjectRemove != null : !NAME_OBJECT_REMOVE_EDEFAULT.equals(nameObjectRemove);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (targetNode: ");
    result.append(targetNode);
    result.append(", nameObjectRemove: ");
    result.append(nameObjectRemove);
    result.append(')');
    return result.toString();
  }

} //RemoveImpl
