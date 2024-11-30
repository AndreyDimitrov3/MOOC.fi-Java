package demo;

import java.util.ArrayList;

public class Hold {
	private int maxWeight;
	ArrayList<Person> holder;
	
	public Hold(int maxWeight) {
		this.maxWeight = maxWeight;
		this.holder = new ArrayList<>();
	}
	
	public void addSuitcase(Person suitcase) {
		this.holder.add(suitcase);
	}
	
	public int totalItems() {
		return this.holder.size();
	}

	public int totalWeight() {
		int totalWeight = 0;
		for(Person holds : holder) {
			totalWeight += holds.totalWeight();
		}
		return totalWeight;
	}
	
	public void printItems() {
		for(Person holds : holder) {
			System.out.print(holds.allItems());
		}
	}
	
	@Override
	public String toString() {
		return this.totalItems() + " suitcases (" + this.totalWeight() + "kg)";
	}
}
