package lesson16.homework;

import java.util.Arrays;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class Stack {

    private int[] stack = new int[10];
    private int idx = 0;

    public void push(int value) {
        if (idx < stack.length) {
            stack[idx] = value;
            idx++;
        } else {
            throw new RuntimeException("Stack overflow");
        }
    }

    public Integer pop() {
        if (idx > 1) {
            idx--;
            return stack[idx];
        }
        return null;
    }

    public String toPrint() {
        return Arrays.toString(Arrays.copyOf(stack, idx));
    }
}
