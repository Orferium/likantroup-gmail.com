package Lesson11;

public class Car {

    String color;
    String engine;
    int countDoors;

    public Car(String color1, String engine1, int countDoors1) {
        color = color1;
        engine = engine1;
        countDoors = countDoors1;
        System.out.printf(color1 + "\n" + engine1 + "\n" + countDoors1+ "\n");
    }



     static class CarTest {

        public static void change(Car c, Car d) {
        Car e = c;
        c = d;
        d = e;
        System.out.println(c.color);
        System.out.println(d.color);

        }
        }

        public static int changeDoor(int countDoors1) {
        countDoors1 = 3;
        //System.out.println(countDoors1);
        return countDoors1;
        }


    //
    public static void main(String[] args) {

        Car two = new Car("Red", "V8", 6);
        Car one = new Car("Green", "V8", changeDoor(two.countDoors));
        CarTest.change(two,one);






    }
}
