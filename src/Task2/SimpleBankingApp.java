package Task2;

import java.util.Scanner;

/**
 * The SimpleBankingApp class serves as a simple banking application for user interactions.
 */
public class SimpleBankingApp {
    /**
     * Controller instance for managing bank accounts and transactions.
     */
Controller controller=new Controller();
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);


    /**
     * Main method to initiate the SimpleBankingApp and handle user interactions.
     */
public void SimpleBankingApp(){
    System.out.println("Welcome to BankingApp");
    while (true){
        System.out.println("Enter your choice:");
        System.out.println("1)Deposit");
        System.out.println("2)Withdraw");
        System.out.println("3)Checking Balance");
        System.out.println("4)Exit");
        String choice=input.nextLine();
        switch (choice){
            case "1":
                System.out.println("Please enter your BankID");
                String BankID=input.nextLine();
                System.out.println("Please enter your Password");
                String Password=input.nextLine();
                System.out.println("Please enter the amount of money you want to deposit ");
                float DepositMoney= Float.parseFloat(input2.nextLine());
                if( controller.Deposit(BankID,Password,DepositMoney)) {
                    System.out.println("Deposit done successfully");
                }else{
                    System.out.println("Something went wrong during deposition of money");
                }
                break;
            case "2":
                System.out.println("Please enter your BankID");
                BankID = input.nextLine();
                System.out.println("Please enter your Password");
                Password=input.nextLine();
                System.out.println("Please enter the amount of money you want to withdraw ");
                float WithdrawMoney= Float.parseFloat(input2.nextLine());
                if(controller.Withdraw(BankID,Password,WithdrawMoney)) {
                    System.out.println("Withdraw done successfully");
                }else{
                    System.out.println("Something went wrong during withdrawal of money ");
                }
                break;
            case "3":
                System.out.println("Please enter your BankID");
                BankID = input.nextLine();
                System.out.println("Please enter your Password");
                Password=input.nextLine();
                if(controller.GetBankAccountBalance(BankID,Password)!=0) {
                    System.out.println("Your current Balance is "+controller.GetBankAccountBalance(BankID,Password));
                } else{
                    System.out.println("Something went wrong");
                }
                break;
            case "4":
                return;
            default:
                System.out.println("Please Enter correct choice");
        }
    }
}

}
