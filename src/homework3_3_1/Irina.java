package homework3_3_1;

public class Irina implements Librarian {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("I order a " + book.getName() + " to supplier " + supplier);
    }

    @Override
    public String toString() {
        return name;
    }
}
