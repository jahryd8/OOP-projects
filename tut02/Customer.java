package tut02;

public class Customer {
	private String firstName;
    private String lastName;
    private String address;
    private int idNumber;
    private AgentAssigned agent;

    // Constructor
    public Customer(String firstName, String lastName, String address, int idNumber, AgentAssigned agent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idNumber = idNumber;
        this.agent = agent;
    }

    // Mutators (Setters)
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAddress(String address) { this.address = address; }
    public void setIdNumber(int idNumber) { this.idNumber = idNumber; }

    // Accessors (Getters)
    public String getFirstName() {
    	return firstName; }
    public String getLastName() {
    	return lastName; }
    public String getAddress() { 
    	return address; }
    public int getIdNumber() { 
    	return idNumber; }

    // Display method
    public void showInfo() {
        System.out.println("Customer Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("ID Number: " + idNumber);
        agent.showAgent(); // display agent info
    }


}
