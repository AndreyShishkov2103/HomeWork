package lesson22.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #22
 * @author Andrey Shishkov
 * @version 2024-03-17
 */
public class HomeWork22 {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        System.out.println(animal);
        System.out.println(animal.voice());

        Cat cat = new Cat(2, "gray");
        System.out.println(cat);
        System.out.println(cat.voice());

        Tiger tiger = new Tiger(3, "striped", "Thunder");
        System.out.println(tiger);
        System.out.println(tiger.voice());
    }
}
