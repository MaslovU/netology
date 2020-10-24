package homework4_1_1;

import java.util.ArrayList;

public class Main {
    public static void main(String a[]) {
//        // параметризируем класс типом String
//        Box<String> sample1 = new Box<>("Нетология");
//        System.out.println(sample1);
//        // параметризируем класс типом Integer
//        // слева была ошибка, в дженерике передавался тип String,
//        // а справа принимается параметр типа Integer
//        Box<Integer> sample2 = new Box<>(1);
//        System.out.println(sample2);
//        // параметризируем класс типом Boolean
//        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
//        System.out.println(sample3);

        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);

        // key и obj не соответствовали типам принимаемых дженериков
        ArrayList<Box<String, String>> list1 = new ArrayList<>();
        list1.add(sample1);
        ArrayList<Box<Integer, Boolean>> list2 = new ArrayList<>();
        list2.add(sample2);
    }
}
