package lesson15;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #15, HW #15 (task #1)
 * @version 2024-02-16 Lesson #15
 * @version 2024-02-23 HW #15 (task #1)
 */
public class Lesson15 {
    public static void main(String[] args) {

        Cat cat = new Cat("Mursik", "White", 3, 100);
        cat.voice();
        System.out.println(cat.name +  ", " + cat.color + ", " + cat.age);
        cat.eat(10);
        System.out.println(cat.satiated());
        System.out.println(cat.walk());
        System.out.println();

        Cat cat1 = new Cat("Barsik", "Black", 5, 100);
        cat1.voice();
        System.out.println(cat1.name +  ", " + cat1.color + ", " + "age " + cat1.age);
        cat1.eat(80);
        System.out.println(cat1.satiated());
        System.out.println(cat1.run());
    }
}
