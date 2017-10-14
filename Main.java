package applicaiton;

public class Main {

	public static void main(String[] args) {

		
		Sensor kumpula = new Thermometer();
		Sensor kaisaniemi = new Thermometer();
		Sensor helsinkiVanntaa = new Thermometer();
		
		AverageSensor helsinkiArea = new AverageSensor();
		helsinkiArea.addSensor(kumpula);
		helsinkiArea.addSensor(kaisaniemi);
		helsinkiArea.addSensor(helsinkiVanntaa);
		
		helsinkiArea.on();
		System.out.println("The temperature in Helsink area is " + helsinkiArea.measure() + " degrees");
		System.out.println("The temperature in Helsink area is " + helsinkiArea.measure() + " degrees");
		System.out.println("The temperature in Helsink area is " + helsinkiArea.measure() + " degrees");
		
		System.out.println("Readings: " + helsinkiArea.readings());
		
	}
}
