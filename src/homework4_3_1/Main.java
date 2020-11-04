package homework4_3_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneContacts phoneConcacts = new PhoneContacts();
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Contact>> groupsWithContacts;

        System.out.println("Программа справочник");
        while (true) {
            System.out.println("Введите название группы контактов:");
            String newGroup = scanner.nextLine();
            if (newGroup.equals("no")) {
                groupsWithContacts = phoneConcacts.createGroupContact();
                break;
            }
            phoneConcacts.addGroup(newGroup);
            System.out.println("Создать еще одну группу (введите название или введите no)?");
        }

        while (true) {
            Contact contact = new Contact();

            System.out.println("Создать контакт (введите наименование и его номер или введите no)?");
            String newContact = scanner.nextLine();
            if (newContact.equals("no")) {
                break;
            }
            String[] el = newContact.split(" ");
            if (el.length != 3) {
                System.out.println("Введите имя фамилию и телефон через пробел");
                continue;
            }

            phoneConcacts.makeNamePhone(contact, el);
            System.out.println("Укажите группы контакта через пробел: ");
            String stringGroups = scanner.nextLine();
            groupsWithContacts = phoneConcacts.makeGroupsWithContacts(stringGroups, contact);
        }

        groupsWithContacts.forEach((key, value) -> {
            System.out.println("Group is: " + key + "\n\t" + value);
        });
    }
}