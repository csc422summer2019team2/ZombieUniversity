package zombieuniversity.character;

public abstract class Zombie extends Character {
    /**
     * Initialize a zombie
     * @param maxHealth maximum health of the character
     * @param damage    damage of the character
     */
    protected Zombie(int maxHealth, int damage) {
        super(maxHealth, damage);
    }
}
