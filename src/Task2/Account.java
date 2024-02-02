package Task2;

public class Account {

    private String BankId;
    private String Password;
    private float Balance;

    Account(String BankID,String Password,float Balance){
        this.BankId=BankID;
        this.Password=Password;
        this.Balance=Balance;
    }

    public String GetBankID(){
        return BankId;
    }
    public String GetPassowrd(){
        return Password;
    }
    public float GetBalance(){
        return Balance;
    }
    public void SetBalance(float balance) {
        this.Balance = balance;
    }

}
