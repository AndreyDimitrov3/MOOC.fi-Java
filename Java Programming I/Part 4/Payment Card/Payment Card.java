package demo;

public class MainPage {
	public static void main(String[] args) {
        SubPage paulsCard = new SubPage(20);
        SubPage mattsCard = new SubPage(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
	}
}
