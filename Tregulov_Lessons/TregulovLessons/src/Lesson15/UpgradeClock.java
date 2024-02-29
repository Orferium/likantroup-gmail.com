package Lesson15;

public class UpgradeClock {
    public static void main(String[] args) {
        time2();
    }

    static void time() {
        outer:
        for (int i = 0; i <= 6; i++) {
            inner1:
            for (int j = 0; j < 60; j++) {
                if (i > 1 && (j % 10 == 0)) {
                    System.out.println("Вооооооооооооот");
                    break outer;
                }
                inner2:
                for (int k = 0; k < 60; k++) {
                    int prod = k * i;
                    if (prod > j) {
                        j++;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                }
            }

        }
    }

    static void time2() {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i <= 6) {

            do {
                j++;


                while (k < 60) {
                    int prod = k * i;
                    if (prod > j) {
                        j++;
                    }
                    if (i > 1 && (j % 10 == 0)) {
                        System.out.println("Вооооооооооооот");
                        break;
                    }
                    k++;
                    System.out.println(i + ":" + j + ":" + k);
                }
            }
            while (j < 60) ;
            i++;
        }

    }
}

