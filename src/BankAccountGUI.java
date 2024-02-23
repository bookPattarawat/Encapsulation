import java.util.Scanner;

public class BankAccountGUI {
    public static void main(String[] args) {
        int option;
        double deposit;
        double withdraw;
        Scanner kb = new Scanner(System.in);
        BankAccount bank = new BankAccount("0738052323", "Narongsak Pumpasert", 100);
        boolean exit = false;

        while (!exit) {
            System.out.println("====== Bank Account ======");
            System.out.println("ID Account: " + bank.getId());
            System.out.println("Name      : " + bank.getName());
            System.out.println("======      Menu    ======");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.print("Please select your choice [1 - 4] : ");
            option = kb.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Please enter amount: ");
                    deposit = kb.nextDouble();
                    System.out.println("-----------------------------------------");
                    System.out.println("========  Successfully executed  ========");
                    System.out.println("-----------------------------------------");
                    bank.deposit(deposit);
                    System.out.println("Balance       : " + bank.checkBalance() + " Bath");
                    System.out.println("=========  Thank you  =========");
                    break;
                case 2:
                    System.out.print("Please enter amount: ");
                    withdraw = kb.nextDouble();
                    System.out.println("-----------------------------------------");
                    System.out.println("========  Successfully executed  ========");
                    System.out.println("-----------------------------------------");
                    bank.withdraw(withdraw);
                    System.out.println("Balance       : " + bank.checkBalance() + " Bath");
                    System.out.println("=========  Thank you  =========");
                    break;
                case 3:
                    System.out.println("========  Check Balance  ========");
                    System.out.println("Balance       : " + bank.checkBalance() + " Bath");
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option selected.");
                    break;
            }
        }
    }
}
