package demo;

public class MainPage {
    public static void main(String[] args) {
    	Hold dog = new Person();
    	dog.makeNoise();

    	Hold cat = new Store("Garfield");
    	cat.makeNoise();
    	Store c = (Store) cat;
    	c.purr();
    }
}
