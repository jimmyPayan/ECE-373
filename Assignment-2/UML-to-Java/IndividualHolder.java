/**
IndividualHolder class w/ getters + setters and a derived attribute
 */
public class IndividualHolder extends AccountHolder {
    
    private String Name;
    private String SSN;

    /**
     * Constructor for objects of class IndividualHolder
     */
    public IndividualHolder(int ID, String Address, Account AccountHeld, String Name, String SSN) {
        super(ID, Address, AccountHeld);
        this.Name = Name;
        this.SSN = SSN;
    }

    public String getName()
    {
        return this.Name;
    }
    
    public void setName(String name) {
        this.Name = Name;
    }
    
    public String getSSN() {
        return this.SSN;
    }
    
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    public void checkSSN() {
        if (SSN != null) {
            System.out.printf("At least one organization has your SSN.\n");
        }
    }
}
