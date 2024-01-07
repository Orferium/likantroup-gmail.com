//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
//Определить сумму элементов целочисленного массива, расположенных между минимальными и максимальными значениями
    int[] values = {1, 7, 0, 28, -24, 2, 8, 109, 5};
    System.out.println("Sum: " + sum(values));
    }

    public static int sum(int[] values) {
        int result = 0;
        int minIndex = getMinIndex(values);
        int maxIndex = getMaxIndex(values);
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
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

