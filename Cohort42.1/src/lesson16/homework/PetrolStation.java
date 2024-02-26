package lesson16.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class PetrolStation {

    double fuel;

    public PetrolStation(double fuel) {
        this.fuel = fuel;
    }

    public double decreaseFuel(double fuel) {
        if (this.fuel - fuel < 0) {
            return 0;
        }
        this.fuel -= fuel;
        return fuel;
    }
}
