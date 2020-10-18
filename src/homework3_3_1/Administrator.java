package homework3_3_1;

public interface Administrator {
    void overdueNotification(Reader reader, Book book);
    void findBook(Book book);
    void giveBook(Reader reader, Book book);
    void needBook(Book book, Librarian librarian, Supplier supplier);
}
