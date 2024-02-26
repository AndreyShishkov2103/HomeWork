package lesson16.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #16
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class StackVisualization {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("--- task #3 ---");
        System.out.println("Empty Stack: " + stack.toPrint()); // print empty Stack
        // push
        stack.push(1980);
        stack.push(3);
        stack.push(21);
        stack.push(43);
        System.out.println("Push to Stack: " + stack.toPrint());
        // pop
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack.toPrint());
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack.toPrint());
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack.toPrint());
    }
}
