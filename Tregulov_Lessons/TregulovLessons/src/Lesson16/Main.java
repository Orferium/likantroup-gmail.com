package Lesson16;

public class Main {
    public static void main(String[] args) {
        Main one = new Main();
        one.meth1("ya@yahoo.com;  on@mail.ru;  on@gmail.com;");
    }


     void meth1(String s) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < s.length() - 1) {

            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c+1);
            System.out.println(s.substring(a+1, b));
        }


    }

//    static void meth1() {
//        String s = "buba@yahoo.com;";
//        boolean b = s.contains("yahoo");
//        if (b == true) {
//            System.out.print("Yahoo");
//        }
//    }

}
