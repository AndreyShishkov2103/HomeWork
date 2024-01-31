package lesson7;

import java.util.Random;
import java.util.Scanner;

public class CannonShot {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int damageRadius = 10;
        double g = 9.81;
        int angle;
        int speed;
        int distance = random.nextInt(1000) + 100;
        System.out.println("Enter start speed, m/s:");
        speed = scanner.nextInt();
        System.out.println("Enter angle, (°) [0..89]:");
        angle = scanner.nextInt();
        double realDistance = speed * speed * Math.sin(2 * Math.toRadians(angle)) / g;
        double difference = distance - realDistance;
        if (Math.abs(difference) < damageRadius) {
            System.out.println("You damage target");
        } else {
            if (realDistance < 0) {
                System.out.println("Over short " + realDistance);
            } else {
                System.out.println("Fell short " + realDistance);
            }
        }
    }
}
