package tut02;

public class OfficeWorker {
	private String firstName;
	private String lastName;
	private int employeeNum;
	private String department;
	private Date doe; //composition relationship 
	
	public OfficeWorker() {
		this.firstName = "";
		this.lastName = "";
		this.employeeNum = 0;
		this.department = "";
		this.doe = new Date(0, 0, 0);
	}
	
	public OfficeWorker(String firstName, String lastName, int employeeNum, String department, Date doe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNum = employeeNum;
		this.department = department;
		this.doe = doe;
	}
	
	public OfficeWorker(OfficeWorker ow) {
		this.firstName = ow.firstName;
		this.lastName = ow.lastName;
		this.employeeNum = ow.employeeNum;
		this.department = ow.department;
		this.doe = ow.doe;
	}
	
	
	public String getFirstName() {
		return firstName; 
	}
	
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	
	public String toString() {
	    return "Name: " + firstName + " " + lastName + "\n" +
	           "Employee Number: " + employeeNum + "\n" +
	           "Department: " + department + "\n" +
	           "DOE: " + doe.toString();
	}


}
