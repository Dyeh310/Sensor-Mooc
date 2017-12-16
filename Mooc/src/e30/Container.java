 package e30;

public class Container {

	protected double capacity;
	protected double capacityOriginal;
	protected double volume;
	
	public Container (double capacityOriginal) {
		if (capacityOriginal <= 0) {
			this.capacityOriginal = 0;
			this.capacity = 0;
		}
		this.capacityOriginal = capacityOriginal;
		this.capacity = capacityOriginal;
		this.volume = 0.0;

	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getOriginalCapacity() {
		return capacityOriginal;
	}
	
	public double getCurrentCapacity() {
		return this.capacity;
	}
	
	public void addToTheContainer(double amount) {
		if (amount < 0) {
			volume += 0;
		} if (volume <= getOriginalCapacity()) {
			volume += amount;
			capacity -= amount;
		} if (volume >= getOriginalCapacity() ) {
			volume = capacityOriginal;
			capacity = 0;
		}
	}
	
	public double takeFromTheContainer(double amount) {
		if (amount <= 0 ) {
			return volume;
		} else if (amount >= volume) {
			double temp = volume;
			volume = 0;
			capacity += amount;
				if (amount >= getCurrentCapacity()) {
					capacity = getOriginalCapacity();
				}
			return temp;
		} else {
			volume -= amount;
			capacity += amount;
			return volume;
		}
	}
	
	public String toString() {
		return "volume = " + volume + ", free space = " + capacity;
	}
	
}
