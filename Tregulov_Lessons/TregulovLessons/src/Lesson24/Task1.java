package Lesson24;

public class Task1 {
    public static void main(String[] args) {
        Swordtail swordtail = new Swordtail("Иван");
        swordtail.swim();
        swordtail.eat();

        System.out.println("---------");
        Speakable p = new Penguin("Василий");
        ((Penguin) p).fly();
        ((Penguin) p).eat();
        ((Penguin) p).sleep();
        ((Penguin) p).speak();
        System.out.println("---------");
        Animal a = new Lion("Алекс");
        a.eat();
        a.sleep();
        ((Lion) a).run();
        ((Lion) a).speak();
        System.out.println("---------");
        Mammal b = new Lion("Шримпака");
        b.eat();
        b.sleep();
        ((Lion) b).run();
        ((Lion) b).speak();

    }

    abstract static class Animal {
        Animal(String name) {

        }

        abstract void eat();

        abstract void sleep();
    }

    abstract static class Fish extends Animal {

        Fish(String name) {
            super(name);
        }

        public void sleep() {
            System.out.println("Всегда интересно наблюдать, как спят рыбы");
        }

        abstract void swim();
    }

    abstract static class Bird extends Animal implements Speakable {

        Bird(String name) {
            super(name);
        }

        abstract void fly();

        void speak(String name) {
            System.out.println(name + "Кто-то говорит");
        }
    }

    abstract static class Mammal extends Animal implements Speakable {

        Mammal(String name) {
            super(name);
        }

        abstract void run();
    }

    static class Swordtail extends Fish {

        Swordtail(String name) {
            super(name);
        }

        void swim() {
            System.out.println("Меченосец красивая рыба, которая быстро плавает");
        }

        void eat() {
            System.out.println("Меченосец не хищная рыба и она ест обычный рыбий корм");
        }

    }

    static class Penguin extends Bird {
        Penguin(String name) {
            super(name);
        }

        @Override
        void fly() {
            System.out.println("Пингвины любят есть рыбу");
        }

        @Override
        void eat() {
            System.out.println("Пингвины спят прижавшись друг к другу");
        }

        void sleep() {
            System.out.println("Пингвины не умеют петь как соловьи");
        }

    }

    static class Lion extends Mammal {
        Lion(String name) {
            super(name);
            System.out.println(name);
        }

        void eat() {
            System.out.println("Лев, как любой хищник - любит мясо");
        }

        void sleep() {
            System.out.println("Большую часть дня лев спит");
        }

        void run() {
            System.out.println("Лев - это не самая быстрая кошка");
        }

    }

    interface Speakable {
        default void speak() {
            System.out.println("Кто-то говорит");
        }


    }

}

