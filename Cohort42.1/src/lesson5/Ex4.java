package lesson5;

/**
 * AIT-TR, Java Basic, Lesson #5
 */
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        int t = scanner.nextInt();
        System.out.println(t > 28? "It's hot" : "It's NOT hot"); //Ternary operator
    }
}
