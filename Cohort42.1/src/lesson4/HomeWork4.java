package lesson4;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #4
 * @Author Andrey Shishkov
 * @Version 2024-01-26
 */
public class HomeWork4 {
    public static void main(String[] args) {

        // task #1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your surname:");
        String surname = scanner.next();
        System.out.println("Enter your city:");
        String city = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your height (in meters):");
        float height = scanner.nextFloat();
        System.out.println("Output:");
        System.out.println("My name is " + name + " " + surname + ", " + "I'm " + age + " years old," + " " + "my city is " + city + ", " + "my height is " + height*100 + " cm.");

    }
}
