/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieuniversity;

import zombieuniversity.character.*;
import zombieuniversity.character.Character;

/**
 *
 * @author Paul, Ian, Daniel
 */
class CharacterOrder {

    public static boolean endScenario(Character[] characters) {
        int alive = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i].isAlive()) {
                alive++;
            }
        }
        if (alive <= 0) {
            return true;
        }
        return false;
    }

    public void attackCycle(Character[] attackers, Character[] defenders) {
        for (int a = 0; a < attackers.length; a++) {
            //every zombie in attackers attack every zombie in defenders exactly once
            for (int d = 0; d < defenders.length; d++) {
                if (attackers[a].isAlive()) {
                    attackers[a].attack(defenders[d]);
                   /*
                    System.out.println(attackers[a].toString() + " attacked " + defenders[d].toString()
                            + ". the defender's health is now " + defenders[d].getHealth());
                    */
                }
            }

        }
    }

    public void attackRotation(Character[] survivors, Character[] zombies) {
        boolean cont = true;
        while (cont) {
            attackCycle(survivors, zombies);
            attackCycle(zombies, survivors);
            if (endScenario(survivors) || endScenario(zombies) || zombies.length == 0 || survivors.length == 0) {
                cont = false;
                break;
            }

        }
        
        int numAlive = 0;
        for (Character c : survivors) {
            if (c.isAlive()) {
                numAlive++;
            }
        }
        System.out.println("It seems that " + numAlive + " have made it to safety.");

    }

}

public class ZombieUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Zombie[] survivors = new CharacterFactory().randomZombieArray();
        Zombie[] zombies = new CharacterFactory().randomZombieArray();
        System.out.println("We have " + survivors.length + " survivors trying to make it to safety.\n"
                + "But there are " + zombies.length + " zombies waiting for them.");
        CharacterOrder master = new CharacterOrder();
        master.attackRotation(survivors, zombies);

    }

}
