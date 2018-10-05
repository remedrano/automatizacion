/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.System#getPetrinets <em>Petrinets</em>}</li>
 *   <li>{@link petrinet.System#getPetrinetrelationships <em>Petrinetrelationships</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinets</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.PetriNet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinets</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getSystem_Petrinets()
	 * @model containment="true"
	 *        annotation="genmymodel uuid='_Hcb4UG1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	EList<PetriNet> getPetrinets();

	/**
	 * Returns the value of the '<em><b>Petrinetrelationships</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.PetriNetRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetrelationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetrelationships</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getSystem_Petrinetrelationships()
	 * @model containment="true"
	 *        annotation="genmymodel uuid='_O-tW8G1ZEDSyHe76t7Tw1A'"
	 * @generated
	 */
	EList<PetriNetRelationship> getPetrinetrelationships();

} // System
