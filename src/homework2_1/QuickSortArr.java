//package homework2_1;
//
//public class QuickSortArr {
//
//    public static void main(String[] args) {
//
//        Product[] products = new Product[6];
//
//
//        products[0] = new Product(45, "Milk", "Nice");
//        products[1] = new Product(34, "Popcorn", "Nice");
//        products[2] = new Product(55, "Bread", "Nice");
//        products[3] = new Product(35, "Brad", "Nice");
//        products[4] = new Product(30, "Cheese", "Nice");
//        products[5] = new Product(1, "Wheal", "Nice");
//
//        Product.display(products);
//        Product.quickSort(0,5, products);
//        System.out.println("");
//        Product.display(products);
//
//    }
//}
//
//class Product {
//
//    String name;
//    int price;
//    String description;
//
//    public Product(int price, String name, String description) {
//        this.name = name;
//        this.price = price;
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", description='" + description + '\'' +
//                '}';
//    }
//
//    public static void display(Product[] arr) {
//        for (int i = 0; i < 6; i++) {
//            System.out.print(arr[i].price + " ");
//
//        }
//        System.out.println("");
//    }
//
//    public static void quickSort(int left, int lengh, Product[] arr) {
//        recQuickSort(left, lengh, arr);
//    }
//
//    public static void recQuickSort(int left, int right, Product[] arr) {
//        if (right -left <= 0) {
//        } else {
//            int pivot = arr[right].price;
//            int partition = partitionIt (left, right, pivot, arr);
//            recQuickSort(left, partition - 1, arr);
//            recQuickSort(partition + 1, right, arr);
//        }
//    }
//
//    public static int partitionIt(int left, int right, int pivot, Product[] arr) {
//        int leftPtr = left - 1;
//        int rightPtr = right;
//        while (true) {
//            while (arr[++leftPtr].price < pivot);
//            while (rightPtr > 0 && arr[--rightPtr].price > pivot);
//
//            if (leftPtr >= rightPtr) break;
//            else swap(leftPtr, right, arr);
//        }
//        swap(leftPtr, rightPtr, arr);
//        return leftPtr;
//    }
//
//    public static void swap(int dex1, int dex2, Product[] arr) {
//        int temp = arr[dex1].price;
//        arr[dex1].price = arr[dex2].price;
//        arr[dex2].price = temp;
//    }
//}
