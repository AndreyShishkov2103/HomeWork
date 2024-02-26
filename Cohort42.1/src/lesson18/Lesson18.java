package lesson18;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #18
 * @version 2024-02-23
 */
public class Lesson18 {
    public static void main(String[] args) {
        final int a;
        a = 10;
        //a = 5 + 1; compile error if using final

        System.out.println(Robot.COMPANY_NAME);

        Robot robot = new Robot(8);
        System.out.println(robot);
        System.out.println(Robot.getCount());
        System.out.println(robot.add(2, 2));
        robot.addAndSave(5);
        robot.addAndSave(12);
        System.out.println(robot.getSum());

        Robot r2d2 = new Robot(2);
        System.out.println(r2d2);
        System.out.println(Robot.getCount());
        System.out.println(r2d2.getSum());
    }
}
