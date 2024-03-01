package extend;

import java.util.Scanner;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #10
 * @author Andrey Shishkov
 * @version 2024-02-28, 2024-02-26, 2024-02-23, 2024-02-08
 */
public class Interpreter {
    public static void main(String[] args) {
        Variables variables = new Variables();
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    Integer value = variables.getValue(tokens[1]);
                    if (value != null) {
                        System.out.println(value);
                    }
                    break;
                case "exit":
                    System.out.println("Exit from interpreter.");
                    break;
                default:
                    variables.assignValue(line);
            }
        } while (!line.equals("exit"));
    }
}
