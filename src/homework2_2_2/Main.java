package homework2_2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int SIZE = 10;
        int EMPTY = 0;
        int SHIP = 1;
        int DEAD = 2;
        int MISS = 3;
        int MAX_COUNT = 10;
        int MAX_COUNT_ATTEMPT = 30;
        int countAttempts = 0;
        int currentKilledShips = 0;
        int iCustomerInput;
        int jCustomerInput;

        int[][] warField = new int[SIZE][SIZE];

        // Создаем корабли и расставляем на поле
        Random random = new Random();
        for (int i = 0; i< MAX_COUNT; i++) {
            int shipPlace1 = random.nextInt(SIZE);
            int shipPlace2 = random.nextInt(SIZE);

            if (warField[shipPlace1][shipPlace2] == SHIP){
                i--;
            }

            warField[shipPlace1][shipPlace2] = SHIP;
        }

        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                System.out.print(warField[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {
            if (currentKilledShips == MAX_COUNT) {
                System.out.println("Game over! All ships is dead");
                break;
            }
            if (countAttempts == MAX_COUNT_ATTEMPT) {
                System.out.println("Game over! Attempts is lose");
                break;
            }
            while (true) {
                try {
                    System.out.println("Input i - coordinate (0-9)");
                    iCustomerInput = Integer.parseInt(reader.readLine());
                    System.out.println("Input j - coordinate (0-9)");
                    jCustomerInput = Integer.parseInt(reader.readLine());
                    if (iCustomerInput >= 0 && iCustomerInput < 10 && jCustomerInput >=0 && jCustomerInput < 10) {
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }


            int guess = warField[iCustomerInput][jCustomerInput];
            if (guess == SHIP) {
                System.out.println("Kill!");
                warField[iCustomerInput][jCustomerInput] = DEAD;
                currentKilledShips++;
            }
            if (guess == DEAD) {
                System.out.println("Was be attacked");
            }
            if (guess == EMPTY) {
                System.out.println("Missing");
                warField[iCustomerInput][jCustomerInput] = MISS;
            }

            for (int k = 0; k< SIZE; k++) {
                for (int j = 0; j< SIZE; j++) {
                    System.out.print(warField[k][j] + " ");
                }
                System.out.println();
            }

            countAttempts++;

            System.out.println(" ");
            System.out.print("Count killed ships: ");
            System.out.println(currentKilledShips);
            System.out.print("Count of attempts: ");
            System.out.println(countAttempts + "\n");

        }
    }
}