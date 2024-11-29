package demo;

public class SubPage {
	private final int euros;
    private final int cents;

    public SubPage(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public SubPage plus(SubPage addition) {
        SubPage newMoney = new SubPage(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
    
    public boolean lessThan(SubPage compared) {
    	if(this.euros() < compared.euros()) {
    		return true;
    	} else if(this.euros() > compared.euros()) return false;
    	
    	if(this.cents() < compared.cents()) {
    		return true;
    	} else return false;
    }
    
    public SubPage minus(SubPage decreaser) {
        int subtractEuros = this.euros - decreaser.euros;
        int subtractCents = this.cents - decreaser.cents;
        
        if (subtractEuros >= 0){
            if (subtractCents < 0){
                subtractEuros = subtractEuros - 1;
                subtractCents = subtractCents + 100;
            }
        } else {
            subtractEuros = 0;
            subtractCents = 0;
        }
        
        SubPage newMoney = new SubPage(subtractEuros, subtractCents);
        return newMoney;

    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
