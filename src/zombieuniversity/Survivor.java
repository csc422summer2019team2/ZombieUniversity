package zombieuniversity;

public abstract class Survivor extends Character {
    /**
     * Initialize a survivor
     * @param maxHealth maximum health of the character
     * @param damage    damage of the character
     */
    protected Survivor(int maxHealth, int damage) {
        super(maxHealth, damage);
    }
}
