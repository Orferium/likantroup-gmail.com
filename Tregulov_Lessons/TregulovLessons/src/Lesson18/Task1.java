package Lesson18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
    One twon = new One();
    int[] array = {1,9,-3,62,7,4,5};
    twon.sortirovka(array);
    }

    static class One {
         void sortirovka(int[] array) {
            for (int i = 0; i<array.length-1; i++) {
                for (int j=array.length-1; j>i; j--) {
                    if (array[j-1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
