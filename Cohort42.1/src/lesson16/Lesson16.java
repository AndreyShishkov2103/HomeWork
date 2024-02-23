package lesson16;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #16
 * @version 2024-02-19
 */
public class Lesson16 {
    public static void main(String[] args) {
        Cat cat = new Cat(30);
        Plate plate = new Plate(50);
        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);

        plate.add(40);
        cat.eat(plate);
        //plate.feeding(plate.amountFood());
        System.out.println("Cat: " + cat.realVolume);
        System.out.println("Plate: " + plate.food);

    }
}
