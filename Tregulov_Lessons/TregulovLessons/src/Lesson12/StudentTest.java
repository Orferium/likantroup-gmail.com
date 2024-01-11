package Lesson12;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        StudentTest one = new StudentTest();
        one.meth2();

    }




    String name;
    String name2;
    int age;
    int age2;


    public void meth1() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите имя студента 1 и нажмите Enter: ");
        name = sc.nextLine();
        System.out.println("Введите возраст студента 1 и нажмите Enter: ");
        age = sc.nextInt();
        System.out.println("Введите имя студента 2 и нажмите Enter: ");
        name2 = sc2.nextLine();
        System.out.println("Введите возраст студента 2 и нажмите Enter: ");
        age2 = sc.nextInt();
        if (name.equals(name2) && age == age2) {
            System.out.print("Вы ввели данные одного и того же студента");
        } else {
            System.out.print("Данные успешно внесены!");
        }

    }

    public void meth2() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите имя студента 1 и нажмите Enter: ");
        name = sc.nextLine();
        System.out.println("Введите возраст студента 1 и нажмите Enter: ");
        age = sc.nextInt();
        System.out.println("Введите имя студента 2 и нажмите Enter: ");
        name2 = sc2.nextLine();
        if (name.equals(name2)) {
            System.out.print("Вы ввели одинаковые имена!! Данные не внесены.");
            return;
        }
        System.out.println("Введите возраст студента 2 и нажмите Enter: ");
        age2 = sc.nextInt();
        if (age == age2) {
            System.out.print("Вы ввели одинаковый возраст!! Данные не внесены.");
            return;
        } else {
            System.out.print("Данные успешно внесены!");
        }


    }



}
