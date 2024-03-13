package lesson25;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #25
 * @version 2024-03-11
 */
public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.voice());

        Animal cat = new Cat();
        System.out.println(cat.voice());

        Animal dog = new Dog();
        System.out.println(dog.voice());
    }
}
