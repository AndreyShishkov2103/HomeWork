package lesson17;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #17
 * @version 2024-02-21
 */
public class Lesson17 {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", "white", 3);
        cat.setName(null);
        System.out.println("Name: " + cat.getName() + ", color: " + cat.color + ", age: " + cat.age);
        cat.voice();
    }
}
