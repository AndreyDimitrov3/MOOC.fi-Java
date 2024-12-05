package demo;

import java.util.Objects;

public class Item {
	private String product;
	private int qty;
	private int unitPrice;
	
	public Item(String product, int qty, int unitPrice) {
		this.product = product;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getName() {
		return product;
	}
	
	public int getQty() {
		return qty;
	}
	
	
	public int price() {
		return qty * unitPrice;
	}
	
	public void increaseQuantity() {
		qty++;
	}
	
	@Override
	public String toString() {
		return product + ": " + qty;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return Objects.equals(product, item.product);
	}
}
