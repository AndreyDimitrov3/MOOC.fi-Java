package demo;

import java.util.Scanner;

public class Exercises {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		while(true) {
		  System.out.println("Enter width");
			int width = kb.nextInt();
			
			triangle(width);
		}
	}
	
	private static void triangle(int width) {
	    for (int i = 0; i < width; i++) {
	        for (int j = 0; j < width - i - 1; j++) {
	            System.out.print(" ");
	        }
	        for (int j = 0; j < 2 * i + 1; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    for (int i = 0; i < 2; i++) {
	        for (int j = 0; j < width - 2; j++) {
	            System.out.print(" ");
	        }
	        
	        for (int j = 0; j < 3; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
	}
}
