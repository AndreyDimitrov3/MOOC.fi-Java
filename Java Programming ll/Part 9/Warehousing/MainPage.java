package demo;

public class MainPage {
    public static void main(String[] args) {
    	ProductWarehouseWithHistory juicy = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
    	juicy.takeFromWarehouse(11.3);
    	juicy.addToWarehouse(1.0);
    	
    	juicy.printAnalysis();
    }
}
