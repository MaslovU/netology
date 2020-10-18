package homework3_4_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);

        validateUser(user);

        System.out.println("Доступ представлен");
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "pass", "jhon@gmail.com", 24);
        User user2 = new User("katya", "pass1", "katya@gmail.com", 19);
        User user3 = new User("ivan", "pass2", "ivan@gmail.com", 7);
        User user4 = new User("tanya", "pass3", "tanys@gmail.com", 17);
        User user5 = new User("hon", "pass4", "hon@gmail.com", -6);
        User user6 = new User("jon", "pass5", "jon@gmail.com", 18);
        User[] users = new User[6];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        users[4] = user5;
        users[5] = user6;

        return users;
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("Access denied");
        }

    }
}