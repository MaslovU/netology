package homework4_5_1;

import java.time.LocalDateTime;
import java.util.*;

public class MissedCalls {

    Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    List<Contact> missedContacts = new ArrayList<>();

    public void addMissedCalls(LocalDateTime localDateTime, String number) {
        missedCalls.put(localDateTime, number);
    }

    public List<Contact> returnListOfMissedCalls(Contacts contacts) {
        missedCalls.forEach((key, value) -> {
            missedContacts.add(contacts.searchContactByPhoneNumber(value));
        });
        return missedContacts;
    }

    public void deleteAllMissedCalls() {
        missedCalls.clear();
    }
}
