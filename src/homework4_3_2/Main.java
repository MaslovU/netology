package homework4_3_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Student> listOfStudent = new HashSet<>();
        String value;

        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            System.out.println("Для завершения программы нажмите \"end\"");
            Student student = new Student();
            value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            }
            String[] el = value.split(" ");
            if (el.length != 5) {
                System.out.println("Форма: Ф И О номер-группы номер студенческого билета");
                continue;
            }
            student.setName(el[0] + " " + el[1] + " " + el[2]);
            student.setGroup(el[3]);
            student.setStudentId(el[4]);
            if (student.checkStudentId(listOfStudent, student)) {
                System.out.println("Number of student cards cannot be identical");
                continue;
            }
            listOfStudent.add(student);
        }

        System.out.println("Список студентов: ");
        for (Student student : listOfStudent) {
            System.out.println("\t" + student);
        }
    }
}