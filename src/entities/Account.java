package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, String holder, double initialDeposit) {
        this.number = accountNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int accountNumber, String holder) {
        this.number = accountNumber;
        this.holder = holder;
    }

    public int getAccountNumber(int i) {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposit() {
        return balance;
    }

    public String toString() {
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

    public void deposit(double amount) {
        balance += amount + 3.0;
    }
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

}
