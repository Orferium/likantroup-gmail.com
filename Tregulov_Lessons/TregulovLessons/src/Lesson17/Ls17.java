package Lesson17;

public class Ls17 {
    public static void main(String[] args) {
        StringBuilder obj1 = new StringBuilder("Object 1");
        StringBuilder obj2 = new StringBuilder("Object 2");

        One r = new One();
        System.out.print(r.ravenstvo(obj1, obj2));
    }

    static class One {


        boolean ravenstvo(StringBuilder obj1, StringBuilder obj2) {
            boolean result = true;
            if (obj1.length() == obj2.length()) {
                for (int i = 0; i < obj1.length(); i++){
                    if (obj1.charAt(i) != obj2.charAt(i)) {
                        result = false;
                        break;
                    }
                }

            } else {
                result = false;
            }
            return result;

        }
    }
}
