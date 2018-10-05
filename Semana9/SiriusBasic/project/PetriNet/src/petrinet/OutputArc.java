/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.OutputArc#getTo <em>To</em>}</li>
 *   <li>{@link petrinet.OutputArc#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getOutputArc()
 * @model
 * @generated
 */
public interface OutputArc extends Arc {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Place)
	 * @see petrinet.PetrinetPackage#getOutputArc_To()
	 * @model required="true"
	 *        annotation="genmymodel uuid='_6Yay8G1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	Place getTo();

	/**
	 * Sets the value of the '{@link petrinet.OutputArc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Place value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Transition)
	 * @see petrinet.PetrinetPackage#getOutputArc_From()
	 * @model required="true"
	 *        annotation="genmymodel uuid='_Id-YYG1aEDSyHe76t7Tw1A'"
	 * @generated
	 */
	Transition getFrom();

	/**
	 * Sets the value of the '{@link petrinet.OutputArc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Transition value);

} // OutputArc
