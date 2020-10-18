package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите текст с большим количеством пробелов: ");
        System.out.println("<нажмите enter>");
        String inputString = bufferedReader.readLine();
        System.out.println("\"Пробелы удалены:\"");
        inputString = inputString.trim();
        System.out.println(extraTrim(inputString));
    }

    static String extraTrim(String inputString) {

        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.replaceAll(" ").
                replaceAll("\\s+\\p{P}", "!");
    }
}
