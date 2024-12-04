package demo;

public class Warehouse {
	private double capacity;
	private double balance;
	
	public Warehouse(double capacity) {
		this.capacity = capacity;
		this.balance = 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public double howMuchSpaceLeft() {
		return capacity - balance;
	}
	
	public void addToWarehouse(double amount) {
		if(amount >= 0) {
			if(getBalance() + amount >= getCapacity()) {
				balance = capacity;
			} else balance += amount;
		}
	}
	
	public double takeFromWarehouse(double amount) {
		if (getBalance() - amount < 0) {
	        double taken = getBalance();
	        balance = 0;
	        return taken;
        } else {
            balance -= amount;
            return getBalance();
        }
	}
	
	public String toString() {
		return "balance = " + getBalance() + ", space left = " + howMuchSpaceLeft();
	}
}
