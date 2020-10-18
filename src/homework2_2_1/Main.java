package homework2_2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static int SIZE = 3;
    static int[][] colors = new int[SIZE][SIZE];
    static int[][] rotatedColors = new int[SIZE][SIZE];

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int anger;
        Integer[] angers = new Integer[]{90, 180, 270, -90, -180, -270};

        while (true) {
            System.out.print("Choice your anger (90, 180, 270, -90, -180, -270): ");
            anger = Integer.parseInt(reader.readLine());
            if (Arrays.asList(angers).contains(anger)) {
                break;
            } else {
                System.out.println("You enter invalid value. Please try again.");
            }
        }

        Random random = new Random();
        for (
                int i = 0;
                i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        // создаем матрицу
        for (
                int i = 0;
                i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ");

        switch (anger) {
            case (90) :
                clockWise90();
                break;
            case (-270):
                clockWise90();
                break;
            case (180):
                clockWise180();
                break;
            case (-180):
                clockWise180();
                break;
            case (270):
                clockWise270();
                break;
            case (-90):
                clockWise270();
                break;
            default :
                System.out.println("You enter invalid value");
        }

        for (
                int i = 0;
                i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }

    }

    static void clockWise90() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][SIZE - j - 1] = colors[j][i];
            }
        }
    }

    static void clockWise180() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[SIZE - 1 - i][SIZE - j - 1] = colors[i][j];
            }
        }
    }

    static void clockWise270() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[SIZE - j - 1][i] = colors[i][j];
            }
        }
    }
}