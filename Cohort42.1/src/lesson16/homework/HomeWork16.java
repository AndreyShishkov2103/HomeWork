package lesson16.homework;

import lesson16.Cat;
import lesson16.Plate;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class HomeWork16 {
    public static void main(String[] args) {
        // task #1
        System.out.println("--- task #1 ---");
        Cat[] cats = {new Cat(20), new Cat(18), new Cat(20), new Cat(8)};
        Plate plate = new Plate(50);
        plate.add(40);

        // loop cats eating from 1 plate and each cat ate on [%]
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat: " + ((double)cat.realVolume/cat.maxVolume)*100 + "%");
        }

        // task #2
        System.out.println("--- task #2 ---");
        Car car = new Car(40);
        PetrolStation station = new PetrolStation(1000);
        System.out.println("The car is filled with fuel, l: " + car.fuel);
        System.out.println("Fuel station capacity, l:: " + station.fuel);

        car.refuel(station);
        System.out.println("The car is filled with fuel, l: " + car.fuel);
        System.out.println("Fuel station capacity, l: " + station.fuel);
    }
}
