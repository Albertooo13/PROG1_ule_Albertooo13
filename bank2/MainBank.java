public class MainBank{
		
    public static void main (String args[]){
    		BankAccount myAccount, yourAccount;
    		// create an account for John with no money
    		myAccount = new BankAccount(new Person("John"));
    		// create an account for Charles with 3000 euros
    		yourAccount = new BankAccount(new Person("Charles"), 3000);
    		// show both accounts
    		System.out.println(myAccount);
    		System.out.println(yourAccount);
    		// deposit 1000 euros in John's account
    		myAccount.deposit(1000);
    		// withdraw 1000 euros from Charles' account
    		yourAccount.withdraw(1000);
    		// show both accounts once more
    		System.out.println(myAccount);
    		System.out.println(yourAccount);
    }
    
}
