/**
 * generated by Xtext 2.25.0
 */
package fr.istic.idm.group10.jsondsl.myDsl.impl;

import fr.istic.idm.group10.jsondsl.myDsl.Display;
import fr.istic.idm.group10.jsondsl.myDsl.JSonFile;
import fr.istic.idm.group10.jsondsl.myDsl.JSonObject;
import fr.istic.idm.group10.jsondsl.myDsl.MyDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.istic.idm.group10.jsondsl.myDsl.impl.DisplayImpl#getJsonfile <em>Jsonfile</em>}</li>
 *   <li>{@link fr.istic.idm.group10.jsondsl.myDsl.impl.DisplayImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends MinimalEObjectImpl.Container implements Display
{
  /**
   * The cached value of the '{@link #getJsonfile() <em>Jsonfile</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonfile()
   * @generated
   * @ordered
   */
  protected EList<JSonFile> jsonfile;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected JSonObject node;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DisplayImpl()
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
    return MyDslPackage.Literals.DISPLAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<JSonFile> getJsonfile()
  {
    if (jsonfile == null)
    {
      jsonfile = new EObjectResolvingEList<JSonFile>(JSonFile.class, this, MyDslPackage.DISPLAY__JSONFILE);
    }
    return jsonfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JSonObject getNode()
  {
    if (node != null && node.eIsProxy())
    {
      InternalEObject oldNode = (InternalEObject)node;
      node = (JSonObject)eResolveProxy(oldNode);
      if (node != oldNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.DISPLAY__NODE, oldNode, node));
      }
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSonObject basicGetNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNode(JSonObject newNode)
  {
    JSonObject oldNode = node;
    node = newNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DISPLAY__NODE, oldNode, node));
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
      case MyDslPackage.DISPLAY__JSONFILE:
        return getJsonfile();
      case MyDslPackage.DISPLAY__NODE:
        if (resolve) return getNode();
        return basicGetNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.DISPLAY__JSONFILE:
        getJsonfile().clear();
        getJsonfile().addAll((Collection<? extends JSonFile>)newValue);
        return;
      case MyDslPackage.DISPLAY__NODE:
        setNode((JSonObject)newValue);
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
      case MyDslPackage.DISPLAY__JSONFILE:
        getJsonfile().clear();
        return;
      case MyDslPackage.DISPLAY__NODE:
        setNode((JSonObject)null);
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
      case MyDslPackage.DISPLAY__JSONFILE:
        return jsonfile != null && !jsonfile.isEmpty();
      case MyDslPackage.DISPLAY__NODE:
        return node != null;
    }
    return super.eIsSet(featureID);
  }

} //DisplayImpl
