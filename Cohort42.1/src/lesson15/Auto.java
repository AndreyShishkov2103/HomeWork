package lesson15;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #15 (task #2)
 * @author Andrey Shishkov
 * @version 2024-02-23
 */
public class Auto {
    double fuel;
    double fuelVolume;
    boolean engineON;

    public Auto(double fuel, double fuelVolume) {
        this.fuel = fuel;
        this.fuelVolume = fuelVolume;
        this.engineON = false;
    }

    public void refuel(double fuel) {
        if (this.fuel + fuel > fuelVolume) {
            this.fuel = fuelVolume;
            return;
        }
        this.fuel += fuel;
    }

    public double drive(int distance) {
        if(!engineON) {
            return 0;
        }
        fuel -= 0.05 * distance;
        return distance;
    }

    public boolean startEngine() {
        engineON = fuel > 0;
        return engineON;
    }
}
