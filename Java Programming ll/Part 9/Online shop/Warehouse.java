package demo;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Warehouse {
	private Map<String, Integer> productPrice;
	private Map<String, Integer> productStock;

	public Warehouse() {
		this.productPrice = new HashMap<>();
		this.productStock = new HashMap<>();
	}
 	
	public void addProduct(String product, int price, int stock) {
		productPrice.put(product, price);
		productStock.put(product, stock);
	}
	
	public int price(String product) {
		if(productPrice.get(product) != null) {
			return productPrice.get(product);
		} else return -99;
	}
	
	public int stock(String product) {
		if(productStock.get(product) != null) {
			return productStock.get(product);
		} else return 0;
	}
	
	public boolean take(String product) {
		Integer currentStock = productStock.get(product);
		if(currentStock != null && currentStock > 0) {
			productStock.put(product, currentStock - 1);
			return true;
		} else return false;
	}
	
	public Set<String> products() {
		Set<String> set = new HashSet<>();
		for(String key : productStock.keySet()) {
			set.add(key);
		}
		return set;
	}
}
