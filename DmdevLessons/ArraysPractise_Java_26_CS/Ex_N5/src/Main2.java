public class Main2 {

    public static void main(String[] args) {
//Определить сумму элементов целочисленного массива, расположенных между минимальными и максимальными значениями
        int[] values = {1, 7, 0, 28, -24, 2, 8, -4, 109, 5, -30};
        System.out.println("Sum: " + sum(values));
    }


    public static int sum(int[] values) {
        int result = 0;
        int minIndex = Main.getMinIndex(values);
        int maxIndex = Main.getMaxIndex(values);
        //int startIndex = minIndex < maxIndex ? minIndex : maxIndex;
        int startIndex = Math.min(minIndex, maxIndex);
        int endIndex = Math.max(minIndex, maxIndex);
        for (int i = minIndex + 1; i < maxIndex; i++) {
            result += values[i];
        }
        return result;
    }


}
