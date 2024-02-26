package lesson16;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #16
 * @version 2024-02-19
 */
public class Cat {
    public int maxVolume;

    public int realVolume;

    public Cat(int maxVolume) {
        this.maxVolume = maxVolume;
        this.realVolume = 0;
    }

    public void eat(Plate plate) {
        // a cat can't eat more than it can eat (maxVolume)
        int food = plate.amountFood();
        if (food > maxVolume - realVolume) {
            food = maxVolume - realVolume;
        }
        realVolume += food;
        plate.decreaseFood(food);
    }
}
