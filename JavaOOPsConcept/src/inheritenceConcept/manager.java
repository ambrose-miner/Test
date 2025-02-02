package inheritenceConcept;

public class manager extends employee{

private int numberOfEmp;		// primitive property or simple property : it hold only one value 
address add = new address();		// complex property : it can have more than one others different type of property 

public void readmanager() {
	System.out.println("Enter the number of Employee working under him");
	this.numberOfEmp=sc.nextInt();
	add.readaddress(); // this code call Address class readAddress method. 
}
public void dismanager() {
	System.out.println("Number of Employee working under him "+this.numberOfEmp);
	add.disaddress();
}

}