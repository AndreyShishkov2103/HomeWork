package lesson22.homework;

public class Cat extends Animal {
    protected String color;

    public Cat(int age, String color) {
        super(age);
        this.color = color;
    }

    public Cat(int age) {
        super(age);
    }

    @Override
    public String voice() {
        return "Cat: meows";
    }

    @Override
    public String toString() {
        return "Cat {" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
