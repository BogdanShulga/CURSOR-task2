package main.java.classes;

import java.util.List;
import java.util.ListIterator;

public class ArrayListHandler {
    public static void replaceValues(List<String> list, String from, String to) {
        System.out.println("ArrayList with wrong value: " + list);
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(from)) {
                iterator.set(to);
            }
        }
        System.out.println("Replaced value \"Tree\" by \"Three\": " + list);
    }

    public static void removeDivisibleByThree(List<Integer> list) {
        System.out.println("list before: " + list);
        list.removeIf(integer -> integer % 3 == 0);
        System.out.println("and list after removing all numbers which are divisible by 3: " + list);
    }
}
