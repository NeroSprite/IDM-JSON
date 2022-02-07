/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Remove#getTargetNode <em>Target Node</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Remove#getNameObjectRemove <em>Name Object Remove</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRemove()
 * @model
 * @generated
 */
public interface Remove extends Commandes
{
  /**
   * Returns the value of the '<em><b>Target Node</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Node</em>' attribute.
   * @see #setTargetNode(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRemove_TargetNode()
   * @model
   * @generated
   */
  String getTargetNode();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Remove#getTargetNode <em>Target Node</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRemove_NameObjectRemove()
   * @model
   * @generated
   */
  String getNameObjectRemove();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Remove#getNameObjectRemove <em>Name Object Remove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Object Remove</em>' attribute.
   * @see #getNameObjectRemove()
   * @generated
   */
  void setNameObjectRemove(String value);

} // Remove
