
/**
Account class with balance getters + setters and enumeration
 */
public class Account {
    public enum AccountType {
        Checking, Savings
    };
    
    private double balance;
    private AccountType TypeOfAccount;
    
    /**
     * Constructor for objects of class Account
     */
    public Account() {
        // initialise instance variables
        balance = 0;
        TypeOfAccount = AccountType.Checking;
    }

    public void deposit(double amt) {
        balance += amt;
    }
    
    public void withdraw(double amt) {
        balance -= amt;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public String getAccountType() {
        if (this.TypeOfAccount == AccountType.Savings)
            return "Savings";
        else 
            return "Checking";
    }
    
    public void setAccountType(String input) {
        if(input == "Savings")
        this.TypeOfAccount = AccountType.Savings;
        
        else
        this.TypeOfAccount = AccountType.Checking;
    }
    
}
