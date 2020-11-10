package homework4_5_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, User> userDB = new TreeMap<>();
        Map<String, Set<String>> usersIps = new HashMap<>();
        File file = new File("D:\\Projects\\IdeaProjects\\netology\\src\\homework4_5_3\\users.db");
        Scanner scanner = new Scanner(file);
        int count = 0;
        Set<String> ips;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] stringBuilder = line.split(";");
            count ++;
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

        userDB.forEach((key, value) -> {
            System.out.println("Group is: " + key + "\n\t" + value);
        });

        usersIps.forEach((key, value) -> {
            System.out.println("ID is: " + key + "\n\tIP is: " + value);
        });
        System.out.println(count);
    }
}
