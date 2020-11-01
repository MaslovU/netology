package homework4_2_2;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

//    public static List<Character>
//
//    convertStringToCharList(String str) {
//        return new AbstractList<Character>() {
//
//            @Override
//            public Character get(int index) {
//                return str.charAt(index);
//            }
//
//            @Override
//            public int size() {
//                return str.length();
//            }
//        };
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическую формулу:");
        String input = scanner.nextLine();

        Stack<String> sign = new Stack<>();
        Queue<Integer> numbers = new ArrayDeque<>();

        for (String value:input.split(" ")) {
            try {
                int newChar = Integer.parseInt(String.valueOf(value));
                numbers.add(Integer.parseInt(String.valueOf(newChar)));
            } catch (Exception e) {
                sign.add(String.valueOf(value));
            }
        }
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        while (!sign.isEmpty()) {
            System.out.print(sign.pop() + " ");
        }
        System.out.println(" ");
    }
}
