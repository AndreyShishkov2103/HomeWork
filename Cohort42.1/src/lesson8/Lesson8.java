package lesson8;

import java.util.Arrays;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #8
 * @version 2024-01-31
 */
public class Lesson8 {
    public static void main(String[] args) {
        int[] array = {7, 2, -5, 11, 1, -2, 0};
        //array[0] = 12;
        System.out.println(array[2]);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
