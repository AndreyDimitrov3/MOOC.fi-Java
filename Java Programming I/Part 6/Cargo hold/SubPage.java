package demo;

public class SubPage {
	private String name;
	private int weight;
	
	public SubPage(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return this.getName() + " (" + this.weight + "kg)";
	}
}
