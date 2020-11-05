package homework4_5_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Contacts implements Cloneable {

    Map<String, Contact> contacts = new HashMap<>();

    public Map<String, Contact> addContact(String name, String surname, String number, Group group) {
        Contact contact = new Contact();
        contact.setName(name);
        contact.setSurname(surname);
        contact.setPhone(number);
        contact.setGroup(group);
        contacts.put(number, contact);
        return contacts;
    }

    public void deleteContactByNameSurname(String name, String surname) {
        Iterator<Map.Entry<String, Contact>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<String, Contact> unit = iterator.next();
            String nameValue = unit.getValue().getName();
            String surnameValue = unit.getValue().getSurname();
            if (nameValue.equals(name) && surnameValue.equals(surname)) {
                iterator.remove();
            }
        }
    }

    public Contact searchContactByPhoneNumber(String number) {
        return contacts.getOrDefault(number, null);
    }

    @Override
    public String toString() {
        return "List of contacts is: " + Arrays.toString(contacts.entrySet().toArray());
    }
}
