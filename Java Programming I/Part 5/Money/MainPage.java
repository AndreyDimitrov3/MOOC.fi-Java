package demo;

public class MainPage {
    public static void main(String[] args) {
    	SubPage a = new SubPage(10, 0);
    	SubPage b = new SubPage(3, 50);

    	SubPage c = a.minus(b);

    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);

    	c = c.minus(a);
    	
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    }
}
