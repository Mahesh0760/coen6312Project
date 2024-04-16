/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import prims.Admin;
import prims.PrimsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AdminImpl extends PersonImpl implements Admin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPerson(String name, String password) 
	{
		PersonImpl obj = new PersonImpl();
		obj.setName(name);
		obj.setPassword(password);
		obj.setId(123);
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		System.out.println(obj);
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PrimsPackage.ADMIN___ADD_PERSON:
				addPerson(name, password);
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AdminImpl
