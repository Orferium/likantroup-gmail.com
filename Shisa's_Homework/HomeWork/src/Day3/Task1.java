package Day3;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        divide2();
    }

    static void city() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите город или " + "stop" + " чтобы выйти: ");
        String text = sc.nextLine();
        switch (text) {
            case ("Москва"), ("Владивосток"), ("Ростов"):
                System.out.println("Россия");
                break;
            case ("Милан"), ("Рим"), ("Турин"):
                System.out.println("Италия");
                break;
            case ("Ливерпуль"), ("Манчестер"), ("Лондон"):
                System.out.println("Англия");
                break;
            case ("Берлин"), ("Мюнхен"), ("Кёльн"):
                System.out.println("Германия");
                break;
            case ("stop"):
                System.out.println("Программа завершила работу!!!");
                break;
            default:
                System.out.println("Неизвестная страна");
                break;


        }

    }


    static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа:  ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        while (true) {
            if (b <= 0) {
                System.out.println("Деление на 0");
                break;
            } else {
                double c = a / b;
                System.out.println(c);
                break;
            }
        }
    }

    static void divide2() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("Введите два числа" + "(ввод № " + i +"):  ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            if (b <= 0) {
                System.out.println("Деление на 0");
                continue;
            }
            double s = a/b;
            System.out.println(s);

            }
        }


    }




