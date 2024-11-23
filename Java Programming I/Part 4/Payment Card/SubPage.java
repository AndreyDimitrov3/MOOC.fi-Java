package demo;

public class SubPage {
	private double balance;

    public SubPage(double openingBalance) {
    	this.balance = openingBalance;
    }
    
    public void eatAffordably() {
    	if(this.balance > 2.59) {
            this.balance = this.balance - 2.60;
    	}
    }
    
    public void eatHeartily() {
    	if(this.balance > 4.59) {
    		this.balance = this.balance - 4.60;
    	}
    }
    
    public void addMoney(double amount) {
    	if(amount > 0) {
        	if(this.balance + amount < 150) {
        		this.balance += amount;
        	} else this.balance += amount;	
    	}
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
