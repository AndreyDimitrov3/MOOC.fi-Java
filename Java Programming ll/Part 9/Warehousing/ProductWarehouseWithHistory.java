package demo;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
	
	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
	}
	
	@Override
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		changeHistory.add(getBalance());
	}
	
	@Override
	public double takeFromWarehouse(double amount) {
        double currentBalance = super.takeFromWarehouse(amount);
		changeHistory.add(getBalance());
		return currentBalance;
	}
	
	public void printAnalysis() {
		String answer = "";
		System.out.println("Product: " + getName() + "\nHistory: " + changeHistory.toString() + 
				"\nLargest amount product: " + changeHistory.maxValue() + 
				"\nSmallest amount of product: " + changeHistory.minValue() + "\n" +
				"Average: " + changeHistory.average());
	}
	
	public String history() {
		return changeHistory.toString();
	}
}
