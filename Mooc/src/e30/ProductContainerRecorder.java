package e30;

public class ProductContainerRecorder extends ProductContainer {

	private double initialVolume;
	private ContainerHistory containerHistory;
	
	public ProductContainerRecorder(String name, double capacityOriginal, double initialVolume) {
		super(name, capacityOriginal);
		this.initialVolume = initialVolume;
		containerHistory = new ContainerHistory();
		containerHistory.add(initialVolume);
	}
	
	public String history() {
		return containerHistory.toString();
	}
	
	

}
