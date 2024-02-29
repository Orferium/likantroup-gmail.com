package Lesson20;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {

        abc("a","r","a","g","g","g","s");
    }

    static void abc(String... s) {

        ArrayList <String> list1 = new ArrayList ();


        for (String x:s) {
            if (!list1.contains(x)) {
                list1.add(x);
            }
        }

        System.out.println(list1);
    }

}
