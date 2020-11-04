package homework4_3_1;

import java.util.*;

public class PhoneContacts {

    private final Map<String, List<Contact>> groupsWithContacts = new HashMap<>();
    private final List<String> groups = new ArrayList<>();

    void addGroup(String group) {
        groups.add(group);
    }

    public Map<String, List<Contact>> createGroupContact() {
        for (String group: groups) {
            groupsWithContacts.put(group, new ArrayList<>());
        }
        return groupsWithContacts;
    }

    void makeNamePhone(Contact contact, String[] el){
        contact.setName(el[0] + " " + el[1]);
        contact.setPhoneNumber(el[2]);
    }

    Map<String, List<Contact>> makeGroupsWithContacts(String stringGroups, Contact contact) {
        String[] groupsSplit = stringGroups.split(" ");
        for (String oneGroup: groupsSplit) {
            List<Contact> cont = groupsWithContacts.get(oneGroup);
            ArrayList<String> names = new ArrayList<>();
            for (Contact value : cont) {
                names.add(value.getName());
            }
            int index = Collections.binarySearch(names, contact.getName());
            int searchableIndex = Math.abs(index) - 1;
            cont.add(searchableIndex, contact);
            groupsWithContacts.put(oneGroup, cont);
        }
        return groupsWithContacts;
    }
}
