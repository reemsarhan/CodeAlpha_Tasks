package Task2;

/**
 * The Account class represents a bank account with a unique Bank ID, password, and balance.
 */
public class Account {

    private String BankId;
    private String Password;
    private float Balance;

    /**
     * Constructor to initialize an Account object with Bank ID, password, and initial balance.
     *
     * @param BankID   The unique Bank ID associated with the account.
     * @param Password The password associated with the account.
     * @param Balance  The initial balance of the account.
     */
    Account(String BankID,String Password,float Balance){
        this.BankId=BankID;
        this.Password=Password;
        this.Balance=Balance;
    }

    /**
     * Retrieves the unique Bank ID associated with the account.
     *
     * @return The Bank ID of the account.
     */
    public String GetBankID() {
        return BankId;
    }

    /**
     * Retrieves the password associated with the account.
     *
     * @return The password of the account.
     */
    public String GetPassowrd() {
        return Password;
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The balance of the account.
     */
    public float GetBalance() {
        return Balance;
    }

    /**
     * Sets the balance of the account to the given value.
     *
     * @param balance The new balance to set for the account.
     */
    public void SetBalance(float balance) {
        this.Balance = balance;
    }
}