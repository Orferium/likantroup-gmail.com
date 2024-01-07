package Lesson8;

public class First {
    public static void main(String[] args) {
        // method1(1,2,3);
        //method2(38, 5);

    }

    static int method1(int a, int b, int c) { //хочу вывести отдельно целое число и округлённый остаток
        int d = a * b * c;
        System.out.println(d);
        return d;
    }


    static void method2(int a, int b) {
        double c = (double) a / b;
        System.out.printf("%.2f", c); //ограничиваем вывод остатка двумя знаками после запятой
        System.out.println();
    }

    //  на всякий написал вторую вариацию method2, так как не совсем понял условие задачи
//    static void method2(int a, int b) {
//        int c = a / b;
//        double d = a % b;
//        if (d > 4 ) {
//            System.out.println("Целое частное: " + c);
//            //d = Math.round(d);
//            System.out.println("Остаток: " + d);
//        }
//        else if (d <= 4 ){
//            System.out.println("Целое частное: " + c);
//           // d = Math.floor(d);
//            System.out.println("Остаток: " + d);        }
//    }


    static final double p = 3.14;

    double sKruga(int r) {
        double s = (double) p * r * r;
        //System.out.println("Радиус = " + s);
        return s;
    }

    static double dlinaOkr(int r) {
        double d = 2 * p * r;
        //System.out.print("Длина окружности = " + d);
        return d;
    }

    public void inf(int r) {
        System.out.print("Радиус = " + r + "\n" +
                "Площадь круга = " + sKruga(r) + "\n" + "Длина окружности = " + dlinaOkr(r));
    }


}

