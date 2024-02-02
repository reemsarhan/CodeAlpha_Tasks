package Task2;

public class Controller {

    Database DB=new Database();

    public boolean Deposit(String BankID,String Password,float depositBalance){
        for(Account account:DB.BankAccounts){
            if(account.GetBankID().equals(BankID)&&account.GetPassowrd().equals(Password)){
                account.SetBalance(depositBalance+account.GetBalance());
                return true;
            }
        }
        return false;
    }
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
    public Account GetAccount(String BankID,String Password){
        for(Account account:DB.BankAccounts){
            if(account.GetBankID().equals(BankID)&&account.GetPassowrd().equals(Password)){
                return account;
            }
        }
        return null;
    }

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
