package main.java;

import main.java.classes.ArrayHandler;
import main.java.classes.ArrayListHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] intArr = new Integer[]{2, 3, 1, 7, 11};

        ArrayHandler.reverseOrder(intArr);

        List<String> count = new ArrayList<>();
        count.add("One");
        count.add("Two");
        count.add("Tree");
        count.add("Four");

        ArrayListHandler.replaceValues(count, "Tree", "Three");

        int[] array = {1, -5, 0, 3, -7, 9};

        ArrayHandler.posSum(array);

        ArrayHandler.average(array);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        ArrayListHandler.removeDivisibleByThree(list);
    }
}
