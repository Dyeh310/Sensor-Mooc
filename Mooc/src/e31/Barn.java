package e31;

import java.util.Collection;

public class Barn {

	private BulkTank tank;
	private MilkingRobot milkingRobot;
	
	public Barn(BulkTank tank) {
		this.tank = new BulkTank();
	}
	
	public BulkTank getBulkTank() {
		return this.tank;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.milkingRobot = new MilkingRobot();
		this.milkingRobot.setBulkTank(this.tank);
	}
	
	public void takeCareOf(Cow cow) {
		if (this.milkingRobot ==null) {
			throw new IllegalStateException("The milking robot hasn't been installed!");
		}
		milkingRobot.milk(cow);
	}
	
	public void takeCareOf(Collection<Cow>cows) {
		if (this.milkingRobot == null) {
			throw new IllegalStateException("The milkining Roboty hasn't been installed");
		}
		
		for (Cow c : cows) {
			milkingRobot.milk(c);
		}
	}
	
	public String toString() {
		return tank.toString();
	}
	
}
