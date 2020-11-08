package homework4_5_1;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        Group group;

        while (true) {
            System.out.println("выберите желаемое действие:\n" +
                    "    1 - Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья).\n" +
                    "    2 - Добавление пропущенного вызова.\n" +
                    "    3 - Вывод всех пропущенных вызовов\n" +
                    "    4 - Очистка пропущенных вызовов.\n" +
                    "    5 - Редактирование контактов из телефонной книги.\n" +
                    "    6 - Удаление контакта из телефонной книги.\n" +
                    "    7 - Завершить работу программы (выход)");
            String value = scanner.nextLine();
            if (value.equals("1")) {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter surname: ");
                String surname = scanner.nextLine();
                System.out.println("Enter phone number:");
                String number = scanner.nextLine();
                System.out.println("Enter group (work, friends, family)");
                String groupString = scanner.nextLine();
                group = contacts.selectGroup(groupString);
                while (group == null) {
                    System.out.println("Enter correct group (work, friends, family)");
                    groupString = scanner.nextLine();
                    group = contacts.selectGroup(groupString);
                }
                contacts.addContact(name, surname, number, group);
                System.out.println(contacts);
            }
            if (value.equals("2")) {
                System.out.println("Добавьте номер пропущенного вызова");
                String missedNumber = scanner.nextLine();
                LocalDateTime localDateTime = LocalDateTime.now();
                missedCalls.addMissedCalls(localDateTime, missedNumber);
            }
            if (value.equals("3")) {
                System.out.println("List of missed calls");
                List<Contact> listMissedContacts = missedCalls.returnListOfMissedCalls(contacts);
                for (Contact elem : listMissedContacts) {
                    System.out.println(elem);
                }
                System.out.println(" ");
            }
            if (value.equals("4")) {
                missedCalls.deleteAllMissedCalls();
                System.out.println(missedCalls);
            }
            if (value.equals("5")) {
                System.out.println("Enter phone number for editing");
                String phoneNumber = scanner.nextLine();
                Contact contact = contacts.searchContactByPhoneNumber(phoneNumber);
                while (contact == null) {
                    System.out.println("Enter correct phone number for editing");
                    phoneNumber = scanner.nextLine();
                    contact = contacts.searchContactByPhoneNumber(phoneNumber);
                }
                System.out.println("Choice parameter for eidting: name, surname, phone, group");
                String parameter = scanner.nextLine();
                switch (parameter) {
                    case "name":
                        System.out.println("Enter new value for parameter Name: ");
                        String newName = scanner.nextLine();
                        contact.setName(newName);
                        break;
                    case "surname":
                        System.out.println("Enter new value for parameter Surname: ");
                        String surname = scanner.nextLine();
                        contact.setSurname(surname);
                        break;
                    case "phone":
                        System.out.println("Enter new value for parameter PhoneName: ");
                        String phone = scanner.nextLine();
                        contact.setPhone(phone);
                        break;
                    case "group":
                        System.out.println("Enter new value for parameter Group: ");
                        String groupString = scanner.nextLine();
                        group = contacts.selectGroup(groupString);
                        while (group == null) {
                            System.out.println("Enter new value for parameter Group: work, friends, family");
                            groupString = scanner.nextLine();
                            group = contacts.selectGroup(groupString);
                        }
                        contact.setGroup(group);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + parameter);
                }
                System.out.println(contact);
            }
            if (value.equals("6")) {
                System.out.println("Enter name of contact for deleting");
                String name = scanner.nextLine();
                System.out.println("Enter surname of contact for deleting");
                String surname = scanner.nextLine();
                contacts.deleteContactByNameSurname(name, surname);
            }
            if (value.equals("7")) {
                break;
            }
        }
    }
}