
/**
AccountHolder class w/ getters + setters
 */
abstract class AccountHolder {
    
    protected int ID;
    protected String Address;
    protected int numAccounts = 1;
    protected Account[] AccountHeld = new Account[50];
    
    /**
     * Constructor for objects of class AccountHolder
     */
    public AccountHolder(int ID, String Address, Account AccountHeld) {
            this.ID = ID;
            this.Address = Address;
            this.AccountHeld[0] = AccountHeld;
    }

    public String getAddress() {
        return this.Address;
    }
    
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void addAccount(Account AccountHeld) {
        this.AccountHeld[numAccounts] = AccountHeld;
        numAccounts++;
    }
    
    public int getNumAccounts() {
        return numAccounts;
    }
    
    public double getBalanceOf(int numAccount) {
        return this.AccountHeld[numAccount - 1].getBalance();
    }
    
    public String getAccountTypeOf(int numAccount) {
        if(this.AccountHeld[numAccount - 1].getAccountType() == "Savings")
            return "Savings";
        else 
            return "Checking";
    }    
}
