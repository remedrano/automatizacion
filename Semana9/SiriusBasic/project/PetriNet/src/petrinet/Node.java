/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Node#getMinDelay <em>Min Delay</em>}</li>
 *   <li>{@link petrinet.Node#getMaxDelay <em>Max Delay</em>}</li>
 *   <li>{@link petrinet.Node#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Element {
	/**
	 * Returns the value of the '<em><b>Min Delay</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Delay</em>' attribute.
	 * @see #setMinDelay(double)
	 * @see petrinet.PetrinetPackage#getNode_MinDelay()
	 * @model default="0.0"
	 *        annotation="genmymodel uuid='_aLta4G1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	double getMinDelay();

	/**
	 * Sets the value of the '{@link petrinet.Node#getMinDelay <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delay</em>' attribute.
	 * @see #getMinDelay()
	 * @generated
	 */
	void setMinDelay(double value);

	/**
	 * Returns the value of the '<em><b>Max Delay</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Delay</em>' attribute.
	 * @see #setMaxDelay(double)
	 * @see petrinet.PetrinetPackage#getNode_MaxDelay()
	 * @model default="0.0"
	 *        annotation="genmymodel uuid='_evZogG1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	double getMaxDelay();

	/**
	 * Sets the value of the '{@link petrinet.Node#getMaxDelay <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Delay</em>' attribute.
	 * @see #getMaxDelay()
	 * @generated
	 */
	void setMaxDelay(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Node
