package lesson5;

import java.util.Scanner;
import java.util.Random;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #5
 * @Author Andrey Shishkov
 * @Version 2024-01-26
 */
public class HomeWork5 {
    public static void main(String[] args) {

        //task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println(num);
        boolean a = num % 2 == 0; //even or not
        boolean b = num % 3 == 0; //multiple of 3 or not
        boolean c = a && b; //even and multiple of 3 or not
        System.out.println("Number: " + num + " even: " + a + ";" + " multiple of 3: " + b + ";" + " even and multiple of 3: " + c + ";");

        //task #2
        System.out.println("Enter the number: 1, 2, or 3");
        int num3 = scanner.nextInt();
        if (num3 == 1) {
            System.out.println("You entered: " + num3);
        } else if (num3 == 2) {
            System.out.println("You entered: " + num3);
        } else if (num3 == 3) {
            System.out.println("You entered: " + num3);
        } else System.out.println("Wrong number");

        //task #3
        Random random = new Random();
        int num1N = random.nextInt(101);
        int num2N = random.nextInt(101);
        int num3N = random.nextInt(101);
        int num4N = random.nextInt(101);
        System.out.println("Generated numbers: " + num1N + ", " + num2N + ", " + num3N + ", " + num4N + ";");
        int maxNum = Math.max(Math.max(num1N, num2N), Math.max(num3N, num4N));
        System.out.println("The MAX number is: " + maxNum);

        //task #4
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        String s = scanner1.nextLine();
        if (s.length() != 4) {
            System.out.println("Error: Please enter a four-digit number.");
            System.exit(1);
        }
        int number1 = s.charAt(0) - '0';
        int number2 = s.charAt(1) - '0';
        int number3 = s.charAt(2) - '0';
        int number4 = s.charAt(3) - '0';
        boolean luckyT = (number1 + number2) == (number3 + number4);
        if (luckyT) {
            System.out.println("Congratulations! It's a lucky ticket.");
        } else {
            System.out.println("Sorry, not a lucky ticket.");
        }
    }
}
