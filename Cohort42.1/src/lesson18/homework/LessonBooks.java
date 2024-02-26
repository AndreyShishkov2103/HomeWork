package lesson18.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #18
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class LessonBooks {
    private String authors;
    private String name;
    private String chapters;
    private static int count;

    public LessonBooks(String authors, String name, String chapters) {
        this.authors = authors;
        this.name = name;
        this.chapters = chapters;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "LessonBooks {" +
                "author='" + authors + '\'' +
                ", name='" + name + '\'' +
                ", chapters='" + chapters + '\'' +
                '}';
    }
}
