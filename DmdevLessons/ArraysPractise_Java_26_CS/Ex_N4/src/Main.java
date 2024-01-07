//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Написать 2 метода, которые определяют индекс минимального и максимального значения
        одномерного массива
         */

        int[] values = {1, 7, 0, 28, -24, 109, 5};
        System.out.println(getMinIndex(values));
        System.out.print(getMaxIndex(values));

    }

    public static int getMaxIndex(int[] values) {
        int maxIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[maxIndex] < values[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }


    public static int getMinIndex(int[] values) {
        int minIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}


