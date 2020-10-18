package homework3_3_1;

public class Main {
    public static void main(String[] args) {
        Ivanov ivanov = new Ivanov();
        MariaIvanovna mariaIvanovna = new MariaIvanovna();
        Irina irina = new Irina();
        Book rings = new Book();
        Book java = new Book();

        mariaIvanovna.setName("Maria Ivanovna");
        irina.setName("Irina");
        ivanov.setName("Peter");
        java.setName("Java");
        rings.setName("Rings");

        mariaIvanovna.giveBook(ivanov, rings);
        ivanov.getBook(mariaIvanovna, rings);
        mariaIvanovna.needBook(java, irina, ivanov);
        irina.orderBook(ivanov, java);
        ivanov.carryBook(java, irina);
        mariaIvanovna.findBook(java);

    }
}
