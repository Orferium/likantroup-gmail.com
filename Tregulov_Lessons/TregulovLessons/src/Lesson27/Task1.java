package Lesson27;

import Lesson27.Exceptions.*;

public class Task1 {
    public static void main(String[] args) throws NeVodaException {
        Tiger t = new Tiger();
        t.eat("мясо");
        t.drink("водка");
    }


    static class Tiger {
        void eat(String name) {
            if (name.equals("мясо")) {
                System.out.println("Тигр ест " + name);
            } else if (!name.equals("мясо")) {
                throw new NeMyasoException("Тигр не ест " + name);

            }
        }

        void drink(String name) throws NeVodaException {
            if (name.equals("вода")) {
                System.out.println("Тигр пьёт воду");
            } else if (!name.equals("вода")) {
                try {
                    drink("вода");
                    try {
                        drink("Пиво");


                    }catch (Exception e) {
                        System.out.print("Message нутрянка" + e);
                    } finally {
                        System.out.print("Это нутрянка финал");
                    }
                    //throw new NeVodaException("Тигр не пьёт " + name);
                }catch (NeVodaException eq) {
                    System.out.print("Message внешка" + eq);
                }

            }
        }
    }
}

