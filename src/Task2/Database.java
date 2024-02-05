package Task2;

import java.util.ArrayList;

/**
 * The Database class manages a collection of bank accounts.
 */
public class Database {

    /**
     * ArrayList to store the bank accounts.
     */
    public static ArrayList<Account>BankAccounts=new ArrayList<>();

    /**
     * Constructor to initialize the Database with some sample bank accounts.
     */
    Database(){
        BankAccounts.add(new Account("1","1234",1000));
        BankAccounts.add(new Account("2","0000",9000));
        BankAccounts.add(new Account("3","1245",5000));
        BankAccounts.add(new Account("4","2345",6900));
        BankAccounts.add(new Account("5","1111",9090));
    }


}
