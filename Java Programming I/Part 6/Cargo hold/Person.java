package demo;

import java.util.ArrayList;

public class Person {
	ArrayList<SubPage> items;
	int maxWeight;
	
	public Person(int maxWeight) {
		this.items = new ArrayList<>();
		this.maxWeight = maxWeight;
	}
	
	public void addItem(SubPage item) {
		if(item.getWeight() + this.allowedWeight() <= this.maxWeight) {
			this.items.add(item);
		}
	}
	
	public int allowedWeight() {
		int allowedWeight = 0;
		for(SubPage item : items) {
			allowedWeight += item.getWeight();
		}
		return allowedWeight;
	}
	
	public void printItems() {
		for(SubPage item : items) {
			System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
		}
	}
	
	public String allItems() {
		String answer = "";
		for(SubPage item : items) {
			answer += item.toString() + "\n";
		}
		return answer;
	}
	
	public int totalWeight() {
		int totalWeight = 0;
		for(SubPage item : items) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}
	
	public SubPage heaviestItem() {		
		if (this.items.isEmpty()) return null;
		
		SubPage heaviest = this.items.get(0);
		for(SubPage item : items) {
			if(item.getWeight() > heaviest.getWeight()) {
				heaviest = item;
			}
		}
		return heaviest;
	}
	
	@Override
	public String toString() {
		if(this.items.size() == 0) return "no items (0 kg)";
		if(items.size() == 1) return "1 item (" + this.totalWeight() + " kg)";
		return this.items.size() + " items (" + this.allowedWeight() + "kg)";
	}
}
