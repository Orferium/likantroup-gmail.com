package Lesson22;



public class Task2 {
    public static void main(String[] args) {
       // Animal one = new Animal();
        Pet two = new Pet();
       // System.out.print(one);

    }

    static class Animal {
     Animal() {
         System.out.println("I Am Animal");
     }
     int eyes;

     void eat() {
         System.out.print("Animal eats");
     }

     void drink() {
         System.out.print("Animal drinks");
     }
    }

    static class Pet extends Animal {
        Pet() {
            System.out.println("I Am Pet");
            eyes = 2;

        }

        String name;
        int tail = 1;
        int paw = 4;

        void run() {
            System.out.print("Pet runs");
        }
        void jump() {
            System.out.print("Pet jumps");
        }

    }

    static class Dog extends Pet {
        Dog(String name) {
            System.out.println("Я собака, а моё имя - " + name);
        }

        void play() {
            System.out.print("Dog plays");
        }
    }

    static class Cat extends Pet {
        Cat(String name) {
            System.out.println("Я кошка, а моё имя - " + name);
        }

        void sleep() {
            System.out.println("Cat sleeps");
        }
    }
}
