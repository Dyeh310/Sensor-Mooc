package e30;

public class ProductContainer extends Container {

	private String name;
	
	public ProductContainer(String name, double capacityOriginal) {
		super(capacityOriginal);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " " + super.toString(); 
	}

}
