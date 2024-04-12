package lesson36.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #36
 * @author Andrey Shishkov
 * @version 2024-04-12
 */
public class HomeWork36 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Shishkov", 2147214);
        pb.add("Petrov", 1111111);
        pb.add("Petrov", 2222222);
        pb.add("Sidorov", 3333333);

        System.out.println(pb.get("Shishkov"));
        System.out.println(pb.get("Petrov"));
        System.out.println(pb.get("Sidorov"));
        System.out.println(pb.get("Ivanov"));
    }
}
