package lesson29;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #29
 * @version 2024-03-20
 */
public class Lesson29 {
    public static void main(String[] args) {
        RubberList rubberList = new RubberList();
        System.out.println(rubberList);
        rubberList.add(20);
        rubberList.add(3);
        rubberList.add(-8);
        rubberList.add(2024);
        rubberList.add(1);
        rubberList.add(-5);
        System.out.println(rubberList);
        // get
        System.out.println(rubberList.get(2));
        System.out.println(rubberList.get(3));
        System.out.println(rubberList.get(-1));
        System.out.println(rubberList.get(6));
        // remove
        rubberList.remove(0);
        System.out.println(rubberList);
        rubberList.remove(2);
        System.out.println(rubberList);
    }
}
