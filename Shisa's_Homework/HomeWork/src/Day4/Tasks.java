package Day4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {

        Tasks n = new Tasks();
        n.four();
    }

    void one() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите число:  ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int count8 = 0;
        int count1 = 0;
        int countHonest = 0;
        int countOdd = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11); // заполняем массив случ числами до 10 включительно
            if (array[i] > 8) count8++;                // проверяем кол-во элем-тов > 8
            if (array[i] == 1) count1++;           // проверяем кол-во элем-тов == 1
            if (array[i] % 2 == 0) countHonest++;  // проверяем кол-во чётных чисел
            countOdd++;                            // проверяем кол-во нечётных чисел
            sum += array[i];

        }
        System.out.println("Вы ввели число " + n);
        System.out.println();
        System.out.print("Массив такой: ");
        for (int j : array) { // выводим массив в консоль
            System.out.print(j + " ");
        }


        System.out.printf("\n\n");
        System.out.println("Длина массива " + array.length + " элементов");
        System.out.println("Количество чисел больше 8 =  " + count8);
        System.out.println("Количество чисел равных 1 =  " + count1);
        System.out.println("Количество чётных чисел =  " + countHonest);
        System.out.println("Количество нечётных чисел =  " + countOdd);
        System.out.println("Сумма всех элементво массива = " + sum);

        //System.out.println(array[0] + " " + array[1] + "");
    }


    void two() {
        Random random = new Random();
        int max = 0;
        int min = 0;
        int count = 0;
        int sum = 0;
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10_000);
        }
        for (int i : array) {
            System.out.print(i + " ");
            if (i > max) max = i;
            if (i < min) min = i;
            if (i % 10 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.printf("\n\n");
        System.out.println("Макимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0 = " + count);
        System.out.println("Сумма элементов массива, оканчивающихся на 0 = " + sum);

    }


    void three() {
        Random random = new Random();


        int[][] array = new int[2][2];
        int sum = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);

//                sum += array[j];
//                if (sum > max) {
//                    max = sum;
//                }

            }
            System.out.println(Arrays.toString(array[i]));

        }


        System.out.println(max);

    }


    void four() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx = i;
            }

        }
        System.out.println(maxSum);
        System.out.println(maxSumIdx);
    }
}

