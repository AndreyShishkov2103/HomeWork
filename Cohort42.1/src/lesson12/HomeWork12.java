package lesson12;

import extend.Stack;
import java.util.Arrays;
import java.util.Random;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #12
 * @author Andrey Shishkov
 * @version 2024-02-14
 */
public class HomeWork12 {
    public static void main(String[] args) {
        // task #1
        int[] array = createRandomArray(25, 25);
        System.out.println(Arrays.toString(array));
        System.out.println(linearSearch(array, 6));
        System.out.println(linearSearch(new int[]{1, 2, 3}, 4));

        // task #2
        selectionSort(array);
        System.out.println(Arrays.toString(array));

        // task #3
        System.out.println(binarySearch(array, 8));

        // task #4
        Stack.push(12);
        Stack.push(8);
        Stack.push(-3);
        System.out.println(Stack.arrayToString());
        System.out.println(Stack.pop());
        System.out.println(Stack.arrayToString());
    }

    public static int linearSearch(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int n) {
        int left = 0, right = a.length - 1;
        while (left + 1 != right) {
            int middle = left + (right - left) / 2;
            if (a[middle] == n) {
                return middle;
            }
            if (a[middle] > n) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return -1;
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i + 1];
            int minIdx = i + 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIdx = j;
                }
            }
            if (a[i] > min) {
                a[minIdx] = a[i];
                a[i] = min;
            }
        }
    }

    public static int[] createRandomArray(int len, int bound) {
        int[] a = new int[len];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(bound);
        }
        return a;
    }
}
