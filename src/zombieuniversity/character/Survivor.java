package zombieuniversity.character;

import zombieuniversity.character.weapon.IWeapon;

public abstract class Survivor extends Character {
    /**
     * Initialize a survivor
     * @param maxHealth maximum health of the character
     * @param damage    damage of the character
     */
    protected Survivor(int maxHealth, int damage) {
        super(maxHealth, damage);
        unarmedDamage = damage;
    }
    
    /**
     * Get the weapon held by the character
     * @return weapon held by the character
     */
    public IWeapon getWeapon() {
        return weapon;
    }
    
    /**
     * Set the weapon held by the character
     * @param weapon new weapon for the character
     */
    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
        
        if(weapon == null) {
            setDamage(unarmedDamage);
        }
        else {
            setDamage(weapon.getDamage());
        }
    }
    
    @Override
    public String toString() {
        // Get our weapon name
        String weaponName;
        if(weapon == null) {
            weaponName = "Unarmed";
        }
        else {
            weaponName = weapon.toString();
        }
        
        // Combine the name with the weapon
        return String.format("%s (%s)", super.toString(), weaponName);
    }
    
    /**
     * This is the weapon held by the character
     */
    private IWeapon weapon;
    
    /**
     * This is the unarmed damage of the character
     */
    private final int unarmedDamage;
}
