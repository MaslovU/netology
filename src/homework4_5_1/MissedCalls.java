package homework4_5_1;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MissedCalls {

    Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    Set<Map<LocalDateTime, Contact>> missedContacts = new HashSet<>();

    public void addMissedCalls(LocalDateTime localDateTime, String number) {
        missedCalls.put(localDateTime, number);
    }

    public Set<Map<LocalDateTime, Contact>> returnListOfMissedCalls(Contacts contacts) {
        missedCalls.forEach((key, value) -> {
            Map<LocalDateTime, Contact> returnMissedCalls = new TreeMap<>();
            Contact contact = contacts.searchContactByPhoneNumber(value);
            returnMissedCalls.put(key, contact);
            missedContacts.add(returnMissedCalls);
        });
        return missedContacts;
    }

    public void deleteAllMissedCalls() {
        missedCalls.clear();
    }
}
