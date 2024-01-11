package Lesson13;

public class Month {
    public static void main(String[] args) {
        month(15);
    }

    static void month(int num) {
        switch (num) {
            case 1:
                System.out.println("Месяц - Январь, количество дней - 31");
                break;
            case 2:
                System.out.println("Месяц - Февраль, количество дней - 28");
                break;
            case 3:
                System.out.println("Месяц - Март, количество дней - 31");
                break;
            case 4:
                System.out.println("Месяц - Апрель, количество дней - 30");
                break;
            case 5:
                System.out.println("Месяц - Май, количество дней - 31");
                break;
            case 6:
                System.out.println("Месяц - Июнь, количество дней - 30");
                break;
            case 7:
                System.out.println("Месяц - Июль, количество дней - 31");
                break;
            case 8:
                System.out.println("Месяц - Август, количество дней - 30");
                break;
            case 9:
                System.out.println("Месяц - Сентябрь, количество дней - 31");
                break;
            case 10:
                System.out.println("Месяц - Октябрь, количество дней - 30");
                break;
            case 11:
                System.out.println("Месяц - Ноябрь, количество дней - 31");
                break;
            case 12:
                System.out.println("Месяц - Декабрь, количество дней - 3");
                break;
            default:
                System.out.println("Введите число от 1 до 12");
        }
        }

    }

