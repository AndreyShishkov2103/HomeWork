package lesson23;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #23
 * @version 2024-03-06
 */
public class Lesson23 {
    public static void main(String[] args) {
        Lesson23 lesson23 = new Lesson23();
        // toString()
        System.out.println(lesson23);
        // hashCode()
        System.out.println(Integer.toHexString(lesson23.hashCode()));
        // getClass()
        System.out.println(lesson23.getClass().getSimpleName());
        // equals()
        lesson23.equals(lesson23);
        String s1 = "qwerty";
        String s2 = "qwerty";
        String s3 = "qwert";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }

    @Override
    public String toString() {
        return "Lesson23{}";
    }
}
