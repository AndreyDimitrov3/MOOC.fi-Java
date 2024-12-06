package demo;

public class Person extends Subpage implements Hold {
	public Person() {
		super("Dog");
	}
	
	public Person(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(super.getName() + " barks");
	}
	
	public void makeNoise() {
		bark();
	}
} 
