package e31;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

	private String owner;
	private Barn barn;
	public List<Cow> cows;
	
	public Farm (String owner, Barn barn) {
		this.owner = owner;
		this.barn = barn;
		this.cows = new ArrayList<>();
	}

	public String getOwner() {
		return owner;
	}
	
	public void addCow(Cow cow) {
		cows.add(cow);
	}
	
	public String getcows() {
		String cow = "";
		if (cows.isEmpty()) {
			return " \t No cows";
		} else {
			for (Cow c : cows) {
				cow += "\t" + c + "\n";
  			}
			return cow;
		}
	}
	
	public String toString() {
		return "Farm Owner: " + getOwner() + "\n"
				+ "Barn bulk tank: " + barn.toString() + "\n"
						+ "Animals: \n" + getcows();
	}
	
	@Override
	public void liveHour() {
		for (Cow c : cows) {
			c.liveHour();
		}
	}

	public void manageCows() {
		for (Cow c : cows) {
			barn.takeCareOf(c);
		}
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		barn.installMilkingRobot(milkingRobot);
	}
	
}
