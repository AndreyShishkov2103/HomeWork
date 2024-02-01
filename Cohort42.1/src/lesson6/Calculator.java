package lesson6;

/**
 * AIT-TR, Java Basic, Lesson #6
 * @Version 2024-01-26
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression, like 4 :/*/-/+ 3:");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        switch (s) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case ":":
                System.out.println(a + " : " + b + " = " + (a / b));
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            default:
                System.out.println("Error: unknown action: " + s);
        }
    }
}