package e31;

public class MilkingRobot {

	private BulkTank bulkTank;
	
	public BulkTank getBulkTank() {
		if (bulkTank != null) {
			return this.bulkTank;
		} 
		return null;
	}
	
	public void setBulkTank(BulkTank tank) {
		this.bulkTank = tank;
	}
	
	public void milk (Milkable milkable) {
		if (this.getBulkTank() == null) {
			throw new IllegalStateException("This MilkingRobot hasn't been installed");
		} else {
			this.bulkTank.addToTank(milkable.milk());
		}
	}
	
}
