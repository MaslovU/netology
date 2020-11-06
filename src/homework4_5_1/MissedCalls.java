package homework4_5_1;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {

    Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addMissedCalls(LocalDateTime localDateTime, String number) {
        missedCalls.put(localDateTime, number);
    }

    public Map<LocalDateTime, String> returnListOfMissedCalls() {
        return missedCalls;
    }

    public void deleteAllMissedCalls() {
        missedCalls.clear();
    }

    @Override
    public String toString() {
        return missedCalls.toString();
    }
}
