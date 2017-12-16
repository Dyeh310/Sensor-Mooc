package e19and20;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {

		if (name == null || name.length() > 40 || name.isEmpty()) {
			throw new IllegalArgumentException("The name cannot be empty or null or be over forty characters");
		}
		this.name = name;
		
		if (age < 0 || age >120) {
			throw new IllegalArgumentException("Age must be between 0-120");
		}
		this.age = age;

	}
	
	@Override
	public String toString () {
		return this.name + " " + this.age;
	}

}
