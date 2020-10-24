package homework_list_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> listOfEmployee = new ArrayList<>();

        while (true) {
            System.out.println("Введите фамилию сотрудника");
            String familyName = scanner.nextLine();
            while (familyName.isEmpty()) {
                System.out.println("Введите фамилию сотрудника");
                familyName = scanner.nextLine();
            }
            String formatFamily = String.format("%1$" + 7 + "s", familyName);
            System.out.println("Введите имя сотрудника");
            String name = scanner.nextLine();
            while (name.isEmpty()) {
                System.out.println("Введите имя сотрудника");
                name = scanner.nextLine();
            }
            String formatName = String.format("%1$" + 6 + "s", name);
            System.out.println("Введите возраст сотрудника");
            String ageString = scanner.nextLine();
            while (ageString.isEmpty()) {
                System.out.println("Введите возраст сотрудника");
                ageString = scanner.nextLine();
            }
            String formatAge = String.format("%1$" + 7 + "s", ageString);
            System.out.println("Введите пол сотрудника");
            String sex = scanner.nextLine();
            while (sex.isEmpty()) {
                System.out.println("Введите пол сотрудника");
                sex = scanner.nextLine();
            }
            String formatSex = String.format("%1$" + 6 + "s", sex);
            System.out.println("Введите должность сотрудника");
            String position = scanner.nextLine();
            while (position.isEmpty()) {
                System.out.println("Введите должность сотрудника");
                position = scanner.nextLine();
            }
            String formatPosition = String.format("%1$" + 9 + "s", position);
            System.out.println("Введите отдел сотрудника");
            String section = scanner.nextLine();
            while (section.isEmpty()) {
                System.out.println("Введите отдел сотрудника");
                section = scanner.nextLine();
            }
            String formatSection = String.format("%1$" + 13 + "s", section);
            System.out.println("Введите образование сотрудника");
            String education = scanner.nextLine();
            while (education.isEmpty()) {
                System.out.println("Введите образование сотрудника");
                education = scanner.nextLine();
            }
            String formatEducation = String.format("%1$" + 11 + "s", education);

            Employee emp = new Employee(formatFamily, formatName, formatAge, formatSex,
                    formatEducation, formatPosition, formatSection);
            listOfEmployee.add(emp);

            System.out.println("Если хотите закончить ввод данных, введите end");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
        System.out.println("N Фамилия   Имя  Возраст  Пол   Образование Должность Подразделение");
        int count = 0;
        for (Employee employee : listOfEmployee) {
            count += 1;
            System.out.print(count);
            System.out.println(employee);
        }

        String[] listAttributes = new String[]{"Фамилия", "Имя", "Возраст", "Пол",
                "Образование", "Должность", "Подразделение"};

        while (true) {
            System.out.println("Если не хотите менять данные, введите end. Для продолжения нажмите Enter");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            System.out.println("Введите фамилию работника, для которого хотите изменить данные");
            String surname = scanner.nextLine();
            System.out.println("Введите имя работника, для которого хотите изменить данные");
            String name = scanner.nextLine();
            if (surname.isEmpty() || name.isEmpty()) {
                System.out.println("Вы ввели пустые значения");
                continue;
            }

            int empIndex = searchBySurname(surname, name, listOfEmployee);
            if (empIndex != -1) {
                for (int i = 0; i < listAttributes.length; i++) {
                    System.out.println("Меняем " + listAttributes[i] + "? (y/n)");
                    String choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        System.out.println("Введите новое значение: ");
                        String editParam = scanner.nextLine();
                        Employee employee = listOfEmployee.get(empIndex);
                        switch (i) {
                            case 0:
                                String formatFamily = String.format("%1$" + 7 + "s", editParam);
                                employee.setFamilyName(formatFamily);
                                break;
                            case 1:
                                String formatName = String.format("%1$" + 6 + "s", editParam);
                                employee.setName(formatName);
                                break;
                            case 2:
                                String formatAge = String.format("%1$" + 7 + "s", editParam);
                                employee.setAge(formatAge);
                                break;
                            case 3:
                                String formatSex = String.format("%1$" + 6 + "s", editParam);
                                employee.setSex(formatSex);
                                break;
                            case 4:
                                String formatEducation = String.format("%1$" + 11 + "s", editParam);
                                employee.setEducation(formatEducation);
                                break;
                            case 5:
                                String formatPosition = String.format("%1$" + 9 + "s", editParam);
                                employee.setPosition(formatPosition);
                                break;
                            case 6:
                                String formatSection = String.format("%1$" + 13 + "s", editParam);
                                employee.setSection(formatSection);
                                break;
                        }
                    }
                }
            } else {
                System.out.println("Такого сотрудника не найдено. Исправьте вводимые данные");
            }
        }
        System.out.println("N Фамилия   Имя  Возраст  Пол   Образование Должность Подразделение");
        int count2 = 0;
        for (Employee employee : listOfEmployee) {
            count2 += 1;
            System.out.print(count2);
            System.out.println(employee);
        }
    }

    static int searchBySurname(String surname, String name, List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            String family = employee.getFamilyName().trim();
            String name2 = employee.getName().trim();
            if (surname.equals(family) && name.equals(name2)) return employeeList.indexOf(employee);
        }
        return -1;
    }
}
