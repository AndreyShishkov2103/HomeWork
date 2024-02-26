package lesson16.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class Car {

    double maxFuel;

    double fuel;

    public Car(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public void refuel(PetrolStation station) {
        double toGet = station.decreaseFuel(maxFuel - fuel);
        fuel += toGet;
    }
}
