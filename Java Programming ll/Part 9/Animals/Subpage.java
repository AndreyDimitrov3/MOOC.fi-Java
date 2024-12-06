package demo;

public abstract class Subpage {
	private String name;
	
	public Subpage(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sleep() {
		System.out.println(name + " sleeps");
	}
	
	public void eat() {
		System.out.println(name + " eats");
	}
}
