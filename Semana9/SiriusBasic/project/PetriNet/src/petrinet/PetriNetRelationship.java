/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.PetriNetRelationship#getFrom <em>From</em>}</li>
 *   <li>{@link petrinet.PetriNetRelationship#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetriNetRelationship()
 * @model
 * @generated
 */
public interface PetriNetRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(PetriNet)
	 * @see petrinet.PetrinetPackage#getPetriNetRelationship_From()
	 * @model required="true"
	 *        annotation="genmymodel uuid='_K7xtAG1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	PetriNet getFrom();

	/**
	 * Sets the value of the '{@link petrinet.PetriNetRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(PetriNet value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(PetriNet)
	 * @see petrinet.PetrinetPackage#getPetriNetRelationship_To()
	 * @model required="true"
	 *        annotation="genmymodel uuid='_L7I4QG1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	PetriNet getTo();

	/**
	 * Sets the value of the '{@link petrinet.PetriNetRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(PetriNet value);

} // PetriNetRelationship
