import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\ShugaBabu\\IdeaProjects\\MyProjects\\Randomize_Complim\\Compliments.txt"), UTF_8);
        //получаем строки из текстового файла в список
        List<String> l = new ArrayList<>();//создаём новый список для изменений

        for (String s : lines) {
            l.add(s);
        }

        int index = (new Random()).nextInt(l.size());
        String randomItem = l.get(index);//получаем строку
        System.out.println("Хей, ты - " + randomItem);


    }
}