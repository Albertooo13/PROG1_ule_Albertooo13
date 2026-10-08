public class BankAccount{
		
	private Person owner;
	private int balance;

    public BankAccount(Person owner){
    	this.owner = owner; 
   		balance = 0;
    }

    public BankAccount(Person owner, int money){
    	this.owner = owner; 
   		this.balance = money;
    }
    
    public void deposit (int money){
    		balance = balance + money;
    }
    
    public void withdraw (int money){
    		balance = balance - money;
    }

    public String toString(){
    	    return "The balance for " + this.owner + " is " + this.balance;
    }

}
