package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Операции над double/float\n" +
                "1. Сравнить\n" +
                "2. Округлить\n" +
                "3. Отбросить дробную часть");

        System.out.println("Enter your needed operation");
        int value = Integer.parseInt(bufferedReader.readLine());

        while (true) {
            if (value != 1 && value != 2 && value != 3) {
                System.out.println("Your choice is wrong");
                System.out.println("Enter your needed operation again");
                value = Integer.parseInt(bufferedReader.readLine());
            } else {
                break;
            }
        }
        System.out.println("Enter first number");
        double num1 = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Enter second number");
        double num2 = Double.parseDouble(bufferedReader.readLine());

        switch (value) {
            case (1):
                System.out.println("Your choice is compare");
                if (num1 > num2) {
                    System.out.println("Max value is " + num1);
                } else if (num1 == num2) {
                    System.out.println("Both value is equals");
                } else {
                    System.out.println("Max value is " + num2);
                }
                break;
            case (2):
                System.out.println("Your choice is rounded");
                double result1 = Math.ceil(num1);
                double result2 = Math.ceil(num2);
                System.out.println("First rounded value is " + result1);
                System.out.println("Second rounded value is " + result2);
                break;
            case (3):
                System.out.println("Your choice is discard");
                long resultLong1 = (long) num1;
                long resultLong2 = (long) num2;
                System.out.println("First discarded value is " + resultLong1);
                System.out.println("Second discarded value is " + resultLong2);
                break;
            default:
                System.out.println("Your choice is wrong");
                break;
        }
    }
}