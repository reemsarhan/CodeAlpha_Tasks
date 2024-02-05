package Task2;

/**
 * The Controller class handles the interaction between the user and the Database for managing bank accounts and transactions.
 */
public class Controller {

    /**
     * Database instance for managing bank accounts.
     */
    Database DB=new Database();

    /**
     * Deposits funds into the specified bank account.
     *
     * @param BankID          The unique Bank ID associated with the account.
     * @param Password        The password associated with the account.
     * @param depositBalance  The amount to be deposited into the account.
     * @return True if the deposit is successful, false otherwise.
     */
    public boolean Deposit(String BankID,String Password,float depositBalance){
        for(Account account:DB.BankAccounts){
            if(account.GetBankID().equals(BankID)&&account.GetPassowrd().equals(Password)){
                account.SetBalance(depositBalance+account.GetBalance());
                return true;
            }
        }
        return false;
    }
    /**
     * Withdraws funds from the specified bank account.
     *
     * @param BankID          The unique Bank ID associated with the account.
     * @param Password        The password associated with the account.
     * @param withdrawBalance The amount to be withdrawn from the account.
     * @return True if the withdrawal is successful, false otherwise.
     */
    public boolean Withdraw(String BankID,String Password,float withdrawBalance){
        for(Account account:DB.BankAccounts){
            if(account.GetBankID().equals(BankID)&&account.GetPassowrd().equals(Password)
                    &&account.GetBalance()>=withdrawBalance) {
                account.SetBalance(account.GetBalance()-withdrawBalance);
                return true;
            }
        }
        return false;
    }
    /**
     * Retrieves the Account object associated with the specified Bank ID and password.
     *
     * @param BankID   The unique Bank ID associated with the account.
     * @param Password The password associated with the account.
     * @return The Account object if found, null otherwise.
     */
    public Account GetAccount(String BankID,String Password){
        for(Account account:DB.BankAccounts){
            if(account.GetBankID().equals(BankID)&&account.GetPassowrd().equals(Password)){
                return account;
            }
        }
        return null;
    }

    /**
     * Retrieves the current balance of the specified bank account.
     *
     * @param BankID   The unique Bank ID associated with the account.
     * @param Password The password associated with the account.
     * @return The current balance of the account, or 0 if the account is not found.
     */
    public float GetBankAccountBalance(String BankID,String Password){
        if(GetAccount(BankID,Password)!=null){
           Account account=GetAccount(BankID,Password);
           return account.GetBalance();
        }
        else{
            return 0;
        }
    }

}
