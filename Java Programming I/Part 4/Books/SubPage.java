package demo;

public class SubPage {
	private String title;
	private int pages;
	private int published;
	
    public SubPage(String title, int pages, int published) {
    	this.title = title;
    	this.pages = pages;
    	this.published = published;
    }
    
    public String getTitles() {
    	return this.title;
    }
    
    @Override
    public String toString() {
    	return this.title + ", " + this.pages + ", " + this.published;
    }
}
