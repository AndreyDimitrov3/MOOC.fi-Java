package demo;

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
	Map<String, Item> shoppingCart;
	
	public ShoppingCart() {
		this.shoppingCart = new HashMap<>();
	}
	
	public void add(String product, int price) {
		Item item = new Item(product, 1, price);
		
		for(Item itemCart : shoppingCart.values()) {
			if(itemCart.equals(item)) {
				itemCart.increaseQuantity();
				return;
			}
		}
		shoppingCart.put(product, item);
	}
	
	public int price() {
		int total = 0;
		for(Item item : shoppingCart.values()) {
			total += item.price();
		}
		return total;
	}
	
	public void print() {
		for(Item item : shoppingCart.values()) {
			System.out.println(item.getName() + ": " + item.getQty());
		}
	}
}
