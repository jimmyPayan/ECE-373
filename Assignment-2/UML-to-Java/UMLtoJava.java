/**
Main class for Assignment 2. 5 instances of each type of class. 
 */
public class UMLtoJava {

    public static void main (String[] args)
    {
        Account [] Accounts = new Account[16];
        
        for(int i = 0 ; i < 16 ; i++) {
            Accounts[i] = new Account();
            Accounts[i].deposit(5000 * i);
        }
        
        Accounts[15].setAccountType("Savings");
        
        // Superclasses
        AccountHolder one = new AccountHolder(1, "House One", Accounts[0]) {};
        AccountHolder two = new AccountHolder(2, "House Two", Accounts[1]) {};
        AccountHolder three = new AccountHolder(3, "House Three", Accounts[2]) {};
        AccountHolder four = new AccountHolder(4, "House Four", Accounts[3]) {};
        AccountHolder five = new AccountHolder(5, "House Five", Accounts[4]) {};
        
        // IndividualHolder subclasses
        IndividualHolder six = new IndividualHolder(6, "Penthouse Six", Accounts[5], "Individual Six", "666-66-6666");
        IndividualHolder seven = new IndividualHolder(7, "House Seven", Accounts[6], "Individual Seven", "777-77-7777");
        IndividualHolder eight = new IndividualHolder(8, "House Eight", Accounts[7], "Individual Eight", "888-88-8888");
        IndividualHolder nine = new IndividualHolder(9, "House Nine", Accounts[8], "Indivdual Nine", "999-99-9999");
        IndividualHolder ten = new IndividualHolder(10, "House Ten", Accounts[9], "Individual Ten", "101-01-0101");
        
        // CorporateHolder subclasses
        CorporateHolder eleven = new CorporateHolder(11, "House Eleven", Accounts[10],"Contact Eleven");
        CorporateHolder twelve = new CorporateHolder(12, "House Twelve",  Accounts[11],"Contact Twelve");
        CorporateHolder thirteen = new CorporateHolder(13, "House Thirteen", Accounts[12], "Contact Thirteen");
        CorporateHolder fourteen = new CorporateHolder(14, "House Fourteen", Accounts[13], "Contact Fourteen");
        CorporateHolder fifteen = new CorporateHolder(15, "2788 San Tomas Express Way, Santa Clara, CA 95051", Accounts[14], "Jensen Huang");
        
        fifteen.addAccount(Accounts[15]);
        
        System.out.printf("Executing UMLtoJava.java:\n\n");
        
        LazyIndividual(6, six);
        LazyIndividual(7, seven);
        LazyIndividual(8, eight);
        LazyIndividual(9, nine);
        LazyIndividual(10, ten);
        LazyCEO(11, eleven);
        LazyCEO(12, twelve);
        LazyCEO(13, thirteen);
        LazyCEO(14, fourteen);
        LazyCEO(15, fifteen);
        
        ten.checkSSN();
        
        System.out.printf("\n\nUMLtoJava.java complete.");
    }

    public static void LazySuper(int num, AccountHolder dummy) {
        System.out.printf("Account Holder %d has %d accounts.\n", num, dummy.getNumAccounts());
        
        for (int i = 1 ; i < dummy.getNumAccounts() + 1; i++) {
            System.out.printf("\tAccount %d is type %s with a balance $%.2f.\n", i, dummy.getAccountTypeOf(i), dummy.getBalanceOf(i));
        }
        System.out.printf("\n");
    }

    public static void LazyIndividual(int num, IndividualHolder dummy) {    
        System.out.printf("IndividualHolder %d Name: %s.", num, dummy.getName());
        System.out.printf("\tIndividualHolder %d SSN: %s.\n", num, dummy.getSSN());
        LazySuper(num, dummy);
    }
    
    public static void LazyCEO(int num, CorporateHolder dummy) {
        System.out.printf("CorporateHolder %d Contact: %s.\n", num, dummy.getContact());    
        LazySuper(num, dummy);
    }
}
