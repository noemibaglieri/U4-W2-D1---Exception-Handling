package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {4, 5, 2, 8, 1};

        System.out.println("Current numbers: " + Arrays.toString(numbers));

        while(true) {
            System.out.println("Insert a number (1 to 10) or press 0 to quit:");

            int input = scanner.nextInt();

            if(input == 0) {

                System.out.println("Updated array: " + Arrays.toString(numbers));
                break;

            } else if (input < 1 || input > 10) {

                System.out.println("Number not supported.");

            } else {

                System.out.println("What position of the array? (1-5)");

                int position = scanner.nextInt();

                if(position <= 0 || position > numbers.length) {

                    System.out.println("This array position doesn't exist. Available positions: 1-5");

                } else {

                    numbers[position - 1] = input;

                    System.out.println(Arrays.toString(numbers));

                }
            }
        }
    }
}
