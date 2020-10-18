package homework2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2_1_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] products = new String[]{"Milk", "Bread", "Sausages", "Beer", "Crisps"};
        String customerChoice;
        int intCustomerChoice;
        int[] prices = new int[]{35, 29, 99, 67, 43};
        int[] customerBasket = new int[5];
        int[] totalPriceOneProduct = new int[5];
        int[] customerCountArray = new int[5];
        int customerCount;
        int total = 0;
        int count = 1;
        int indexProducts = 0;

        System.out.println("Список возможных товаров для покупки");
        for (String product : products) {
            System.out.println(count + ". " + product);
            count++;
        }

        System.out.println("Выберите товар и количество или введите end");
        while (true) {
            System.out.print("Выберите номер товара: ");
            customerChoice = reader.readLine();
            if (customerChoice.equals("end")) {
                break;

            }
            if (customerChoice.equals("")) {
                System.out.println("Вы ничего не выбрали, попробуйте еще раз.");
                continue;
            }
            try {
                intCustomerChoice = Integer.parseInt(customerChoice) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
                continue;
            }

            while (true) {
                try {
                    System.out.print("Выберите количество или введите `end`: ");
                    customerCount = Integer.parseInt(reader.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Введите целое число");
                }
            }

            customerCountArray[indexProducts] = customerCount;

            customerBasket[indexProducts] = intCustomerChoice;

            totalPriceOneProduct[indexProducts] = prices[intCustomerChoice] * customerCount;
            indexProducts++;

        }

        for (int j : totalPriceOneProduct) {
            total += j;
        }

        System.out.println("Ваша продуктовая корзина: ");
        System.out.println("Наименование товара Количество  Цена/за.ед  Общая стоимость");

        for (int i = 0; i < customerBasket.length; i++) {
            if (customerCountArray[i] == 0) {
                continue;
            }
            int index = customerBasket[i];
            System.out.println(products[index]
                    + "                 "
                    + customerCountArray[i]
                    + "                "
                    + prices[index]
                    + "          "
                    + totalPriceOneProduct[i]);

        }
        System.out.println("Total:                                         " + total);
    }

}