package trafficLight;
import java.util.Scanner;

public class TrafficLight {
	
	private int currentLight = 0; // 0 = Red, 1 = Green, 2 = Amber

    public void changeLight() {
        switch (currentLight) {
            case 0:
                System.out.println("Red");
                break;
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Amber");
                break;
        }

        // Move to the next light (cycle 0 to, then  1 to 2,  then back to  0)
        currentLight = (currentLight + 1) % 3;
    }
	
	public static void main(String[] args) {
		
		
		TrafficLight light = new TrafficLight();

        // Simulate the light changing 3 times
        for (int i = 0; i < 3; i++) {
            light.changeLight();
        }

        String choice = "";

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your favourite light: ");
        choice = reader.next();
        reader.close();

        System.out.println("Your favourite light is: " +choice);
    

    


		
	}

}
