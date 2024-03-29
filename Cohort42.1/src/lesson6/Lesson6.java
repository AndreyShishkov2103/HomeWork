package lesson6;

import java.util.Scanner;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #6
 * @version 2024-01-26
 */
public class Lesson6 {
    public static void main(String[] args) {
        // switch
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
        // loop while
        int i = 5;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        // while with String
        String str = "4317";
        int p = 0;
        while (p < str.length()) {
            System.out.println(str.charAt(p));
            p++;
        }

        // do while
    }
}
