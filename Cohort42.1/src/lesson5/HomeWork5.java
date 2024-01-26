package lesson5;

import java.util.Scanner;

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
    }
}
