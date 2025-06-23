package task2;

import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

        System.out.println("How many km did you travel?");
        int kmTravelled = scanner.nextInt();

        System.out.println("How many litres of fuel did you consume?");
        int fuelUsed = scanner.nextInt();

        int kmPerLitre = kmTravelled / fuelUsed;

        System.out.println("Your car's fuel efficiency is " + kmPerLitre + " km/l");

        }
        catch (ArithmeticException e) {

            System.out.println("This is impossible. How did you even do that. Please don't lie. Travelling with your car implies you used up fuel litres. Try again.");

        }
        catch (InputMismatchException e) {

            System.out.println("Was it a typo? 'cause I asked for a number, not whatever you typed just now. Run the program again.");
        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }
        finally {

            scanner.close();
        }
    }
}
