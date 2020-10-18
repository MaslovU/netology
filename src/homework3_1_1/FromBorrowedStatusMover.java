package homework3_1_1;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        if (requestedStatus.equals(book.getStatus())){
            System.out.println("Перевод книги из статуса "
                    + book.getStatus() + " в статус "
                    + requestedStatus + " невозможен");
        } else if (book.getStatus() != Status.BORROWED) {
            System.out.println("Перевод книги в статусе "
                    + book.getStatus() + " невозможен, воспользуйтесь подходящим методом!");
        } else {
            switch (requestedStatus) {
                case AVAILABLE: {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.AVAILABLE);
                    break;
                }
                case OVERDUED: {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.OVERDUED);
                    break;
                }
                case ARCHIVED: {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.ARCHIVED);
                    break;
                }
                default: System.out.println("Перевод книги из статуса "
                        + book.getStatus() + " в статус "
                        + requestedStatus + " невозможен");
            }
        }
    }
}
