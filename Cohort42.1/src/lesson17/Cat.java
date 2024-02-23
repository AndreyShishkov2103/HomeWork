package lesson17;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #17
 * @version 2024-02-21
 */
public class Cat {
    private String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println("Meow!");
    }
}
