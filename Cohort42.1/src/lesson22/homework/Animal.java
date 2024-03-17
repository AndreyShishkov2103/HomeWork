package lesson22.homework;

public class Animal {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public String voice() {
        return "Unknown: unknown";
    }

    @Override
    public String toString() {
        return "Animal {" +
                "age=" + age +
                '}';
    }
}
