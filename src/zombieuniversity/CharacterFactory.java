package zombieuniversity;

import java.util.Random;
import zombieuniversity.character.Zombie;
import zombieuniversity.character.CommonInfect;
import zombieuniversity.character.Survivor;
import zombieuniversity.character.Tank;

/**
 *
 * @author ianbergstrom
 */
public class CharacterFactory {
    
    /**
     *  Generates a random Integer inside a specified range.
     * @param min This is the minimum value for the range of the random number generator.
     * @param max This is the maximum value for the range of the random number generator.
     * @return Returns the random Integer that was generated inside the range specified.
     */
    public int randomInt(int min, int max) {
        Random r = new Random();
        int random = r.nextInt((max - min) + 1);
        return random;
    }
    /**
     *  Generates a random number to determine which Zombie type is to be returned
     * (0 for CommonInfect, 1 for Tank)
     * @return Returns a random Zombie type 
     */
    public Zombie randomZombieType(){
        int xand = randomInt(0, 1);
         if (xand == 0) {
                return new CommonInfect();
            } else {
                return new Tank();
            }
    }
    
     /**
      * This piece of code represents the randomized generation of the survivor 
      * type.
      * @return 
      */
    /*public Survivor randomSurvivorType(){
        int xand = randomInt(0,2);
            if (xand ==0){
            return new Child();
            }
            else if(xand ==1){
                    
            return new Teacher();
            }
    else return new Soldier();
    }
    */
    /**
     * Using the randomInt and randomZombieType methods, generates an array of random size
     * (inside the specified range) and populates it randomly with Zombie types.
     * @return Return an array of Zombies that has been randomly generated.
     */
    public Zombie[] randomZombieArray() {
        int rand = randomInt(0, 25);
        Zombie[] zombieHoard = new Zombie[rand];
        for (int i = 0; i < zombieHoard.length; i++) {
            zombieHoard[i]=randomZombieType();
        }
        return zombieHoard;
    }
    
    /**
     * Using the randomInt and randomSurvivorType methods, generates an array of random size
     * (inside the specified range) and populates it randomly with Survivor types.
     * @return Return an array of Survivors that has been randomly generated.
     * @return 
     */
/*public Survivor[] randomSurvivorArray() {
        int rand = randomInt(0, 35);
        Survivor[] foxTrotCharlie = new Survivor[rand];
        for (int i = 0; i < foxTrotCharlie.length; i++) {
            foxTrotCharlie[i]=randomSurvivorType();
        }
        return foxTrotCharlie;
}
*/
}