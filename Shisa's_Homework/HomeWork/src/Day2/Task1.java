package Day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        formula();
    }

    static void house() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Ошибка ввода");
        } else {
            if (a > 0 && a < 5) {
                System.out.println("Малоэтажный дом");
            } else {
                if (a > 4 && a < 9) {
                    System.out.println("Среднеэтажный дом");
                } else {
                    if (a >= 9) {
                        System.out.println("Многоэтажный дом");
                    }
                }

            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }


    static void range() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 !=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void range2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int c = sc.nextInt(), d = sc.nextInt();
        int i = c;
        while (i < d) {
            if (i % 5 == 0 && i % 10 !=0) {
                System.out.print(i + " ");
                i++;
            } else {
                i++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void formula() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = sc.nextInt();
        double y;
        if (x > -3 && x < 5) {
            y = (x + 3) * ((x*x)-2);
            System.out.print(y);
        } else {
            if (x >= 5) {
                y = (double) ((x * x)- 10) / (x + 7);
                System.out.print(y);
            } else {
                y = 420;
                System.out.print(y);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

}