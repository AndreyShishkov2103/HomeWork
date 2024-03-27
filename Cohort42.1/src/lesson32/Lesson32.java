package lesson32;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #32
 * @version 2024-03-27
 */
public class Lesson32 {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
        }
    }
}
