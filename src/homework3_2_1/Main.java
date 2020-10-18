package homework3_2_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int slot;

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        while (true) {
            System.out.println("Input number of weapon (1-5)");
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            try {
                player.shotWithWeapon(slot);
            } catch (Exception ex){
                System.out.println("Wrong number of slot weapon");
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Game over!");
    }
}