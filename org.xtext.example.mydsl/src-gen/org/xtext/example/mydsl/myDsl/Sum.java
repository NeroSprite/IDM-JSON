/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sum#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sum#getListInterger <em>List Interger</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends JSonObject, JSonAttribut, JSonEnumField, JSonOperator
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSum_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Sum#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>List Interger</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.JSonOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Interger</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSum_ListInterger()
   * @model containment="true"
   * @generated
   */
  EList<JSonOperator> getListInterger();

} // Sum
