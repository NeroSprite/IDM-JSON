/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Modify#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Modify#getNameObjectRemove <em>Name Object Remove</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Modify#getNameObject <em>Name Object</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModify()
 * @model
 * @generated
 */
public interface Modify extends Commandes
{
  /**
   * Returns the value of the '<em><b>Target Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Node</em>' attribute.
   * @see #setTargetNode(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModify_TargetNode()
   * @model
   * @generated
   */
  String getTargetNode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Modify#getTargetNode <em>Target Node</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Node</em>' attribute.
   * @see #getTargetNode()
   * @generated
   */
  void setTargetNode(String value);

  /**
   * Returns the value of the '<em><b>Name Object Remove</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Object Remove</em>' attribute.
   * @see #setNameObjectRemove(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModify_NameObjectRemove()
   * @model
   * @generated
   */
  String getNameObjectRemove();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Modify#getNameObjectRemove <em>Name Object Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Object Remove</em>' attribute.
   * @see #getNameObjectRemove()
   * @generated
   */
  void setNameObjectRemove(String value);

  /**
   * Returns the value of the '<em><b>Name Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Object</em>' attribute.
   * @see #setNameObject(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getModify_NameObject()
   * @model
   * @generated
   */
  String getNameObject();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Modify#getNameObject <em>Name Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Object</em>' attribute.
   * @see #getNameObject()
   * @generated
   */
  void setNameObject(String value);

} // Modify
