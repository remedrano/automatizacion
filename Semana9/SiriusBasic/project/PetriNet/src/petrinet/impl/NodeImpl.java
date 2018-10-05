/**
 */
package petrinet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petrinet.Node;
import petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.NodeImpl#getMinDelay <em>Min Delay</em>}</li>
 *   <li>{@link petrinet.impl.NodeImpl#getMaxDelay <em>Max Delay</em>}</li>
 *   <li>{@link petrinet.impl.NodeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends ElementImpl implements Node {
	/**
	 * The default value of the '{@link #getMinDelay() <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_DELAY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinDelay() <em>Min Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinDelay()
	 * @generated
	 * @ordered
	 */
	protected double minDelay = MIN_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDelay() <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_DELAY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxDelay() <em>Max Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDelay()
	 * @generated
	 * @ordered
	 */
	protected double maxDelay = MAX_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinDelay() {
		return minDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDelay(double newMinDelay) {
		double oldMinDelay = minDelay;
		minDelay = newMinDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__MIN_DELAY, oldMinDelay, minDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxDelay() {
		return maxDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDelay(double newMaxDelay) {
		double oldMaxDelay = maxDelay;
		maxDelay = newMaxDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__MAX_DELAY, oldMaxDelay, maxDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetPackage.NODE__MIN_DELAY:
				return getMinDelay();
			case PetrinetPackage.NODE__MAX_DELAY:
				return getMaxDelay();
			case PetrinetPackage.NODE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.NODE__MIN_DELAY:
				setMinDelay((Double)newValue);
				return;
			case PetrinetPackage.NODE__MAX_DELAY:
				setMaxDelay((Double)newValue);
				return;
			case PetrinetPackage.NODE__NAME:
				setName((String)newValue);
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
			case PetrinetPackage.NODE__MIN_DELAY:
				setMinDelay(MIN_DELAY_EDEFAULT);
				return;
			case PetrinetPackage.NODE__MAX_DELAY:
				setMaxDelay(MAX_DELAY_EDEFAULT);
				return;
			case PetrinetPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
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
			case PetrinetPackage.NODE__MIN_DELAY:
				return minDelay != MIN_DELAY_EDEFAULT;
			case PetrinetPackage.NODE__MAX_DELAY:
				return maxDelay != MAX_DELAY_EDEFAULT;
			case PetrinetPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minDelay: ");
		result.append(minDelay);
		result.append(", maxDelay: ");
		result.append(maxDelay);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
