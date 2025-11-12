package tut02;

public class Driver {

	public static void main(String[] args) {
		
		Date hireDate = new Date(6, 6, 2025);
        OfficeWorker ow = new OfficeWorker("Jaheim", "Ryder", 1001, "SCIT", hireDate); //Test data
        System.out.println("Office Worker Info:");
        System.out.println(ow);
	}
    
    

}
