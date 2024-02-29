package Lesson14;

public class Clock {
    public static void main(String[] args) {
        time();
    }

    static void time() {
        outer:
        for (int i = 0; i < 6; i++) {
            inner1:
            for (int j = 0; j < 60; j++) {
                if (i > 1 && (j % 10 == 0)) {
                    System.out.println("Вооооооооооооот");
                    break outer;
                }
                inner2:
                for (int k = 0; k < 60; k++) {
                    int prod = k*i;
                    if (prod > j) {
                        System.out.println("В000000000Т");
                        continue inner1;
                    }
                    System.out.println(i + ":" + j + ":" + k);
                }
            }

        }
    }
}
