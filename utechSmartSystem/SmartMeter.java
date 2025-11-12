package utechSmartSystem;

 public class SmartMeter
{
	private String serialNumber;
	private int electricity;
	private TranspoderUnit transponder;
	
	public SmartMeter() {
		this.serialNumber = "000000";
		this.electricity = 0;
		this.transponder = new TranspoderUnit();
	}
		public SmartMeter(String serialNumber, int electricity, String tuSerialNumber) {
			this.serialNumber = serialNumber;
			this.electricity = electricity;
			this.transponder = new TranspoderUnit(tuSerialNumber);
		}
		void incrementConsumption(){
			this.electricity++;
		}
		void setSerialNumber(String serialNumber){
			this.serialNumber = serialNumber;
		}
		String getSerialNumber(){
			return this.serialNumber;
		}
		void setElectricityConsumption(int electricity){
			this.electricity = electricity;
		}	
		int getElectricityConsumption(){
			return electricity;
		}
		void display(){
			System.out.println("Meter Serial Number: " + serialNumber);
			System.out.println("Usage: " + electricity + " KWH");
			transponder.display();
		}	
}
