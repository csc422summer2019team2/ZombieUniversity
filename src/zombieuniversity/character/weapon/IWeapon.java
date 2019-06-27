package zombieuniversity.character.weapon;

public interface IWeapon {
    /**
     * Get the accuracy of the weapon. This value is between 1 and 100. 100 accuracy weapons always hit.
     * @return accuracy of the weapon
     */
    public int getAccuracy();
    
    /**
     * Get the damage of the weapon
     * @return damage of the weapon
     */
    public int getDamage();
}
