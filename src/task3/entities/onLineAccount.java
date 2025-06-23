package task3.entities;

public class onLineAccount extends CurrentAccount {
    private double maxWithdraw;

    public onLineAccount(String accountHolder, double balance, double maxW) {
        super(accountHolder, balance);
        this.maxWithdraw = maxW;
    }

    public void printBalance() {
        System.out.println("Account holder: " + accountHolder + " - Balance: " + balance + " - Number of movements: " + nMovements + " - Max movements: " + maxMovements + " - Max allowed withdraw: " + maxWithdraw);
    }

    public void withdrawMoney(double x) {
        if (x <= maxWithdraw) {
            super.withdrawMoney(x);
        }
    }
}
