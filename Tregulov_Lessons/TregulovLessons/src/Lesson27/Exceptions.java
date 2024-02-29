package Lesson27;

public class Exceptions {

     static class NeMyasoException extends RuntimeException {
         NeMyasoException(String name) {
            super(name);
        }
    }
    static class NeVodaException extends Exception {
        NeVodaException(String name) {
            super(name);
        }
    }

}
