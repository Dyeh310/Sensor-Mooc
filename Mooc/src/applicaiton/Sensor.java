package applicaiton;

public interface Sensor {

	
	boolean isOn(); //returns true if the sensor is on
	void on();//switches the sensor off
	void off();//switches the sensor off
	int measure();//returns the sensor reading if it is on
	
}
