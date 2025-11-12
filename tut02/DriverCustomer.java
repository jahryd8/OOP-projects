package tut02;

public class DriverCustomer {

	public static void main(String[] args) {
		AgentAssigned agent = new AgentAssigned("Tianna Agent", "876-545-1217");
        Customer cust = new Customer("Jaheim", "Ryder", "1 Old Lane St", 1234, agent);

        cust.showInfo();  // display all info

        // Update values using mutators
        cust.setIdNumber(4321);
        cust.setAddress("2 Queen St");

        System.out.println("\nAfter updates:");
        cust.showInfo();

        // Access individual value
        System.out.println("\nAccessed ID Number: " + cust.getIdNumber());

	}

}
