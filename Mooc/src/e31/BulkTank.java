package e31;

public class BulkTank {
	
	private double volume;
	private double capacity = 2000.0;
	private double freeSpace;

	public BulkTank() {
	}
	
	public BulkTank(double capacity) {
		this.capacity = capacity;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public double getVolume() {
		return this.volume;
	}
	
	public double howMuchFreeSpace() {
		freeSpace = getCapacity() - getVolume();
		return freeSpace;
	}
	
	public void addToTank(double amount) {
		volume += amount;
		if (volume > capacity) {
			volume = capacity;
		}
		
	}
	
	public double getFromTank(double amount) {
		volume -= amount;
		if (volume < 0) {
			volume = 0;
		}
		return volume;
	}
	
	public String toString() {
		return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
	}
	
}
