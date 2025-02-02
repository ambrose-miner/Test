package inheritenceConcept;

public class employeeTest {

	public static void main(String[] args) {
		// Employee class object 
		System.out.println("Enter the Employee details");
		employee emp1 = new employee();
		emp1.reademployee();
		
		
		// Manager class object 
		System.out.println("Enter the Manager details");
		manager mgr1 = new manager();
		mgr1.reademployee();			// read id,name,salary
		mgr1.readmanager();				// read numberofEmp
		
		
		
		// Developer class object 
		System.out.println("Enter the Developer details");
		developer dev1 = new developer();
		dev1.reademployee();			// read id,name,salary
		dev1.readdeveloper();				// read projectName
				
		
	
	
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		emp1.displayemployee();
		System.out.println("--------------------------");
		
		System.out.println("Manager Details");
		System.out.println("--------------------------");
		mgr1.displayemployee();			// dis id,name,salary
		mgr1.dismanager();				// dis numberOfEmp
		System.out.println("--------------------------");
		
		System.out.println("Developer Details");
		System.out.println("--------------------------");
		dev1.displayemployee();			// dis id,name,salary
		dev1.disdeveloper();				// dis projectName
		System.out.println("--------------------------");
	}

}