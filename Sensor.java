package applicaiton;

public class ConstantSensor implements Sensor {

	private int measureNum;
	
	public ConstantSensor(int measureNum) {
		this.measureNum = measureNum;
	}
	
	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void on() {
		
	}

	@Override
	public void off() {
		
	}

	@Override
	public int measure() {
		return measureNum;
	}

}
