/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import prims.Manager;
import prims.PrimsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ManagerImpl extends PersonImpl implements Manager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateSIRreport(String month) 
	{
		PersonImpl manager = new ManagerImpl();
		String dep = manager.getDepartment();
		if(dep == "Warehouse")
		{
			System.out.println("Generate SIR report");
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generatePOreport(String month) 
	{
		PersonImpl manager = new ManagerImpl();
		String dep = manager.getDepartment();
		if(dep == "Procurement")
		{
			System.out.println("Generate Purchase orders report");
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case PrimsPackage.MANAGER___GENERATE_SI_RREPORT:
				generateSIRreport(null);
				return null;
			case PrimsPackage.MANAGER___GENERATE_POREPORT:
				generatePOreport(null);
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ManagerImpl
