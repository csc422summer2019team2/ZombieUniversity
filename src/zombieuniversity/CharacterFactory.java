package zombieuniversity;

import java.util.HashMap;
import java.util.Random;
import zombieuniversity.character.*;
import zombieuniversity.character.Character;
import zombieuniversity.character.weapon.*;

/**
 *
 * @author ianbergstrom
 */
public class CharacterFactory {

    /**
     * Generates a random Integer inside a specified range.
     *
     * @param min This is the minimum value for the range of the random number
     * generator.
     * @param max This is the maximum value for the range of the random number
     * generator.
     * @return Returns the random Integer that was generated inside the range
     * specified.
     */
    public int randomInt(int min, int max) {
        Random r = new Random();
        int random = min + r.nextInt((max - min) + 1);
        return random;
    }

    /**
     * Generates a random number to determine which Zombie type is to be
     * returned (0 for CommonInfect, 1 for Tank)
     *
     * @return Returns a random Zombie type
     */
    public Zombie randomZombieType() {
        switch (randomInt(0, 1)) {
            case 0:
                return new CommonInfected();
            case 1:
                return new Tank();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /**
     * This piece of code represents the randomized generation of the survivor
     * type.
     * @return Returns a random Survivor type
     */
    public Survivor randomSurvivorType() {
        switch (randomInt(0, 2)) {
            case 0:
                return new Child();
            case 1:
                return new Teacher();
            case 2:
                return new Soldier();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /**
     * Using the randomInt and randomZombieType methods, generates an array of
     * random size (inside the specified range) and populates it randomly with
     * Zombie types.
     *
     * @param min Minimum number of zombies
     * @param max Maximum number of zombies (inclusive)
     * @return Return an array of Zombies that has been randomly generated.
     */
    public Zombie[] randomZombieArray(int min, int max) {
        int rand = randomInt(min, max);
        Zombie[] zombieHoard = new Zombie[rand];
        for (int i = 0; i < zombieHoard.length; i++) {
            zombieHoard[i] = randomZombieType();
        }
        setDefaultNamesForArray(zombieHoard);
        return zombieHoard;
    }

    /**
     * Using the randomInt and randomSurvivorType methods, generates an array of
     * random size (inside the specified range) and populates it randomly with
     * Survivor types.
     *
     * @param min Minimum number of survivors
     * @param max Maximum number of survivors (inclusive)
     * @return Return an array of Survivors that has been randomly generated.
     */
    public Survivor[] randomSurvivorArray(int min, int max) {
        int rand = randomInt(min, max);
        Survivor[] foxTrotCharlie = new Survivor[rand];
        for (int i = 0; i < foxTrotCharlie.length; i++) {
            foxTrotCharlie[i] = randomSurvivorType();
        }
        setDefaultNamesForArray(foxTrotCharlie);
        return foxTrotCharlie;
    }

    /**
     * This method equips an array of survivors with weapons from
     * a randomly generated cache of weapons
     * 
     * @param survivors Array of Survivors
     */
    public void equipSurvivors(Survivor[] survivors) {
        IWeapon[] cache = randomWeaponCache(0, 35);

        int x=0;
        while(x<cache.length &&x<survivors.length){
            survivors[x].setWeapon(cache[x]);
            x++;
        }
    }
    /**
     *  Generates a random array of weapons, which has a length inside the given range
     *  Populates the array with an assortment of random weapon types
     * @param min Minimum number of weapons
     * @param max Maximum number of weapons (inclusive)
     * @return Return an IWeapon array that contains randomly generated weapon types
     */
    public IWeapon[] randomWeaponCache(int min, int max) {
        int rand = randomInt(min, max);
        IWeapon[] cache = new IWeapon[rand];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = randomWeaponType();
        }
        return cache;
    }

    /**
     * This method returns a random weapon type
     * 
     * @return Return weapon type that was generated
     */
    public IWeapon randomWeaponType() {
        switch (randomInt(0, 8)) {
            case 0:
                return new AssaultRifle();
            case 1:
                return new Axe();
            case 2:
                return new Crossbow();
            case 3:
                return new Crowbar();
            case 4:
                return new FryingPan();
            case 5:
                return new Knife();
            case 6:
                return new Pistol();
            case 7:
                return new SMG();
            case 8:
                return new Shotgun();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /**
     * Set the default names for the characters in the array
     *
     * @param array array to set default names
     */
    private void setDefaultNamesForArray(Character[] array) {
        HashMap<String, Integer> counts = new HashMap<>();
        for (Character c : array) {
            // Get the type name
            String typeName = c.getTypeName();
            Integer value = counts.get(typeName);

            // If it doesn't exist, initialize it to 0. Otherwise, increment it
            if (value == null) {
                value = 0;
                counts.put(typeName, value);
            } else {
                value = value + 1;
                counts.put(typeName, value);
            }

            // Set the name
            c.setName(value.toString());
        }
    }
}
