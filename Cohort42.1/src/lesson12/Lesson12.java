package lesson12;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #12
 * @version 2024-02-09
 */
public class Lesson12 {
    public static void main(String[] args) {
        // linear search
        int[] a = {1, 8, 12, -4, 6, 3};
        int toSearch = -4;
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == toSearch) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
