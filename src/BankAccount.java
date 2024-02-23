public class BankAccount {
    private String id;
    private String name;
    private double balance;

    public BankAccount() {
        this.id = "6530901004";
        this.name = "Narongsak P";
        this.balance = 100;
    }

    public BankAccount(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("---------------      ---------------");
            System.out.println("Deposit successful.");
            System.out.println("---------------      ---------------");
        } else {
            System.out.println("---------------      ---------------");
            System.out.println("Please enter a valid amount.");
            System.out.println("---------------      ---------------");
        }
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("---------------      ---------------");
            System.out.println("Withdrawal successful.");
            System.out.println("---------------      ---------------");
        } else {
            System.out.println("---------------      ---------------");
            System.out.println("Insufficient funds.");
            System.out.println("---------------      ---------------");
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}
