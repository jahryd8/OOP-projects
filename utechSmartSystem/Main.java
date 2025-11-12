package utechSmartSystem;

public class Main {

	public static void main(String[] args) {
		SmartMeter meter_A = new SmartMeter();
		meter_A.display();
		meter_A.incrementConsumption();
		meter_A.display();
	}
}
