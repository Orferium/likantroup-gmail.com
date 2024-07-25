import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение: ");

        String input = sc.nextLine();
        String inter = input.trim();

        if (!(inter.contains("+") || inter.contains("-") || inter.contains("*") || inter.contains("/"))) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор");
        }

        String[] line = inter.split("[-+*/]");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String l : line) {
            try {
                int i = Integer.parseInt(l.trim());
                numbers.add(i);
            } catch (NumberFormatException e) {
                throw new Exception("Строка не является математической операцией");
            }
        }

        if (numbers.size() != 2) {
            throw new Exception("Вы ввели больше двух чисел");
        }

        checkNumber(numbers.get(0));
        checkNumber(numbers.get(1));
        int indexOfOperation = getOperation(inter);
        char operation = inter.charAt(indexOfOperation);

        int result;
        switch (operation) {
            case '+' -> result = numbers.get(0) + numbers.get(1);
            case '-' -> result = numbers.get(0) - numbers.get(1);
            case '*' -> result = numbers.get(0) * numbers.get(1);
            case '/' -> result = numbers.get(0) / numbers.get(1);
            default ->  throw new Exception("Ошибка, перезапустите программу");
        }
        System.out.println("Результат: " + result);


    }



    private static void checkNumber(Integer number) throws Exception {
        if (1 > number || number > 10) {
            throw new Exception("Вы ввели число меньше 1 или больше 10");
        }
    }

    private static int getOperation(String s) {
        String[] operations = {"+", "-", "*", "/"};
        int indexOfOperation = 0;
        for (String operation : operations) {
            if (s.contains(operation)) {
                indexOfOperation = s.indexOf(operation);
            }
        }
        return indexOfOperation;
    }






}
