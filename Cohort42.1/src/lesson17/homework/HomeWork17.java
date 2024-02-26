package lesson17.homework;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #17
 * @author Andrey Shishkov
 * @version 2024-02-26
 */
public class HomeWork17 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Andrey Shishkov", "CIO", "andrii.shyshkov@gmail.com", "+30672147214", 6200, 43),
                new Employee("Kirill Zhedrinskiy", "PM", "kirill.zhedrinskiy@gmail.com", "+380671111111", 5500, 39),
                new Employee("Alexey Zavgorodniy", "Analyst", "alexey.zavgorodniy@gmail.com", "+380672222222", 5700, 44),
                new Employee("Dmitriy Sulimenko", "Backend", "dmitriy.sulimenko@gmail.com", "+380673333333", 5000, 34),
                new Employee("Evgeniy Domrachev", "Frontend", "evgeniy.domrachev@gmail.com", "+380674444444", 4900, 33),
                new Employee("Alena Golovko", "QA", "alena.golovko@gmail.com", "+380675555555", 2500, 41)
        };
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}
