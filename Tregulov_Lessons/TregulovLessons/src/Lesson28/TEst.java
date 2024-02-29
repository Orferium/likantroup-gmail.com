package Lesson28;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TEst {
    public static void main(String[] args) {
        LocalDateTime first = LocalDateTime.of(2012, Month.JANUARY, 1, 9, 0);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
        System.out.println(first.format(f));
    }
}
