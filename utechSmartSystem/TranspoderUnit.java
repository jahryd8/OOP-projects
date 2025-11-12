package utechSmartSystem;

public class TranspoderUnit {
	private String serialNumber;
	private static int totalNumberUnits = 0;

	public TranspoderUnit() {
		this.serialNumber = "TU0000";
		totalNumberUnits++;
	}

	public TranspoderUnit(String serialNumber) {
		this.serialNumber = serialNumber;
		totalNumberUnits++;
	}

	public TranspoderUnit(TranspoderUnit tu) {
		this.serialNumber = tu.serialNumber;
		totalNumberUnits++;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public static int getTotalNumberUnits() {
		return totalNumberUnits;
	}

	public void send() {
		System.out.println("Sending...");
	}

	public void receive() {
		System.out.println("Receiving...");
	}

	public void display() {
		System.out.println("Serial No: " + serialNumber);
		System.out.println("Transponder Units Online: " + totalNumberUnits);
	}
}