package demo;

public class Store extends Subpage implements Hold {
	public Store() {
		super("Cat");
	}
	
	public Store(String name) {
		super(name);
	}
	
	public void purr() {
		System.out.println(getName() + " purrs");
	}
	
	public void makeNoise() {
		purr();
	}
}
