package homework_list_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfBusiness = new ArrayList<>();
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    while (true) {
                        System.out.println("Введите название задачи (для завершения введите end)");
                        String business = scanner.nextLine();

                        if ("end".equals(business)) {
                            break;
                        }
                        if (business.isEmpty()) continue;
                        listOfBusiness.add(business);
                    }
                    System.out.println(" ");
                    break;
                case "2":
                    int count = 0;
                    for (String task : listOfBusiness) {
                        count += 1;
                        System.out.println(count + ". " + task);
                    }
                    System.out.println(" ");
                    break;
                case "3":
                    while (true) {
                        System.out.println("Введите название удаляемой задачи (для завершения введите finish)");
                        String task = scanner.nextLine();
                        if ("finish".equals(task)) {
                            break;
                        }
                        if (task.isEmpty()) continue;
                        listOfBusiness.remove(task);
                    }
                    System.out.println(" ");
                    break;
                case "0":
                    break;
            }
            if (choice.equals("0")) break;
        }
    }
}
