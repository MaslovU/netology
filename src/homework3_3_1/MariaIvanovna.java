package homework3_3_1;

public class MariaIvanovna implements Administrator {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void overdueNotification(Reader reader, Book book) {
        System.out.println("I make a overdue notification to" + reader + " about " + book.getName());
    }

    @Override
    public void findBook(Book book) {
        System.out.println("I find a " + book.getName());
    }

    @Override
    public void giveBook(Reader reader, Book book) {
        System.out.println("I get a " + book.getName() + " to " + reader);
    }

    @Override
    public void needBook(Book book, Librarian librarian, Supplier supplier) {
        System.out.println(librarian + " we need order a " + book.getName() + " to supplier " + supplier);
    }

    @Override
    public String toString() {
        return name;
    }

}
