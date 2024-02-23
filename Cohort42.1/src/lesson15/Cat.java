package lesson15;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #15, HW #15 (task #1)
 * @version 2024-02-16 Lesson #15
 * @version 2024-02-23 HW #15 (task #1)
 */
public class Cat {
    String name;
    String color;
    int age;
    int volume;
    int food;
    int energy;

    public Cat(String name, String color, int age, int volume) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.volume = volume;
    }

    public void eat(int food) {
        this.food = food;
        energy += food;
        System.out.print("Energy capacity [%]: ");
    }

    public double satiated() {
        return (double) food / volume * 100;
    }

    public void voice() {
        System.out.println("Meow!");
    }

    public int walk() {
        if (energy > 10){
            System.out.println("Walk");
            energy -= 10;
        }else {
            System.out.println("The cat must eat");
        }
        return energy;
    }

    public int run() {
        if (energy > 20){
            energy -= 20;
            System.out.println("Run");
        } else {
            System.out.println("The cat must eat");
        }
        return energy;
    }
}
