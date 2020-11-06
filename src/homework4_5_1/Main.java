package homework4_5_1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();

        contacts.addContact("Yury", "Maslov", "+7896", Group.FAMILY);
        contacts.addContact("Ivan", "Petrov", "+7865", Group.FRIENDS);
        contacts.addContact("Irina", "Maslova", "+7874", Group.WORK);

        contacts.deleteContactByNameSurname("Ivan", "Petrov");
        Contact searchableContact = contacts.searchContactByPhoneNumber("+7874");
        System.out.println(contacts);
        System.out.println(searchableContact);

        while (true) {
            System.out.println("выберите желаемое действие:\n" +
                    "    1 - Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья).\n" +
                    "    2 - Добавление пропущенного вызова.\n" +
                    "    3 - Вывод всех пропущенных вызовов\n" +
                    "    4 - Очистка пропущенных вызовов.\n" +
                    "    5 - Завершить работу программы (выход)");
            String value = scanner.nextLine();
            if (value.equals("1")) {
                contacts.addContact("Yury", "Maslov", "+7896", Group.FAMILY);
            }
            if (value.equals("2")) {
                LocalDateTime localDateTime = LocalDateTime.now();
                missedCalls.addMissedCalls(localDateTime, "+7865");
            }
            if (value.equals("3")) {

            }
            if (value.equals("4")) {

            }
            if (value.equals("5")) {
                break;
            }
        }

    }

    /*
    выбор следующих методов:
    Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья).
    Добавление пропущенного вызова.
    Вывод всех пропущенных вызовов с указанием фамилии и имени. Если контакта нет в списке контактов, вывести только номер телефона.
    Очистка пропущенных вызовов.
    Завершить работу программы (выход).
     */
}
