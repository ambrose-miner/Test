package inheritenceConcept;

public class developer extends employee{
	private String projectName;
	
	public void readdeveloper() {
		System.out.println("Enter the Project Name");
		this.projectName=sc.next();
	}
	
	public void disdeveloper() {
		System.out.println("Project Name is "+this.projectName);
	}
}