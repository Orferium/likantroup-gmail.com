import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /* написать метод equals, который определяет, равны ли между собой соответствующие элементы
     * 2-х двумерных массивов
     */
    // решение dmdev'a - не моё
    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {4 ,5 ,6, 7},
                {4 ,5 ,6, 7},
                {7, 8 }
        };
        int[][] values2 = {
                {1, 2, 4},
                {4 ,5 ,6, 7},
                {4 ,5 ,6, 7}

        };
        System.out.println(equals(values1,values2));
    }

    public static boolean equals(int[][] values1, int[][] values2) {
        boolean result = true;
        if (values1.length != values2.length) {
            return false;
        }

        for (int i = 0; i < values1.length; i++) {
            int[] array1 = values1[i];
            int[] array2 = values2[i];
            if (array1.length != array2.length) {
                return false;
            }
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] != array2[j]) {
                    return false;
                }
            }
        }
        
        
        return true;
    }
}