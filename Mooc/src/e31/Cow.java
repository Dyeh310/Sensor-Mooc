package e31;

import java.util.Random;

public class Cow implements Milkable, Alive {

	private String name;
	private int udder;
	private double milk;
	private static final String[] NAMES = new String[] { "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke",
			"Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella",
			"Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu",
			"Virpi" };
	private Random r = new Random();

	public Cow() {
		this.udder = 15 + r.nextInt(40 - 15 + 1);
		int i = r.nextInt(NAMES.length);
		name = NAMES[i];
		
	}

	public Cow(String name) {
		this.udder = 15 + r.nextInt(40 - 15 + 1);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getCapacity() {
		return udder;
	}

	public double getAmount() {
		return milk;
	}

	public String toString() {
		return getName() + " " + getAmount() + "/" + getCapacity();
	}

	@Override
	public void liveHour() {
		double milkProduced = Math.ceil(0.7 + (2-0.7)*r.nextDouble());
		if (this.milk + milkProduced <= this.udder) {
			this.milk += milkProduced;
		}
	}

	@Override
	public double milk() {
		double tempAmountOfMilk = this.milk;
		this.milk = 0;
		return tempAmountOfMilk;
	}

}
