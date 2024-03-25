package lesson24.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #24
 * @author Andrey Shishkov
 * @version 2024-03-18
 */
public class HomeWork24 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Тиран/HomeWork/Cohort42.1mvn/demobase.db");
        StudentDAO studentDAO = new StudentDAO(connection);
        // add student
        // studentDAO.add(new Student("Peter", "cohort43"));
        // update
        studentDAO.update(new Student(8, null, "cohort43.1"));
        // delete
        studentDAO.delete(8);
        // read all students
        List<Student> students = studentDAO.readAll();
        for (Student student : students) {
            System.out.println(student);
        }
        studentDAO.close();
        connection.close();
    }
}
