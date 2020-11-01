package homework4_2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> myQueue = new LinkedList<>();

        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;

        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            System.out.println("Floor for start is 1");
            int level = Integer.parseInt(bufferedReader.readLine());
            if (level == 0) {
                break;
            }
            if (level > 0 && level < 26){
                System.out.println("Go to " + level);
                myQueue.add(level);
                if (previousFloor == -1) {
                    previousFloor = level;
                    // время движения лифта с первого этажа то нужного
                    totalSeconds += (level - 1) * waitMoveInSeconds;
                } else {
                    totalSeconds += Math.abs(level - previousFloor) * waitMoveInSeconds;
                    totalSeconds += waitDoorsInSeconds;
                }
            } else {
                System.out.println("No floor in this house");
            }
        }

        System.out.println("Size queue is: " + myQueue.size());
        System.out.println("You following next floors: ");
        int size = myQueue.size();
        for (int i = 0; i < size; i++){
            if (i == size - 1) {
                System.out.println("floor " + myQueue.poll() + " - floor 0");
            } else {
                System.out.print("floor " + myQueue.poll() + " -> ");
            }
        }
        System.out.println("Время затраченное лифтом на маршрут =: " + totalSeconds + " с.");
    }
}
