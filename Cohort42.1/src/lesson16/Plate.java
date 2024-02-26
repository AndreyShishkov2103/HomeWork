package lesson16;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #16
 * @version 2024-02-19
 */
public class Plate {

    int capacity;

    int food;

    public Plate(int capacity) {
        this.capacity = capacity;
        this.food = 0;
    }

    public void add(int food) {
        // TODO check capacity
        this.food += food;
    }

    public int amountFood() {
        return food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }
}
