public class Account {

    public String accountName;
    public int balance;

    public Account(String accountName, int balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
        System.out.println("Successful withdrawal: " + amount + "/-");
        System.out.println("Present balance: " + this.balance + "/-");
    }
}
