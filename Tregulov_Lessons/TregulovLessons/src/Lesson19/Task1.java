package Lesson19;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        String[] arr2 = {"e", "f", "g"};
        abc(arr, arr2);
    }

    static void abc(String[]... arr) {
        for (String[] ara : arr) {
            System.out.print(Arrays.toString(ara));
            System.out.println("");
        }
    }
}
