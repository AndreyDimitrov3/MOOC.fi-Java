package demo;

public class ProductWarehouse extends Warehouse {
	private String productName;
	
	public ProductWarehouse(String productName, double capacity) {
		super(capacity);
		this.productName = productName;
	}
	
	public void setName(String newName) {
		productName = newName;
	}
	
	public String getName() {
		return productName;
	}
}
