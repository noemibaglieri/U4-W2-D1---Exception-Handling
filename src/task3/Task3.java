package task3;

import task3.entities.CurrentAccount;
import task3.entities.onLineAccount;
import task3.exceptions.BankException;

public class Task3 {
    public static void main(String[] args) {

        CurrentAccount ca1 = new CurrentAccount("Noemi Baglieri", 8000);
        onLineAccount oa1 = new onLineAccount("Noemi Baglieri", 8000, 200);

        CurrentAccount ca2 = new CurrentAccount("Linda Giorgetti", 110);

        try {
            ca1.withdrawMoney(900);
            ca2.withdrawMoney(110);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }

        try {
            oa1.withdrawMoney(240);
        } catch (BankException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Your balance is: " + ca1.printAccountBalance());
        System.out.println("Your balance is: " + ca2.printAccountBalance());

    }
}
