package Lesson18;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
    One twon = new One();
    String[][] array = {
            {"hel", "bel"},
            {"booba"},
            {"_hell_", "boy"},
    };
    twon.showArray(array);
    }


    static class One {


        void showArray(String[][] array) {
            System.out.print("{  ");
            for (int i = 0; i < array.length; i++) {  //идём по строкам
                System.out.print("{");
                for (int j = 0; j < array[i].length; j++) {//идём по столбцам
                    if (j != array[i].length - 1) {
                        System.out.print(array[i][j] + ", ");
                    } else {
                        System.out.print(array[i][j]);
                    }
                }
                if (i != array.length - 1) {
                    System.out.print("}, ");
                } else {
                    System.out.print("}");
                }

            }
            System.out.print("  }");

        }
    }
}
