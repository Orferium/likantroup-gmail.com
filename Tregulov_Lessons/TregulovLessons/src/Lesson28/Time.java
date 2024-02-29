package Lesson28;
import java.time.*;
import java.time.format.DateTimeFormatter;




public class Time {
    public static void main(String[] args) {
        One o = new One();
        //System.out.print(o.first);
        LocalDateTime first = LocalDateTime.of(2012, Month.JANUARY, 1, 9, 0);
        LocalDateTime second = LocalDateTime.of(2012, Month.FEBRUARY, 25, 9, 0);
        Period p = Period.ofDays(1);
        Duration d = Duration.ofHours(3);
        o.smena(first, second, p, d);
    }

    static class One {
        LocalDateTime first = LocalDateTime.of(2017, Month.JANUARY, 1, 9, 0);
        LocalDateTime second = LocalDateTime.of(2016, Month.FEBRUARY, 3, 9, 0);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

//        One() {
//
//            System.out.println( first.format(f1));
//            System.out.println( second.format(f2));
//        }
        void smena(LocalDateTime l1, LocalDateTime l2, Period p, Duration d) {

            LocalDateTime data = l1;
            while (data.isBefore(l2)) {
               System.out.println("Работаем с: " + l1.format(f1));
                data = data.plus(p);
               System.out.println("Работаем до: " + data.format(f1));
               System.out.println("Отдыхаем с: " + data.format(f2));
                data = data.plus(d);
               System.out.println("Отдыхаем до: " + data.format(f2));


            }
        }


    }

}
