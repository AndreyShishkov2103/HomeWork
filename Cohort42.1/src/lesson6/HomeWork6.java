package lesson6;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #6
 * @author Andrey Shishkov
 * @version 2024-01-31
 */
public class HomeWork6 {
    public static void main(String[] args) {

        // task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Wrong number!");
        }

        // task #2
        System.out.println("Enter day of week [1..7]: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong day of week!");
        }

        // task #3
        int i = 1;
        while (i < 11) {
            System.out.println("Task" + i);
            i++;
        }

        // task #4
        int count = 0;
        System.out.println("Numbers [1..100] multiples of 5:");
        do {
            count++;
            if (count % 5 == 0) {
                System.out.println(count);
            }
        } while (count < 100);

        // task #5
        Scanner scanner1 = new Scanner(System.in);
        count = 0;
        String word = "";
        do {
            count++;
            System.out.println("Say 'hello':");
            word = scanner1.nextLine();
        } while (!word.equalsIgnoreCase("hello"));
        System.out.println("You entered right word using " + count + " attempts");

    }
}
