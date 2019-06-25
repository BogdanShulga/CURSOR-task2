package main.java;

import main.java.classes.ArrayHandler;
import main.java.classes.ArrayListHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] intArr = new Integer[]{2, 3, 1, 7, 11};

        ArrayHandler.bubbleReverseOrder(intArr);
        System.out.println("Sorted in revers order array: " + Arrays.toString(intArr));

        List<String> count = new ArrayList<>();
        count.add("One");
        count.add("Two");
        count.add("Tree");
        count.add("Four");

        System.out.println("ArrayList with wrong value: " + ArrayListHandler.toStringList(count));
        ArrayListHandler.replaceValues(count, "Tree", "Three");
        System.out.println("Replaced value \"Tree\" by \"Three\": " + ArrayListHandler.toStringList(count));

        int[] array = {1, -5, 0, 3, -7, 9};

        System.out.println("The sum of all positive numbers in array " + Arrays.toString(array) + " = " + ArrayHandler.posSum(array));

        System.out.println(ArrayHandler.average(array));

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        System.out.println("list before: " + ArrayListHandler.toStringList(list));
        ArrayListHandler.removeDivisibleByThree(list);
        System.out.println("and list after removing all numbers which are divisible by 3: " + ArrayListHandler.toStringList(list));
    }
}
