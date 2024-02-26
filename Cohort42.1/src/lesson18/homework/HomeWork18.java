package lesson18.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #18
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class HomeWork18 {
    public static void main(String[] args) {
        // task #1
        LessonBooks book1 = new LessonBooks("Mike McGrath", "Java programming for beginners", "6");
        System.out.println("Book: " + LessonBooks.getCount());
        System.out.println(book1);
        LessonBooks book2 = new LessonBooks("Kathy Sierra, Bert Bates", "Learning Java", "2, 4");
        System.out.println("Book: " + LessonBooks.getCount());
        System.out.println(book2);
        LessonBooks book3 = new LessonBooks("Herbert Shildt", "Java 8 Beginner's Guide (6th Edition)", "4, 6");
        System.out.println("Book: " + LessonBooks.getCount());
        System.out.println(book3);
        LessonBooks book4 = new LessonBooks("Kay Horstmann", "Core Java, Volume 1. Fundamentals (10th edition)", "4");
        System.out.println("Book: " + LessonBooks.getCount());
        System.out.println(book4);
    }
}
