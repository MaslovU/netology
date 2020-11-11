package homework4_5_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, User> userDB = new TreeMap<>();
        Map<String, Set<String>> usersIps = new HashMap<>();
        Map<String, Integer> countIps = new HashMap<>();
        File file = new File("D:\\Projects\\IdeaProjects\\netology\\src\\homework4_5_3\\users.db");
        File fileLog = new File("D:\\Projects\\IdeaProjects\\netology\\src\\homework4_5_3\\server.log");
        Scanner scanner = new Scanner(file);
        int count = 0;
        Set<String> ips;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] stringBuilder = line.split(";");
            count++;
            String ip = Arrays.toString(new String[]{stringBuilder[0]});
            String id = Arrays.toString(new String[]{stringBuilder[1]});
            String fIO = Arrays.toString(new String[]{stringBuilder[2]});
            String address = Arrays.toString(new String[]{stringBuilder[3]});
            User user = new User(id, fIO, address);
            if (!usersIps.containsKey(id)) {
                usersIps.put(id, new HashSet<>());
            }
            ips = usersIps.get(id);
            ips.add(ip);
            usersIps.replace(id, ips);
            userDB.put(id, user);
        }
        scanner.close();

        scanner = new Scanner(fileLog);
        int countIp;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] stringBuilder = line.split(":");

            String ip = Arrays.toString(new String[]{stringBuilder[0]});
            String id = Arrays.toString(new String[]{stringBuilder[1]});
            if (!countIps.containsKey(ip)) {
                countIp = 1;
                countIps.put(ip, countIp);
            } else {
                countIp = countIps.get(ip);
                countIp++;
            }
            countIps.replace(ip, countIp);
        }

        AtomicInteger defaultValue = new AtomicInteger();
        AtomicReference<String> defKey = new AtomicReference<>("null");
        countIps.forEach((key, value) -> {
            if (defaultValue.get() < value) {
                defaultValue.set(value);
                defKey.set(key);
            }
        });
        scanner.close();

        final String[] villainId = {"1"};
        String villainIp = defKey.get();
        usersIps.forEach((key, value) -> {
            if (value.contains(villainIp)) {
                villainId[0] = key;
            }
        });

        userDB.forEach((key, value) -> {
            if (key.equals(villainId[0])) {
                System.out.println("Criminal is: " + value.getfIO());
            }
        });
    }
}
