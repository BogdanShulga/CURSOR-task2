package main.java.classes;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListHandler {
    public static void replaceValues(List<String> list, String from, String to) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals(from)) {
                iterator.set(to);
            }
        }
    }

    public static <T> String toStringList(List<T> list) {
        StringBuilder b = new StringBuilder();
        Iterator<T> iterator = list.listIterator();
        b.append('{');
        b.append(iterator.next());
        while (iterator.hasNext()) {
            b.append(", ");
            b.append(iterator.next());
        }
        b.append('}');
        return b.toString();
    }

    public static void removeDivisibleByThree(List<Integer> list) {
        list.removeIf(integer -> integer % 3 == 0);
    }
}
