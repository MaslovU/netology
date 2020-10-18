package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework1_5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int finishTime = 0;

        while (true) {
            System.out.println("Введите название задачи и время на ее выполнение:");
            System.out.println("Пример ввода: ");
            System.out.println("1. Добавить картинку на главный экран приветствия, " +
                    "задача начинается в 15 и заканчивается в 19");
            System.out.println("2. <нажмите enter>");
            System.out.println("Для завершения ввода задач введите End");

            String inputText = bufferedReader.readLine();
            if (inputText.equals("End")) {
                break;
            }
            int startPos = inputText.indexOf("начинается в");
            String startTimeString = inputText.substring(startPos + 12, startPos + 15);
            startTimeString = startTimeString.trim();
            int startTime = Integer.parseInt(startTimeString);

            int finishPos =inputText.indexOf("заканчивается в");
            try {
                String finishTimeString = inputText.substring(finishPos + 15, finishPos + 18);
                finishTimeString = finishTimeString.trim();
                finishTime = Integer.parseInt(finishTimeString);
            } catch (StringIndexOutOfBoundsException s) {
                String finishTimeString = inputText.substring(finishPos + 15, finishPos + 17);
                finishTimeString = finishTimeString.trim();
                finishTime = Integer.parseInt(finishTimeString);
            }
            int totalTime = finishTime - startTime;

            if (totalTime < 0) {
                System.out.println("Формат введенных данных неверный");
            } else {
                System.out.println("На задачу потребуется: " + totalTime + " ч.");
            }
            System.out.println("");
        }
    }
}
