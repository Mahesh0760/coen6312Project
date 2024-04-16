/**
 */
package prims;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see prims.PrimsFactory
 * @model kind="package"
 * @generated
 */
public interface PrimsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prims";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///prims.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prims";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimsPackage eINSTANCE = prims.impl.PrimsPackageImpl.init();

	/**
	 * The meta object id for the '{@link prims.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.PlantImpl
	 * @see prims.impl.PrimsPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DEPARTMENT = 2;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prims.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.DepartmentImpl
	 * @see prims.impl.PrimsPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PERMISSION = 1;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link prims.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.PersonImpl
	 * @see prims.impl.PrimsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Department</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_DEPARTMENT = 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link prims.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.ManagerImpl
	 * @see prims.impl.PrimsPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PASSWORD = PERSON__PASSWORD;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Department</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___GET_DEPARTMENT = PERSON___GET_DEPARTMENT;

	/**
	 * The operation id for the '<em>Generate SI Rreport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___GENERATE_SI_RREPORT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Generate POreport</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___GENERATE_POREPORT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link prims.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.EngineerImpl
	 * @see prims.impl.PrimsPackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__PASSWORD = PERSON__PASSWORD;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Department</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___GET_DEPARTMENT = PERSON___GET_DEPARTMENT;

	/**
	 * The operation id for the '<em>Search Spare By Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___SEARCH_SPARE_BY_TITLE = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Search Spare By Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___SEARCH_SPARE_BY_CODE = PERSON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Spare To SIR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___ADD_SPARE_TO_SIR = PERSON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Spare To PR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___ADD_SPARE_TO_PR = PERSON_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Inspect Spare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___INSPECT_SPARE = PERSON_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Update PR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___UPDATE_PR = PERSON_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Search By BOM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___SEARCH_BY_BOM = PERSON_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Equipment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___ADD_EQUIPMENT = PERSON_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Update Equipment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___UPDATE_EQUIPMENT = PERSON_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Update PR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___UPDATE_PR1 = PERSON_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Update SIR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER___UPDATE_SIR = PERSON_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link prims.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.StaffImpl
	 * @see prims.impl.PrimsPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__PASSWORD = PERSON__PASSWORD;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Department</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___GET_DEPARTMENT = PERSON___GET_DEPARTMENT;

	/**
	 * The operation id for the '<em>Issue Spare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___ISSUE_SPARE = PERSON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___UPDATE_QUANTITY = PERSON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add RF Qto PR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF___ADD_RF_QTO_PR = PERSON_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = PERSON_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link prims.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.AdminImpl
	 * @see prims.impl.PrimsPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ID = PERSON__ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PASSWORD = PERSON__PASSWORD;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = PERSON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Department</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___GET_DEPARTMENT = PERSON___GET_DEPARTMENT;

	/**
	 * The operation id for the '<em>Add Person</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ADD_PERSON = PERSON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = PERSON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link prims.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.EquipmentImpl
	 * @see prims.impl.PrimsPackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__TAG = 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__AREA = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Equipment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT___CREATE_EQUIPMENT = 0;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link prims.impl.BOMImpl <em>BOM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.BOMImpl
	 * @see prims.impl.PrimsPackageImpl#getBOM()
	 * @generated
	 */
	int BOM = 8;

	/**
	 * The feature id for the '<em><b>BO Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM__BO_MID = 0;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM__DATE_CREATED = 1;

	/**
	 * The number of structural features of the '<em>BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Attach Spare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM___ATTACH_SPARE = 0;

	/**
	 * The operation id for the '<em>Create BOM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM___CREATE_BOM = 1;

	/**
	 * The operation id for the '<em>Display BOM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM___DISPLAY_BOM = 2;

	/**
	 * The number of operations of the '<em>BOM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOM_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link prims.impl.SpareImpl <em>Spare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.SpareImpl
	 * @see prims.impl.PrimsPackageImpl#getSpare()
	 * @generated
	 */
	int SPARE = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Av Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE__AV_QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Spare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE___ADD_QUANTITY = 0;

	/**
	 * The operation id for the '<em>Create Spare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE___CREATE_SPARE = 1;

	/**
	 * The operation id for the '<em>Return Spare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE___RETURN_SPARE = 2;

	/**
	 * The number of operations of the '<em>Spare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link prims.impl.SIRImpl <em>SIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.SIRImpl
	 * @see prims.impl.PrimsPackageImpl#getSIR()
	 * @generated
	 */
	int SIR = 10;

	/**
	 * The feature id for the '<em><b>SI Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__SI_RID = 0;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__DATE_CREATED = 1;

	/**
	 * The feature id for the '<em><b>Date Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__DATE_ISSUED = 2;

	/**
	 * The feature id for the '<em><b>SIR Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR__SIR_QUANTITY = 3;

	/**
	 * The number of structural features of the '<em>SIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create SIR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR___CREATE_SIR = 0;

	/**
	 * The number of operations of the '<em>SIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link prims.impl.PRImpl <em>PR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.PRImpl
	 * @see prims.impl.PrimsPackageImpl#getPR()
	 * @generated
	 */
	int PR = 11;

	/**
	 * The feature id for the '<em><b>PRid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR__PRID = 0;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR__DATE_CREATED = 1;

	/**
	 * The feature id for the '<em><b>Urgency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR__URGENCY = 2;

	/**
	 * The feature id for the '<em><b>PR Quanitity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR__PR_QUANITITY = 3;

	/**
	 * The number of structural features of the '<em>PR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create PR</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR___CREATE_PR = 0;

	/**
	 * The number of operations of the '<em>PR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link prims.impl.RFQImpl <em>RFQ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.RFQImpl
	 * @see prims.impl.PrimsPackageImpl#getRFQ()
	 * @generated
	 */
	int RFQ = 12;

	/**
	 * The feature id for the '<em><b>RF Qid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ__RF_QID = 0;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ__DUE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Supplier Quotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ__SUPPLIER_QUOTATION = 2;

	/**
	 * The feature id for the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ__UNIT_PRICE = 3;

	/**
	 * The number of structural features of the '<em>RFQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Attach Quotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ___ATTACH_QUOTATION = 0;

	/**
	 * The operation id for the '<em>Get Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ___GET_PRICE = 1;

	/**
	 * The operation id for the '<em>Create RFQ</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ___CREATE_RFQ = 2;

	/**
	 * The operation id for the '<em>Create PO</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ___CREATE_PO = 3;

	/**
	 * The number of operations of the '<em>RFQ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFQ_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link prims.impl.POImpl <em>PO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.POImpl
	 * @see prims.impl.PrimsPackageImpl#getPO()
	 * @generated
	 */
	int PO = 13;

	/**
	 * The feature id for the '<em><b>POid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO__POID = 0;

	/**
	 * The feature id for the '<em><b>Scheduled Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO__SCHEDULED_DELIVERY = 1;

	/**
	 * The feature id for the '<em><b>Actual Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO__ACTUAL_DELIVERY = 2;

	/**
	 * The number of structural features of the '<em>PO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create IN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO___CREATE_IN = 0;

	/**
	 * The operation id for the '<em>Add Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO___ADD_DELIVERY_DATE = 1;

	/**
	 * The number of operations of the '<em>PO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link prims.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.SupplierImpl
	 * @see prims.impl.PrimsPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CONTACT = 1;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Quotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER___ADD_QUOTATIONS = 0;

	/**
	 * The number of operations of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link prims.impl.InspectionNoteImpl <em>Inspection Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prims.impl.InspectionNoteImpl
	 * @see prims.impl.PrimsPackageImpl#getInspectionNote()
	 * @generated
	 */
	int INSPECTION_NOTE = 15;

	/**
	 * The feature id for the '<em><b>Inspection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE__INSPECTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Inspected Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE__INSPECTED_DATE = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Inspection Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Status Of IN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE___GET_STATUS_OF_IN = 0;

	/**
	 * The operation id for the '<em>Set Status Of IN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE___SET_STATUS_OF_IN = 1;

	/**
	 * The number of operations of the '<em>Inspection Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTION_NOTE_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link prims.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see prims.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the attribute '{@link prims.Plant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prims.Plant#getName()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Name();

	/**
	 * Returns the meta object for the attribute '{@link prims.Plant#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see prims.Plant#getAddress()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link prims.Plant#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Department</em>'.
	 * @see prims.Plant#getDepartment()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Department();

	/**
	 * Returns the meta object for class '{@link prims.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see prims.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link prims.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prims.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link prims.Department#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see prims.Department#getPermission()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Permission();

	/**
	 * Returns the meta object for class '{@link prims.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see prims.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link prims.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prims.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link prims.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see prims.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for the attribute '{@link prims.Person#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see prims.Person#getPassword()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Password();

	/**
	 * Returns the meta object for the '{@link prims.Person#getDepartment() <em>Get Department</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Department</em>' operation.
	 * @see prims.Person#getDepartment()
	 * @generated
	 */
	EOperation getPerson__GetDepartment();

	/**
	 * Returns the meta object for class '{@link prims.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see prims.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the '{@link prims.Manager#generateSIRreport() <em>Generate SI Rreport</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate SI Rreport</em>' operation.
	 * @see prims.Manager#generateSIRreport()
	 * @generated
	 */
	EOperation getManager__GenerateSIRreport();

	/**
	 * Returns the meta object for the '{@link prims.Manager#generatePOreport() <em>Generate POreport</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate POreport</em>' operation.
	 * @see prims.Manager#generatePOreport()
	 * @generated
	 */
	EOperation getManager__GeneratePOreport();

	/**
	 * Returns the meta object for class '{@link prims.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see prims.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#searchSpareByTitle() <em>Search Spare By Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Spare By Title</em>' operation.
	 * @see prims.Engineer#searchSpareByTitle()
	 * @generated
	 */
	EOperation getEngineer__SearchSpareByTitle();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#searchSpareByCode() <em>Search Spare By Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Spare By Code</em>' operation.
	 * @see prims.Engineer#searchSpareByCode()
	 * @generated
	 */
	EOperation getEngineer__SearchSpareByCode();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#addSpareToSIR() <em>Add Spare To SIR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Spare To SIR</em>' operation.
	 * @see prims.Engineer#addSpareToSIR()
	 * @generated
	 */
	EOperation getEngineer__AddSpareToSIR();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#addSpareToPR() <em>Add Spare To PR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Spare To PR</em>' operation.
	 * @see prims.Engineer#addSpareToPR()
	 * @generated
	 */
	EOperation getEngineer__AddSpareToPR();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#inspectSpare() <em>Inspect Spare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inspect Spare</em>' operation.
	 * @see prims.Engineer#inspectSpare()
	 * @generated
	 */
	EOperation getEngineer__InspectSpare();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#updatePR() <em>Update PR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update PR</em>' operation.
	 * @see prims.Engineer#updatePR()
	 * @generated
	 */
	EOperation getEngineer__UpdatePR();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#searchByBOM() <em>Search By BOM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search By BOM</em>' operation.
	 * @see prims.Engineer#searchByBOM()
	 * @generated
	 */
	EOperation getEngineer__SearchByBOM();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#addEquipment() <em>Add Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Equipment</em>' operation.
	 * @see prims.Engineer#addEquipment()
	 * @generated
	 */
	EOperation getEngineer__AddEquipment();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#UpdateEquipment() <em>Update Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Equipment</em>' operation.
	 * @see prims.Engineer#UpdateEquipment()
	 * @generated
	 */
	EOperation getEngineer__UpdateEquipment();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#UpdatePR() <em>Update PR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update PR</em>' operation.
	 * @see prims.Engineer#UpdatePR()
	 * @generated
	 */
	EOperation getEngineer__UpdatePR_1();

	/**
	 * Returns the meta object for the '{@link prims.Engineer#updateSIR() <em>Update SIR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update SIR</em>' operation.
	 * @see prims.Engineer#updateSIR()
	 * @generated
	 */
	EOperation getEngineer__UpdateSIR();

	/**
	 * Returns the meta object for class '{@link prims.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see prims.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the '{@link prims.Staff#issueSpare() <em>Issue Spare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Issue Spare</em>' operation.
	 * @see prims.Staff#issueSpare()
	 * @generated
	 */
	EOperation getStaff__IssueSpare();

	/**
	 * Returns the meta object for the '{@link prims.Staff#updateQuantity() <em>Update Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Quantity</em>' operation.
	 * @see prims.Staff#updateQuantity()
	 * @generated
	 */
	EOperation getStaff__UpdateQuantity();

	/**
	 * Returns the meta object for the '{@link prims.Staff#addRFQtoPR() <em>Add RF Qto PR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add RF Qto PR</em>' operation.
	 * @see prims.Staff#addRFQtoPR()
	 * @generated
	 */
	EOperation getStaff__AddRFQtoPR();

	/**
	 * Returns the meta object for class '{@link prims.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see prims.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the '{@link prims.Admin#addPerson() <em>Add Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Person</em>' operation.
	 * @see prims.Admin#addPerson()
	 * @generated
	 */
	EOperation getAdmin__AddPerson();

	/**
	 * Returns the meta object for class '{@link prims.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see prims.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute '{@link prims.Equipment#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see prims.Equipment#getTag()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Tag();

	/**
	 * Returns the meta object for the attribute '{@link prims.Equipment#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see prims.Equipment#getArea()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Area();

	/**
	 * Returns the meta object for the attribute '{@link prims.Equipment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see prims.Equipment#getType()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Type();

	/**
	 * Returns the meta object for the '{@link prims.Equipment#createEquipment() <em>Create Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Equipment</em>' operation.
	 * @see prims.Equipment#createEquipment()
	 * @generated
	 */
	EOperation getEquipment__CreateEquipment();

	/**
	 * Returns the meta object for class '{@link prims.BOM <em>BOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOM</em>'.
	 * @see prims.BOM
	 * @generated
	 */
	EClass getBOM();

	/**
	 * Returns the meta object for the attribute '{@link prims.BOM#getBOMid <em>BO Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BO Mid</em>'.
	 * @see prims.BOM#getBOMid()
	 * @see #getBOM()
	 * @generated
	 */
	EAttribute getBOM_BOMid();

	/**
	 * Returns the meta object for the attribute '{@link prims.BOM#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see prims.BOM#getDateCreated()
	 * @see #getBOM()
	 * @generated
	 */
	EAttribute getBOM_DateCreated();

	/**
	 * Returns the meta object for the '{@link prims.BOM#attachSpare() <em>Attach Spare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Spare</em>' operation.
	 * @see prims.BOM#attachSpare()
	 * @generated
	 */
	EOperation getBOM__AttachSpare();

	/**
	 * Returns the meta object for the '{@link prims.BOM#createBOM() <em>Create BOM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create BOM</em>' operation.
	 * @see prims.BOM#createBOM()
	 * @generated
	 */
	EOperation getBOM__CreateBOM();

	/**
	 * Returns the meta object for the '{@link prims.BOM#displayBOM() <em>Display BOM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Display BOM</em>' operation.
	 * @see prims.BOM#displayBOM()
	 * @generated
	 */
	EOperation getBOM__DisplayBOM();

	/**
	 * Returns the meta object for class '{@link prims.Spare <em>Spare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spare</em>'.
	 * @see prims.Spare
	 * @generated
	 */
	EClass getSpare();

	/**
	 * Returns the meta object for the attribute '{@link prims.Spare#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see prims.Spare#getCode()
	 * @see #getSpare()
	 * @generated
	 */
	EAttribute getSpare_Code();

	/**
	 * Returns the meta object for the attribute '{@link prims.Spare#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see prims.Spare#getTitle()
	 * @see #getSpare()
	 * @generated
	 */
	EAttribute getSpare_Title();

	/**
	 * Returns the meta object for the attribute '{@link prims.Spare#getAvQuantity <em>Av Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Av Quantity</em>'.
	 * @see prims.Spare#getAvQuantity()
	 * @see #getSpare()
	 * @generated
	 */
	EAttribute getSpare_AvQuantity();

	/**
	 * Returns the meta object for the attribute '{@link prims.Spare#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see prims.Spare#getLocation()
	 * @see #getSpare()
	 * @generated
	 */
	EAttribute getSpare_Location();

	/**
	 * Returns the meta object for the '{@link prims.Spare#addQuantity() <em>Add Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Quantity</em>' operation.
	 * @see prims.Spare#addQuantity()
	 * @generated
	 */
	EOperation getSpare__AddQuantity();

	/**
	 * Returns the meta object for the '{@link prims.Spare#createSpare() <em>Create Spare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Spare</em>' operation.
	 * @see prims.Spare#createSpare()
	 * @generated
	 */
	EOperation getSpare__CreateSpare();

	/**
	 * Returns the meta object for the '{@link prims.Spare#returnSpare() <em>Return Spare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Spare</em>' operation.
	 * @see prims.Spare#returnSpare()
	 * @generated
	 */
	EOperation getSpare__ReturnSpare();

	/**
	 * Returns the meta object for class '{@link prims.SIR <em>SIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SIR</em>'.
	 * @see prims.SIR
	 * @generated
	 */
	EClass getSIR();

	/**
	 * Returns the meta object for the attribute '{@link prims.SIR#getSIRid <em>SI Rid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SI Rid</em>'.
	 * @see prims.SIR#getSIRid()
	 * @see #getSIR()
	 * @generated
	 */
	EAttribute getSIR_SIRid();

	/**
	 * Returns the meta object for the attribute '{@link prims.SIR#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see prims.SIR#getDateCreated()
	 * @see #getSIR()
	 * @generated
	 */
	EAttribute getSIR_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link prims.SIR#getDateIssued <em>Date Issued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Issued</em>'.
	 * @see prims.SIR#getDateIssued()
	 * @see #getSIR()
	 * @generated
	 */
	EAttribute getSIR_DateIssued();

	/**
	 * Returns the meta object for the attribute '{@link prims.SIR#getSIRQuantity <em>SIR Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIR Quantity</em>'.
	 * @see prims.SIR#getSIRQuantity()
	 * @see #getSIR()
	 * @generated
	 */
	EAttribute getSIR_SIRQuantity();

	/**
	 * Returns the meta object for the '{@link prims.SIR#createSIR() <em>Create SIR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create SIR</em>' operation.
	 * @see prims.SIR#createSIR()
	 * @generated
	 */
	EOperation getSIR__CreateSIR();

	/**
	 * Returns the meta object for class '{@link prims.PR <em>PR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PR</em>'.
	 * @see prims.PR
	 * @generated
	 */
	EClass getPR();

	/**
	 * Returns the meta object for the attribute '{@link prims.PR#getPRid <em>PRid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PRid</em>'.
	 * @see prims.PR#getPRid()
	 * @see #getPR()
	 * @generated
	 */
	EAttribute getPR_PRid();

	/**
	 * Returns the meta object for the attribute '{@link prims.PR#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see prims.PR#getDateCreated()
	 * @see #getPR()
	 * @generated
	 */
	EAttribute getPR_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link prims.PR#getUrgency <em>Urgency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Urgency</em>'.
	 * @see prims.PR#getUrgency()
	 * @see #getPR()
	 * @generated
	 */
	EAttribute getPR_Urgency();

	/**
	 * Returns the meta object for the attribute '{@link prims.PR#getPRQuanitity <em>PR Quanitity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PR Quanitity</em>'.
	 * @see prims.PR#getPRQuanitity()
	 * @see #getPR()
	 * @generated
	 */
	EAttribute getPR_PRQuanitity();

	/**
	 * Returns the meta object for the '{@link prims.PR#createPR() <em>Create PR</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create PR</em>' operation.
	 * @see prims.PR#createPR()
	 * @generated
	 */
	EOperation getPR__CreatePR();

	/**
	 * Returns the meta object for class '{@link prims.RFQ <em>RFQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFQ</em>'.
	 * @see prims.RFQ
	 * @generated
	 */
	EClass getRFQ();

	/**
	 * Returns the meta object for the attribute '{@link prims.RFQ#getRFQid <em>RF Qid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RF Qid</em>'.
	 * @see prims.RFQ#getRFQid()
	 * @see #getRFQ()
	 * @generated
	 */
	EAttribute getRFQ_RFQid();

	/**
	 * Returns the meta object for the attribute '{@link prims.RFQ#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see prims.RFQ#getDueDate()
	 * @see #getRFQ()
	 * @generated
	 */
	EAttribute getRFQ_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link prims.RFQ#getSupplierQuotation <em>Supplier Quotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Quotation</em>'.
	 * @see prims.RFQ#getSupplierQuotation()
	 * @see #getRFQ()
	 * @generated
	 */
	EAttribute getRFQ_SupplierQuotation();

	/**
	 * Returns the meta object for the attribute '{@link prims.RFQ#getUnitPrice <em>Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Price</em>'.
	 * @see prims.RFQ#getUnitPrice()
	 * @see #getRFQ()
	 * @generated
	 */
	EAttribute getRFQ_UnitPrice();

	/**
	 * Returns the meta object for the '{@link prims.RFQ#AttachQuotation() <em>Attach Quotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Quotation</em>' operation.
	 * @see prims.RFQ#AttachQuotation()
	 * @generated
	 */
	EOperation getRFQ__AttachQuotation();

	/**
	 * Returns the meta object for the '{@link prims.RFQ#getPrice() <em>Get Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Price</em>' operation.
	 * @see prims.RFQ#getPrice()
	 * @generated
	 */
	EOperation getRFQ__GetPrice();

	/**
	 * Returns the meta object for the '{@link prims.RFQ#createRFQ() <em>Create RFQ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create RFQ</em>' operation.
	 * @see prims.RFQ#createRFQ()
	 * @generated
	 */
	EOperation getRFQ__CreateRFQ();

	/**
	 * Returns the meta object for the '{@link prims.RFQ#createPO() <em>Create PO</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create PO</em>' operation.
	 * @see prims.RFQ#createPO()
	 * @generated
	 */
	EOperation getRFQ__CreatePO();

	/**
	 * Returns the meta object for class '{@link prims.PO <em>PO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PO</em>'.
	 * @see prims.PO
	 * @generated
	 */
	EClass getPO();

	/**
	 * Returns the meta object for the attribute '{@link prims.PO#getPOid <em>POid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POid</em>'.
	 * @see prims.PO#getPOid()
	 * @see #getPO()
	 * @generated
	 */
	EAttribute getPO_POid();

	/**
	 * Returns the meta object for the attribute '{@link prims.PO#getScheduledDelivery <em>Scheduled Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Delivery</em>'.
	 * @see prims.PO#getScheduledDelivery()
	 * @see #getPO()
	 * @generated
	 */
	EAttribute getPO_ScheduledDelivery();

	/**
	 * Returns the meta object for the attribute '{@link prims.PO#getActualDelivery <em>Actual Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Delivery</em>'.
	 * @see prims.PO#getActualDelivery()
	 * @see #getPO()
	 * @generated
	 */
	EAttribute getPO_ActualDelivery();

	/**
	 * Returns the meta object for the '{@link prims.PO#createIN() <em>Create IN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create IN</em>' operation.
	 * @see prims.PO#createIN()
	 * @generated
	 */
	EOperation getPO__CreateIN();

	/**
	 * Returns the meta object for the '{@link prims.PO#addDeliveryDate() <em>Add Delivery Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Delivery Date</em>' operation.
	 * @see prims.PO#addDeliveryDate()
	 * @generated
	 */
	EOperation getPO__AddDeliveryDate();

	/**
	 * Returns the meta object for class '{@link prims.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see prims.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the attribute '{@link prims.Supplier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prims.Supplier#getName()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Name();

	/**
	 * Returns the meta object for the attribute '{@link prims.Supplier#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see prims.Supplier#getContact()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Contact();

	/**
	 * Returns the meta object for the '{@link prims.Supplier#addQuotations() <em>Add Quotations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Quotations</em>' operation.
	 * @see prims.Supplier#addQuotations()
	 * @generated
	 */
	EOperation getSupplier__AddQuotations();

	/**
	 * Returns the meta object for class '{@link prims.InspectionNote <em>Inspection Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspection Note</em>'.
	 * @see prims.InspectionNote
	 * @generated
	 */
	EClass getInspectionNote();

	/**
	 * Returns the meta object for the attribute '{@link prims.InspectionNote#getInspectionId <em>Inspection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inspection Id</em>'.
	 * @see prims.InspectionNote#getInspectionId()
	 * @see #getInspectionNote()
	 * @generated
	 */
	EAttribute getInspectionNote_InspectionId();

	/**
	 * Returns the meta object for the attribute '{@link prims.InspectionNote#getInspectedDate <em>Inspected Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inspected Date</em>'.
	 * @see prims.InspectionNote#getInspectedDate()
	 * @see #getInspectionNote()
	 * @generated
	 */
	EAttribute getInspectionNote_InspectedDate();

	/**
	 * Returns the meta object for the attribute '{@link prims.InspectionNote#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see prims.InspectionNote#isStatus()
	 * @see #getInspectionNote()
	 * @generated
	 */
	EAttribute getInspectionNote_Status();

	/**
	 * Returns the meta object for the '{@link prims.InspectionNote#getStatusOfIN() <em>Get Status Of IN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Status Of IN</em>' operation.
	 * @see prims.InspectionNote#getStatusOfIN()
	 * @generated
	 */
	EOperation getInspectionNote__GetStatusOfIN();

	/**
	 * Returns the meta object for the '{@link prims.InspectionNote#setStatusOfIN() <em>Set Status Of IN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Status Of IN</em>' operation.
	 * @see prims.InspectionNote#setStatusOfIN()
	 * @generated
	 */
	EOperation getInspectionNote__SetStatusOfIN();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrimsFactory getPrimsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link prims.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.PlantImpl
		 * @see prims.impl.PrimsPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__NAME = eINSTANCE.getPlant_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__ADDRESS = eINSTANCE.getPlant_Address();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__DEPARTMENT = eINSTANCE.getPlant_Department();

		/**
		 * The meta object literal for the '{@link prims.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.DepartmentImpl
		 * @see prims.impl.PrimsPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__PERMISSION = eINSTANCE.getDepartment_Permission();

		/**
		 * The meta object literal for the '{@link prims.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.PersonImpl
		 * @see prims.impl.PrimsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSWORD = eINSTANCE.getPerson_Password();

		/**
		 * The meta object literal for the '<em><b>Get Department</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_DEPARTMENT = eINSTANCE.getPerson__GetDepartment();

		/**
		 * The meta object literal for the '{@link prims.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.ManagerImpl
		 * @see prims.impl.PrimsPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>Generate SI Rreport</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___GENERATE_SI_RREPORT = eINSTANCE.getManager__GenerateSIRreport();

		/**
		 * The meta object literal for the '<em><b>Generate POreport</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER___GENERATE_POREPORT = eINSTANCE.getManager__GeneratePOreport();

		/**
		 * The meta object literal for the '{@link prims.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.EngineerImpl
		 * @see prims.impl.PrimsPackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '<em><b>Search Spare By Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___SEARCH_SPARE_BY_TITLE = eINSTANCE.getEngineer__SearchSpareByTitle();

		/**
		 * The meta object literal for the '<em><b>Search Spare By Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___SEARCH_SPARE_BY_CODE = eINSTANCE.getEngineer__SearchSpareByCode();

		/**
		 * The meta object literal for the '<em><b>Add Spare To SIR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___ADD_SPARE_TO_SIR = eINSTANCE.getEngineer__AddSpareToSIR();

		/**
		 * The meta object literal for the '<em><b>Add Spare To PR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___ADD_SPARE_TO_PR = eINSTANCE.getEngineer__AddSpareToPR();

		/**
		 * The meta object literal for the '<em><b>Inspect Spare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___INSPECT_SPARE = eINSTANCE.getEngineer__InspectSpare();

		/**
		 * The meta object literal for the '<em><b>Update PR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___UPDATE_PR = eINSTANCE.getEngineer__UpdatePR();

		/**
		 * The meta object literal for the '<em><b>Search By BOM</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___SEARCH_BY_BOM = eINSTANCE.getEngineer__SearchByBOM();

		/**
		 * The meta object literal for the '<em><b>Add Equipment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___ADD_EQUIPMENT = eINSTANCE.getEngineer__AddEquipment();

		/**
		 * The meta object literal for the '<em><b>Update Equipment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___UPDATE_EQUIPMENT = eINSTANCE.getEngineer__UpdateEquipment();

		/**
		 * The meta object literal for the '<em><b>Update PR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___UPDATE_PR1 = eINSTANCE.getEngineer__UpdatePR_1();

		/**
		 * The meta object literal for the '<em><b>Update SIR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENGINEER___UPDATE_SIR = eINSTANCE.getEngineer__UpdateSIR();

		/**
		 * The meta object literal for the '{@link prims.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.StaffImpl
		 * @see prims.impl.PrimsPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Issue Spare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___ISSUE_SPARE = eINSTANCE.getStaff__IssueSpare();

		/**
		 * The meta object literal for the '<em><b>Update Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___UPDATE_QUANTITY = eINSTANCE.getStaff__UpdateQuantity();

		/**
		 * The meta object literal for the '<em><b>Add RF Qto PR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF___ADD_RF_QTO_PR = eINSTANCE.getStaff__AddRFQtoPR();

		/**
		 * The meta object literal for the '{@link prims.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.AdminImpl
		 * @see prims.impl.PrimsPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Add Person</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ADD_PERSON = eINSTANCE.getAdmin__AddPerson();

		/**
		 * The meta object literal for the '{@link prims.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.EquipmentImpl
		 * @see prims.impl.PrimsPackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__TAG = eINSTANCE.getEquipment_Tag();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__AREA = eINSTANCE.getEquipment_Area();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__TYPE = eINSTANCE.getEquipment_Type();

		/**
		 * The meta object literal for the '<em><b>Create Equipment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EQUIPMENT___CREATE_EQUIPMENT = eINSTANCE.getEquipment__CreateEquipment();

		/**
		 * The meta object literal for the '{@link prims.impl.BOMImpl <em>BOM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.BOMImpl
		 * @see prims.impl.PrimsPackageImpl#getBOM()
		 * @generated
		 */
		EClass BOM = eINSTANCE.getBOM();

		/**
		 * The meta object literal for the '<em><b>BO Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOM__BO_MID = eINSTANCE.getBOM_BOMid();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOM__DATE_CREATED = eINSTANCE.getBOM_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Attach Spare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOM___ATTACH_SPARE = eINSTANCE.getBOM__AttachSpare();

		/**
		 * The meta object literal for the '<em><b>Create BOM</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOM___CREATE_BOM = eINSTANCE.getBOM__CreateBOM();

		/**
		 * The meta object literal for the '<em><b>Display BOM</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOM___DISPLAY_BOM = eINSTANCE.getBOM__DisplayBOM();

		/**
		 * The meta object literal for the '{@link prims.impl.SpareImpl <em>Spare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.SpareImpl
		 * @see prims.impl.PrimsPackageImpl#getSpare()
		 * @generated
		 */
		EClass SPARE = eINSTANCE.getSpare();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARE__CODE = eINSTANCE.getSpare_Code();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARE__TITLE = eINSTANCE.getSpare_Title();

		/**
		 * The meta object literal for the '<em><b>Av Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARE__AV_QUANTITY = eINSTANCE.getSpare_AvQuantity();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARE__LOCATION = eINSTANCE.getSpare_Location();

		/**
		 * The meta object literal for the '<em><b>Add Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPARE___ADD_QUANTITY = eINSTANCE.getSpare__AddQuantity();

		/**
		 * The meta object literal for the '<em><b>Create Spare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPARE___CREATE_SPARE = eINSTANCE.getSpare__CreateSpare();

		/**
		 * The meta object literal for the '<em><b>Return Spare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPARE___RETURN_SPARE = eINSTANCE.getSpare__ReturnSpare();

		/**
		 * The meta object literal for the '{@link prims.impl.SIRImpl <em>SIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.SIRImpl
		 * @see prims.impl.PrimsPackageImpl#getSIR()
		 * @generated
		 */
		EClass SIR = eINSTANCE.getSIR();

		/**
		 * The meta object literal for the '<em><b>SI Rid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR__SI_RID = eINSTANCE.getSIR_SIRid();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR__DATE_CREATED = eINSTANCE.getSIR_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Date Issued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR__DATE_ISSUED = eINSTANCE.getSIR_DateIssued();

		/**
		 * The meta object literal for the '<em><b>SIR Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIR__SIR_QUANTITY = eINSTANCE.getSIR_SIRQuantity();

		/**
		 * The meta object literal for the '<em><b>Create SIR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIR___CREATE_SIR = eINSTANCE.getSIR__CreateSIR();

		/**
		 * The meta object literal for the '{@link prims.impl.PRImpl <em>PR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.PRImpl
		 * @see prims.impl.PrimsPackageImpl#getPR()
		 * @generated
		 */
		EClass PR = eINSTANCE.getPR();

		/**
		 * The meta object literal for the '<em><b>PRid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PR__PRID = eINSTANCE.getPR_PRid();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PR__DATE_CREATED = eINSTANCE.getPR_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Urgency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PR__URGENCY = eINSTANCE.getPR_Urgency();

		/**
		 * The meta object literal for the '<em><b>PR Quanitity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PR__PR_QUANITITY = eINSTANCE.getPR_PRQuanitity();

		/**
		 * The meta object literal for the '<em><b>Create PR</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PR___CREATE_PR = eINSTANCE.getPR__CreatePR();

		/**
		 * The meta object literal for the '{@link prims.impl.RFQImpl <em>RFQ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.RFQImpl
		 * @see prims.impl.PrimsPackageImpl#getRFQ()
		 * @generated
		 */
		EClass RFQ = eINSTANCE.getRFQ();

		/**
		 * The meta object literal for the '<em><b>RF Qid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RFQ__RF_QID = eINSTANCE.getRFQ_RFQid();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RFQ__DUE_DATE = eINSTANCE.getRFQ_DueDate();

		/**
		 * The meta object literal for the '<em><b>Supplier Quotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RFQ__SUPPLIER_QUOTATION = eINSTANCE.getRFQ_SupplierQuotation();

		/**
		 * The meta object literal for the '<em><b>Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RFQ__UNIT_PRICE = eINSTANCE.getRFQ_UnitPrice();

		/**
		 * The meta object literal for the '<em><b>Attach Quotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RFQ___ATTACH_QUOTATION = eINSTANCE.getRFQ__AttachQuotation();

		/**
		 * The meta object literal for the '<em><b>Get Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RFQ___GET_PRICE = eINSTANCE.getRFQ__GetPrice();

		/**
		 * The meta object literal for the '<em><b>Create RFQ</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RFQ___CREATE_RFQ = eINSTANCE.getRFQ__CreateRFQ();

		/**
		 * The meta object literal for the '<em><b>Create PO</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RFQ___CREATE_PO = eINSTANCE.getRFQ__CreatePO();

		/**
		 * The meta object literal for the '{@link prims.impl.POImpl <em>PO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.POImpl
		 * @see prims.impl.PrimsPackageImpl#getPO()
		 * @generated
		 */
		EClass PO = eINSTANCE.getPO();

		/**
		 * The meta object literal for the '<em><b>POid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO__POID = eINSTANCE.getPO_POid();

		/**
		 * The meta object literal for the '<em><b>Scheduled Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO__SCHEDULED_DELIVERY = eINSTANCE.getPO_ScheduledDelivery();

		/**
		 * The meta object literal for the '<em><b>Actual Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PO__ACTUAL_DELIVERY = eINSTANCE.getPO_ActualDelivery();

		/**
		 * The meta object literal for the '<em><b>Create IN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PO___CREATE_IN = eINSTANCE.getPO__CreateIN();

		/**
		 * The meta object literal for the '<em><b>Add Delivery Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PO___ADD_DELIVERY_DATE = eINSTANCE.getPO__AddDeliveryDate();

		/**
		 * The meta object literal for the '{@link prims.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.SupplierImpl
		 * @see prims.impl.PrimsPackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__NAME = eINSTANCE.getSupplier_Name();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__CONTACT = eINSTANCE.getSupplier_Contact();

		/**
		 * The meta object literal for the '<em><b>Add Quotations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUPPLIER___ADD_QUOTATIONS = eINSTANCE.getSupplier__AddQuotations();

		/**
		 * The meta object literal for the '{@link prims.impl.InspectionNoteImpl <em>Inspection Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prims.impl.InspectionNoteImpl
		 * @see prims.impl.PrimsPackageImpl#getInspectionNote()
		 * @generated
		 */
		EClass INSPECTION_NOTE = eINSTANCE.getInspectionNote();

		/**
		 * The meta object literal for the '<em><b>Inspection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION_NOTE__INSPECTION_ID = eINSTANCE.getInspectionNote_InspectionId();

		/**
		 * The meta object literal for the '<em><b>Inspected Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION_NOTE__INSPECTED_DATE = eINSTANCE.getInspectionNote_InspectedDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTION_NOTE__STATUS = eINSTANCE.getInspectionNote_Status();

		/**
		 * The meta object literal for the '<em><b>Get Status Of IN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSPECTION_NOTE___GET_STATUS_OF_IN = eINSTANCE.getInspectionNote__GetStatusOfIN();

		/**
		 * The meta object literal for the '<em><b>Set Status Of IN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSPECTION_NOTE___SET_STATUS_OF_IN = eINSTANCE.getInspectionNote__SetStatusOfIN();

	}

} //PrimsPackage
