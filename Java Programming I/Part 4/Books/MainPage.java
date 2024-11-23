package demo;

import java.util.Scanner;
import java.util.ArrayList;

public class MainPage {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<SubPage> information = new ArrayList<>();
		String title;
		int pages;
		int published;
		
		while(true) {
			System.out.println("Title: ");
			title = kb.nextLine();
			if(title.isEmpty()) {
				break;
			}
			
			System.out.println("Pages: ");
			pages = Integer.valueOf(kb.nextLine());
			System.out.println("Publication year: ");
			published = Integer.valueOf(kb.nextLine());
			
			information.add(new SubPage(title, pages, published));
		}
		
		System.out.println("What information will be printed?");
		String whatPrint = kb.nextLine();
				
		for(SubPage names : information) {
			if(whatPrint.toLowerCase().equals("everything")) {
				System.out.println(names);
			} else System.out.println(names.getTitles());
		}
		
		kb.close();
	}
}
