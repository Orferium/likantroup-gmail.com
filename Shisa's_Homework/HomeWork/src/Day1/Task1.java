package Day1;

public class Task1 {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
    }


    static void one() {
        int i = 1;
        while(i <= 10) {
            System.out.print("JAVA ");
                    i++;
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void two() {
        for(int i = 1; i <= 10; i++) {
            System.out.print("JAVA ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void three() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("JAVA");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void four() {
        int year = 1980;
        while(year < 2021) {
            System.out.println("Олимпиада " + year + " года.");
            year+=4;
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void five() {
        for(int year = 1980; year < 2021; year+=4) {
            System.out.println("Олимпиада " + year + " года.");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    static void six() {
        int prod = 1;
        for(int i = 1, a = 3; i < 10; i++) {
            prod = i * a;
           System.out.println(i + " * " + a + " = " + prod);

        }
    }
}
