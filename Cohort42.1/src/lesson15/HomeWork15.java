package lesson15;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #15 (task #2)
 * @author Andrey Shishkov
 * @version 2024-02-23
 */
public class HomeWork15 {

    public static void main(String[] args) {
        System.out.println("Fuel calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your car");
        CarRide carRide = new CarRide("Toyota", "Camry", "White");
        System.out.println("Car brand: " + carRide.brand + "; Car model: " + carRide.model + "; Car color: " + carRide.color);
        System.out.println("Enter  fuel consumption per 100 km");
        carRide.averageFuelConsumption(scanner.nextDouble());
        System.out.println("Enter the distance (km)");
        carRide.drive(scanner.nextDouble());
        System.out.println("Required for travel (liters)");
        System.out.println(carRide.needFuel() + " l");
        System.out.println("Enter the fuel price (EUR)");
        carRide.fuelPrice(scanner.nextDouble());
        System.out.println("Fuel price:");
        System.out.println(carRide.ridePrice() + " EUR");
        System.out.println("The Car");

        Auto car = new Auto(5, 50);
        if (car.startEngine()) {
            System.out.println("Drive: " + car.drive(50));
            System.out.println("Fuel: " + car.fuel);
        }
    }
}