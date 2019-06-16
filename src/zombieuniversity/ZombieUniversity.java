/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieuniversity;

import zombieuniversity.character.Survivor;
import zombieuniversity.character.Zombie;

public class ZombieUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Survivor[] survivors = new CharacterFactory().randomSurvivorArray(0, 35);
        Zombie[] zombies = new CharacterFactory().randomZombieArray(0, 25);
        System.out.println("We have " + survivors.length + " survivors trying to make it to safety.\n"
                + "But there are " + zombies.length + " zombies waiting for them.");
        CharacterOrder master = new CharacterOrder();
        master.attackRotation(survivors, zombies);

    }

}
