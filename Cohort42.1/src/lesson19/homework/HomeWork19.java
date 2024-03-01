package lesson19.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #19
 * @author Andrey Shishkov
 * @version 2024-03-01
 */
public class HomeWork19 {
    public static void main(String[] args) {
        RubberArray rb = new RubberArray();
        rb.add(8);
        rb.add(4);
        rb.add(3);
        rb.add(2);
        rb.add(1);
        System.out.println(rb);
        System.out.println(rb.contains(12));
        System.out.println(rb.indexOf(12));
        System.out.println(rb.indexOf(5));
        rb.add(-3, 3);
        System.out.println(rb);
    }
}
