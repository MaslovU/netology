package homework3_1_1;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("The Lord of the Rings", Status.AVAILABLE);
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();

        System.out.println("Current status is: " + book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println("Current status is: " + book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println("Current status is: " + book.getStatus());

        fromBorrowedStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Current status is: " + book.getStatus());

        fromOverduedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Current status is: " + book.getStatus());

        fromArchievedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println("Current status is: " + book.getStatus());
    }
}
