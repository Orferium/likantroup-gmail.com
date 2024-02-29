//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "Для работы со строками в языке Java используются\n "
                + "классы String, StringBuilder, StringBuffer.";

        System.out.println(s);
        System.out.println("indexOf(Д) = "
                + s.indexOf('л'));
        System.out.println("lastIndexOf(r) = "
                + s.lastIndexOf('r'));
        System.out.println("indexOf(String) = "
                + s.indexOf("String"));
        System.out.println("lastIndexOf(String) = "
                + s.lastIndexOf("String"));
        System.out.println("indexOf(S, 60) = "
                + s.indexOf('S', 60));
        System.out.println("lastIndexOf(S, 70) = "
                + s.lastIndexOf('S', 70));
    }
}

