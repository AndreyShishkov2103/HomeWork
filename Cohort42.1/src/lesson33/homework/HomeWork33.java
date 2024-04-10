package lesson33.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #33
 * @author Andrey Shishkov
 * @version 2024-04-05
 * Задача 1. Написать метод, принимающий (в параметрах) два списка, реализующих интерфейс List.
 *           Метод должен возвращать список из значений, присутствующих в обоих коллекциях.
 */
public class HomeWork33 {
    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<Integer> listThree = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 0));

        System.out.println(GetInterSectionOfLists(listOne, listTwo));
        System.out.println(GetInterSectionOfLists(listOne, listThree));
    }

    static <T> List<T> GetInterSectionOfLists(List<T> listOne, List<T> listTwo) {
        List<T> result = new ArrayList<>();
        for (T item : listOne) {
            if (listTwo.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
