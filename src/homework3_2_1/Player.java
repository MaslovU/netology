package homework3_2_1;

import homework3_2_1.weapon.*;

import java.util.InputMismatchException;

class Player {

    private final Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[]{
                new AutomaticPistol(),
                new Pistol(),
                new WaterPistol(),
                new HandleHeldAntiTankGrenadeLauncher(),
                new SlingShot()
        };
    }

    public int getSlotsCount() {

        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) throws IllegalArgumentException, InputMismatchException {
        slot -= 1;

        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}