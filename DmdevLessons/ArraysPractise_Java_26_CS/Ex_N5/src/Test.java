public class Test {
    public static void main(String[] args) {
        String bow1 = "pau";
        String bow2 = "pau";

        System.out.println(bow1 == bow2); // один объект, но разные ссылки, поэтому true


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

       // System.out.println(cat1 == cat2); // разные объкты, поэтому false

        }


}



class Cat {


}