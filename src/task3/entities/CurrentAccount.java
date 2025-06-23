package task3.entities;

import task3.exceptions.BankException;

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

    public void withdrawMoney(double x) throws BankException {
        if (nMovements < maxMovements) balance = balance - x;
        else if (balance <= 0) throw new BankException("Your account is overdrawn");
        else balance = balance - x - 0.50;

        nMovements++;
    }

    public double printAccountBalance() {
        return balance;
    }
}
