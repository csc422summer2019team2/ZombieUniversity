/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieuniversity;

import zombieuniversity.character.*;

public class ZombieUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Survivor[] survivors = new CharacterFactory().randomSurvivorArray(0, 20);
        Zombie[] zombies = new CharacterFactory().randomZombieArray(0, 15);
        
        // Count the number of character types in each array
        int teachers = 0, soldiers = 0, children = 0;
        int commonInfected = 0, tanks = 0;
        
        for(Survivor s : survivors) {
            if(s instanceof Child) {
                children++;
            }
            else if(s instanceof Soldier) {
                soldiers++;
            }
            else if(s instanceof Teacher) {
                teachers++;
            }
        }
        for(Zombie z : zombies) {
            if(z instanceof CommonInfected) {
                commonInfected++;
            }
            else if(z instanceof Tank) {
                tanks++;
            }
        }
        
        // Output the number of survivors.
        System.out.printf(
                "We have %d survivor%s trying to make it to safety (%d child%s, %d teacher%s, %d soldier%s)\n",
                survivors.length,
                survivors.length == 1 ? "" : "s",
                children,
                children == 1 ? "" : "ren",
                teachers,
                teachers == 1 ? "" : "s",
                soldiers,
                soldiers == 1 ? "" : "s"
        );
        
        // Output the number of zombies
        System.out.printf(
                "But there are %d zombie%s waiting for them (%d common infected, %d tank%s)\n",
                zombies.length,
                zombies.length == 1 ? "" : "s",
                commonInfected,
                tanks,
                tanks == 1 ? "" : "s"
        );
        
        CharacterOrder master = new CharacterOrder();
        master.attackRotation(survivors, zombies);

    }

}
