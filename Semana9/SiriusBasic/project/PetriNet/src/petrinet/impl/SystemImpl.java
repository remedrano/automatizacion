/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.PetriNet;
import petrinet.PetriNetRelationship;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.SystemImpl#getPetrinets <em>Petrinets</em>}</li>
 *   <li>{@link petrinet.impl.SystemImpl#getPetrinetrelationships <em>Petrinetrelationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements petrinet.System {
	/**
	 * The cached value of the '{@link #getPetrinets() <em>Petrinets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinets()
	 * @generated
	 * @ordered
	 */
	protected EList<PetriNet> petrinets;

	/**
	 * The cached value of the '{@link #getPetrinetrelationships() <em>Petrinetrelationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinetrelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<PetriNetRelationship> petrinetrelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetriNet> getPetrinets() {
		if (petrinets == null) {
			petrinets = new EObjectContainmentEList<PetriNet>(PetriNet.class, this, PetrinetPackage.SYSTEM__PETRINETS);
		}
		return petrinets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PetriNetRelationship> getPetrinetrelationships() {
		if (petrinetrelationships == null) {
			petrinetrelationships = new EObjectContainmentEList<PetriNetRelationship>(PetriNetRelationship.class, this, PetrinetPackage.SYSTEM__PETRINETRELATIONSHIPS);
		}
		return petrinetrelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.SYSTEM__PETRINETS:
				return ((InternalEList<?>)getPetrinets()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.SYSTEM__PETRINETRELATIONSHIPS:
				return ((InternalEList<?>)getPetrinetrelationships()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.SYSTEM__PETRINETS:
				return getPetrinets();
			case PetrinetPackage.SYSTEM__PETRINETRELATIONSHIPS:
				return getPetrinetrelationships();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.SYSTEM__PETRINETS:
				getPetrinets().clear();
				getPetrinets().addAll((Collection<? extends PetriNet>)newValue);
				return;
			case PetrinetPackage.SYSTEM__PETRINETRELATIONSHIPS:
				getPetrinetrelationships().clear();
				getPetrinetrelationships().addAll((Collection<? extends PetriNetRelationship>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetrinetPackage.SYSTEM__PETRINETS:
				getPetrinets().clear();
				return;
			case PetrinetPackage.SYSTEM__PETRINETRELATIONSHIPS:
				getPetrinetrelationships().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetrinetPackage.SYSTEM__PETRINETS:
				return petrinets != null && !petrinets.isEmpty();
			case PetrinetPackage.SYSTEM__PETRINETRELATIONSHIPS:
				return petrinetrelationships != null && !petrinetrelationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
