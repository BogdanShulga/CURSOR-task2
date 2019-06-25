package main.java.classes;

public class ArrayHandler {
    public static void bubbleReverseOrder(Integer[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static int posSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static String average(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i : array) {
            sum += i;
            count++;
        }
        double average;
        if (count != 0) {
            average = sum / count;
        } else average = 0;

        int iMax = array.length - 1;
        StringBuilder b = new StringBuilder();
        b.append('{');
        for (int i = 0; ; i++) {
            b.append(array[i]);
            if (i == iMax) {
                b.append('}');
                break;
            }
            b.append(", ");
        }

        return "array" + b.toString() + " -> avg = " + average;
    }
}
