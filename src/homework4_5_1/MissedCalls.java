package homework4_5_1;

import java.time.LocalDateTime;
import java.util.*;

public class MissedCalls {

    Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    List<String> missedContacts = new ArrayList<>();

    public void addMissedCalls(LocalDateTime localDateTime, String number) {
        missedCalls.put(localDateTime, number);
    }

    public List<String> returnListOfMissedCalls(Contacts contacts) {
        missedCalls.forEach((key, value) -> {
            if (contacts.searchContactByPhoneNumber(value) != null) {
                missedContacts.add(key + " " + contacts.searchContactByPhoneNumber(value));
            } else {
                missedContacts.add(key + " " + value);
            }

        });
        return missedContacts;
    }

    public void deleteAllMissedCalls() {
        missedCalls.clear();
    }
}
