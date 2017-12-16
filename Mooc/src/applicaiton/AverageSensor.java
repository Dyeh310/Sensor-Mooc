package applicaiton;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

	private List<Sensor> sensorList;
	private List<Integer> readingList;

	public AverageSensor() {
		this.sensorList = new ArrayList<Sensor>();
		this.readingList = new ArrayList<Integer>();
	}

	@Override
	public boolean isOn() {
		for (Sensor s : sensorList) {
			if (s.isOn()) {
				return true;
			}
		}
		return false;
	}

	//Turns on all thermoters
	@Override
	public void on() {
		for (Sensor s : sensorList) {
			s.on();
		}
	}
	
	//Turns off all thermoters
	@Override
	public void off() {

		for (Sensor s : sensorList) {
			s.off();
		}
	}

	//adds up the average off all thermoter measuremeants
	@Override
	public int measure() { 
		if (isOn() == false) {
			
			throw new IllegalStateException ("The average sensor is off!!");
		}
		int totalTemperature = 0;
		for (Sensor s : sensorList) {
			totalTemperature += s.measure();
		}
		totalTemperature /= sensorList.size();
		readingList.add(totalTemperature);
		return totalTemperature;
	}

	//Ass a Sensor object
	public void addSensor(Sensor additional) {
		sensorList.add(additional);
	}
	
	public List<Integer> readings() {
		return readingList;
	}
	
	
	
	

}
