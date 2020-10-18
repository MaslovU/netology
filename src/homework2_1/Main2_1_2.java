package homework2_1;

import java.util.Comparator;

public class Main2_1_2{

    public static void main(String[] args) {

        Product[] products = new Product[6];
        products[0] = new Product(45, "Milk", "Nice");
        products[1] = new Product(34, "Popcorn", "Nice");
        products[2] = new Product(55, "Bread", "Nice");
        products[3] = new Product(35, "Brad", "Nice");
        products[4] = new Product(34, "Cheese", "Nice");
        products[5] = new Product(1, "Wheal", "Nice");

        int leftBorder = 0;
        int rightBorder = products.length - 1;

        for (Product product: products) {
            System.out.println(product + " ");
        }
        System.out.println(" ");

        sortArray(products, leftBorder, rightBorder);

        for (Product product: products) {
            System.out.println(product + " ");
        }
    }

    public static void sortArray(Product[] product, int leftBorder, int rightBorder) {
        PriceComparator priceComparator = new PriceComparator();

        if (product.length == 0) {
            return;
        }

        if (leftBorder >= rightBorder) {
            return;
        }

        Product pivot = product[(leftBorder + rightBorder) / 2];
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

        while (leftMarker <= rightMarker) {
            int pl = product.length;
            while (priceComparator.compare(product[leftMarker], pivot) < 0) {
                int a = priceComparator.compare(product[leftMarker], pivot);
                leftMarker++;
            }
            while (priceComparator.compare(product[rightMarker], pivot) > 0) {
                int b = priceComparator.compare(product[rightMarker], pivot);
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                Product tmp = product[leftMarker];
                product[leftMarker] = product[rightMarker];
                product[rightMarker] = tmp;
                leftMarker++;
                rightMarker--;
            }
        }

        if (leftBorder < rightMarker) {
            sortArray(product, leftBorder, rightMarker);
        }
        if (rightBorder > leftMarker) {
            sortArray(product, leftMarker, rightBorder);
        }
    }
}

class Product {
    String name;
    int price;
    String description;

    public Product(int price, String name, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}

class PriceComparator implements Comparator<Product>{
    public int compare(Product s1, Product s2){
        return Integer.compare(s1.price, s2.price);
    }
}