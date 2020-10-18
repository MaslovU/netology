//homeWork 1.6

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Ronald", "Tolkien", 1900, "England");
        Author god = new Author("God", "Jesus", 1, "none");

        Book book1 = new Book(tolkien, "Lord of the ring", 4000,
                2002, "AST", "pdf", "1st edition");
        Book book2 = new Book(tolkien, "Two towers", 3999, "pdf");
        Book book3 = new Book(tolkien, 3698, 2004);
        Book holyBibleBook = new Book(god, 10000, 1);

        User maslov = new User("Yury", "Maslov", "pochtaRossii@mail.ru");
        User nusha = new User("Nusha", "Nushina", "nusha@gmail.com");
        User trump = new User("Trump", "Ivanov", "trump@rumbler@ram.com");

        System.out.println(tolkien);
        System.out.println("");
        book1.compareVolumeOfTheBook(3999, "Two towers");

        maslov.addBook(book1);
        maslov.addBook(book2);
        maslov.addBook(book3);
        System.out.println("");
        trump.addBook(holyBibleBook);
        System.out.println(maslov);
        System.out.println(nusha);
        System.out.println(trump);
        System.out.println(User.onlineUsers);
    }
}


class User {
    String email;
    String name;
    String surname;
    ArrayList<Book> books = new ArrayList<>();
    static int onlineUsers;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        onlineUsers++;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        StringBuilder bookString = new StringBuilder();
        for (Book book : books) {
            bookString.append(book).append("\n");
        }
        return "User name is: " + name +
                " " + surname +
                ", email: " + email +
                "." +
                "\n" + bookString.toString();
    }
}


class Book {
    Author author;
    String name;
    int valuePage;
    int yearRelease;
    String press;
    String format;
    String edition;

    public Book(Author author, String name, int valuePage, int yearRelease,
                String press, String format, String edition) {
        this(author, name, valuePage, format);
        this.yearRelease = yearRelease;
        this.press = press;
        this.edition = edition;
    }

    public Book(Author author, String name, int valuePage, String format) {
        this.author = author;
        this.name = name;
        this.valuePage = valuePage;
        this.format = format;
    }

    public Book(Author author, int valuePage, int yearRelease) {
        this.author = author;
        this.valuePage = valuePage;
        this.yearRelease = yearRelease;
    }


    public void compareVolumeOfTheBook(int valuePage, String name) {
        if (this.valuePage < valuePage) {
            System.out.println(name + " is bigger");
        } else {
            System.out.println(this.name + " is bigger");
        }
    }

    @Override
    public String toString() {
        if (press == null && edition == null && yearRelease == 0) {
            return "Book name is " + name + "\n" +
                    author + "\n" +
                    " value of page " + valuePage +
                    ", format of book is " + format +
                    ".";
        } else if (name == null && edition == null && format == null) {
            return "No book name" + "\n" +
                    author + "\n" +
                    " year of release is " + yearRelease +
                    ", value of page " + valuePage +
                    ".";
        } else {
            return "Book name is " + name + "\n" +
                    author + "\n" +
                    " publishing house is " + press +
                    ", edition is " + edition +
                    ", year of release is " + yearRelease +
                    ", value of page " + valuePage +
                    ", format of book is " + format +
                    ".";
        }
    }
}


class Author {
    String name;
    String surname;
    int birthday;
    String country;

    public Author(String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author name is " + name +
                ", surname is " + surname +
                ", birthday is " + birthday +
                ", native country is " + country +
                ".";
    }
}