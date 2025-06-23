package task3.entities;

public class CurrentAccount {
    protected String accountHolder;
    protected int nMovements;
    protected final int maxMovements = 50;
    protected double balance;

    public CurrentAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.nMovements = 0;
    }

    public void withdrawMoney(double x) {
        if (nMovements < maxMovements) balance = balance - x;
        else balance = balance - x - 0.50;
        nMovements++;
    }

    public double printAccountBalance() {
        return balance;
    }
}
