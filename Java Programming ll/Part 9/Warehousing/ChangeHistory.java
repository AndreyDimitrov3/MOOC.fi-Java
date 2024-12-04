package demo;

import java.util.ArrayList;

public class ChangeHistory {
	private ArrayList<Double> changes;

	public ChangeHistory() {
		this.changes = new ArrayList<>();
	}
	
	public void add(double status) {
		changes.add(status);
	}
	
	public void clear() {
		changes.clear();
	}
	
	public double maxValue() {
		changes.sort(null);
		return changes.get(changes.size() - 1);
	}
	
	public double minValue() {
		changes.sort(null);
		return changes.get(0);
	}
	
	public double average() {
		double sum = 0.0;
		for(double num : changes) {
			sum += num;
		}
		return sum / changes.size();
	}
	
	public String toString() {
		return changes.toString();
	}
}
