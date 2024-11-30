package demo;

public class MainPage {
    public static void main(String[] args) {
        SubPage book = new SubPage("Lord of the rings", 2);
        SubPage phone = new SubPage("Nokia 3210", 1);
        SubPage brick = new SubPage("brick", 4);

        Person adasCase = new Person(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Person pekkasCase = new Person(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
