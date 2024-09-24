
/**
Class CorporateHolder w/ getters + setters
 */
public class CorporateHolder extends AccountHolder
{
    // instance variables - replace the example below with your own
    private String Contact;

    /**
     * Constructor for objects of class CorporateHolder
     */
    public CorporateHolder(int ID, String Address, Account AccountHeld, String Contact)
    {
        super(ID, Address, AccountHeld);
        this.Contact = Contact;
    }

    public String getContact() {
        return this.Contact;
    }
    
    public void setContact(String Contact) {
        this.Contact = Contact;
    }
}
