/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.JsonArray#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.JsonArray#getContient <em>Contient</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getJsonArray()
 * @model
 * @generated
 */
public interface JsonArray extends JSonObject, JSonAttribut
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getJsonArray_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.JsonArray#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Contient</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.JSonAttribut}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contient</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getJsonArray_Contient()
   * @model containment="true"
   * @generated
   */
  EList<JSonAttribut> getContient();

} // JsonArray
