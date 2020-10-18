package homework3_3_1;

public class Ivanov implements Reader, Supplier {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getBook(Administrator administrator, Book book) {
        System.out.println("I give a " + book.getName() + " from administrator " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator, Book book) {
        System.out.println("I return a " + book.getName() + " to administrator " + administrator);
    }

    @Override
    public void carryBook(Book book, Librarian librarian) {
        System.out.println("I carry " + book.getName() + " as supplier to " + librarian);
    }

    @Override
    public String toString() {
        return name;
    }
}
