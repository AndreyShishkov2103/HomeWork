package lesson7;

import java.util.Random;
import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #7
 * @author Andrey Shishkov
 * @version 2024-01-31
 */
public class HomeWork7 {
    public static void main(String[] args) {

        // task #1
        // create and init variables
        Random random1 = new Random();
        Scanner scanner1 = new Scanner(System.in);
        do {
            int number = random1.nextInt(10);
            int counter = 0;
            int answer = -1;
            // main game loop
            while (answer != number && counter < 3) {
                counter++;
                System.out.println("Guess the number [0..9]:");
                answer = scanner1.nextInt();
                if (answer < number) {
                    System.out.println("Your number is less");
                } else if (answer > number) {
                    System.out.println("Your number is greater");
                }
            }
            // to show result of game
            if (answer == number) {
                System.out.println("You WIN!");
            } else {
                System.out.println("You LOSE! It was " + number);
            }
            System.out.println("Play again? [1-yes, 0-no]");
        } while (scanner1.nextInt() == 1);

        // task #2
        // create and init variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            double targetDist = random.nextInt(20000), angle, speed, range, affectedArea = 15.0, g =9.81;
            int count = 0;
            System.out.println("You need to hit the target at " + targetDist + " m. You have 5 attempts.");
            System.out.println("Affected area, 15.0 m");
            while (count < 5) {
                System.out.println("Enter the initial speed (m/s): ");
                speed = scanner.nextDouble();
                System.out.println("Enter the launch angle (deg.): ");
                angle = scanner.nextDouble();
                range = (speed * speed) * Math.sin(2 * Math.toRadians(angle)) / g;
                if (Math.abs(targetDist - range) <= affectedArea) {
                    System.out.println("Target hit, nice shot! Distance: " + targetDist + "m");
                    break;
                } else {
                    count++;
                    if (range > targetDist) {
                        System.out.println("Very long! Try again.");
                    } else {
                        System.out.println("Very short! Try again.");
                    }
                }
            }
            if (count == 5) {
                System.out.println("Out of attempts. You lose! The distance was: " + targetDist + "m");
            }
            System.out.println("Play again? [1-yes, 0-no]");
        } while (scanner.nextInt() == 1);

    }
}
