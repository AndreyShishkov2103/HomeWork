package lesson4;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Lesson #4
 */
public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Result:");
        System.out.println(a + " + " + b + " = " + (a + b));

        //class String
        String str = "Hello, Java";
        System.out.println(str.length());
    }
}
