package homework3_1_1;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        if (requestedStatus.equals(book.getStatus())) {
            System.out.println("Перевод книги из статуса "
                    + book.getStatus() + " в статус "
                    + requestedStatus + " невозможен");
        } else if (book.getStatus() != Status.AVAILABLE) {
            System.out.println("Перевод книги в статусе "
                    + book.getStatus() + " невозможен, воспользуйтесь подходящим методом!");
        } else {
            switch (requestedStatus) {
                case ARCHIVED: {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.ARCHIVED);
                    break;
                }
                case BORROWED: {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.BORROWED);
                    break;
                }
                default: System.out.println("Перевод книги из статуса "
                        + book.getStatus() + " в статус "
                        + requestedStatus + " невозможен");
            }
        }
    }
}
