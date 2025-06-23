package task3.entities;

import task3.exceptions.BankException;

public class OnlineAccount extends CurrentAccount {
    private double maxWithdraw;

    public OnlineAccount(String accountHolder, double balance, double maxW) {
        super(accountHolder, balance);
        this.maxWithdraw = maxW;
    }

    public void printBalance() {
        System.out.println("Account holder: " + accountHolder + " - Balance: " + balance + " - Number of movements: " + nMovements + " - Max movements: " + maxMovements + " - Max allowed withdraw: " + maxWithdraw);
    }

    public void withdrawMoney(double x) throws BankException {

        if (x <= maxWithdraw) {
            super.withdrawMoney(x);
        } else throw new BankException("Withdraw not available. You get to withdraw " + maxWithdraw + "€ max.");
    }
}
