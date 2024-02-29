import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 11;
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    if (i == 0 || i == count - 1 || j == 0 || j == count - 1) {
                        System.out.print("*");
                    } else if (i == j || j == count - 1 - i){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}