package zombieuniversity;

public abstract class Character {
    /**
     * Attack the other character, reducing its health by this character's damage.
     * @param otherCharacter 
     */
    public void attack(Character otherCharacter) {
        // If we are going below 0, set it to 0
        if(otherCharacter.health < damage) {
            otherCharacter.health = 0;
        }
        else {
            otherCharacter.health -= damage;
        }
    }
    
    /**
     * Get the health of the character
     * @return health
     */
    public int getHealth() {
        return health;
    }
    
    /**
     * Get the health of the character
     * @return true if the character has at least 0 health
     */
    public boolean isAlive() {
        return health > 0;
    }
    
    /**
     * Initialize a character
     * @param maxHealth maximum health of the character
     * @param damage    damage of the character
     */
    protected Character(int maxHealth, int damage) {
        this.health = maxHealth;
        this.damage = damage;
    }
    
    @Override
    public abstract String toString();
    
    private int health;
    private int damage;
}
