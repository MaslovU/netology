package homework3_1_1;

public class FromOverduedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        if (requestedStatus.equals(book.getStatus())) {
            System.out.println("Перевод книги из статуса "
                    + book.getStatus() + " в статус "
                    + requestedStatus + " невозможен");
        } else if (book.getStatus() != Status.OVERDUED) {
            System.out.println("Перевод книги в статусе "
                    + book.getStatus() + " невозможен, воспользуйтесь подходящим методом!");
        } else {
            switch (requestedStatus) {
                case ARCHIVED -> {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.ARCHIVED);
                }
                case AVAILABLE -> {
                    super.moveToStatus();
                    System.out.println("from " + book.getStatus() + " to " + requestedStatus);
                    book.setStatus(Status.AVAILABLE);
                }
                default -> System.out.println("Перевод книги из статуса "
                        + book.getStatus() + " в статус "
                        + requestedStatus + " невозможен");
            }
        }
    }
}
