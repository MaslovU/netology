package homework4_5_1;

public class Main {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();

        contacts.addContact("Yury", "Maslov", "+7896", Group.FAMILY);
        contacts.addContact("Ivan", "Petrov", "+7865", Group.FRIENDS);
        contacts.addContact("Irina", "Maslova", "+7874", Group.WORK);

        contacts.deleteContactByNameSurname("Ivan", "Petrov");
        Contact searchableContact = contacts.searchContactByPhoneNumber("+7874");
        System.out.println(contacts);
        System.out.println(searchableContact);
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
