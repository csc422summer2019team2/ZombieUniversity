package zombieuniversity.character;

import java.util.Random;
import zombieuniversity.character.weapon.*;

public abstract class Survivor extends Character {
    /**
     * Initialize a survivor
     * @param maxHealth maximum health of the character
     * @param damage damage of the character
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

        // If we're losing our weapon, restore the unarmed damage
        if (weapon == null) {
            setDamage(unarmedDamage);
        } // If not, get the damage of the new weapon
        else {
            setDamage(weapon.getDamage());
        }
    }

    @Override
    public void attack(Character otherCharacter) {
        // If we don't have a weapon or our weapon is 100% accurate, then we can hit. If we do have a weapon, generate
        // a number between 0 and 99 to determine if we hit.
        if (weapon == null || weapon.getAccuracy() >= 100 || weapon.getAccuracy() > (new Random()).nextInt(100)) {
            super.attack(otherCharacter);
        }
    }

    @Override
    public String toString() {
        // Set weapon name to unarmed initially
        //
        String weaponName = "Unarmed";
        
        //becuase the toString method was having problems, manually check the instance
        //and assign a weaponName based on what is found
        
        if (weapon instanceof Shotgun) {
            weaponName = "Shotgun";
        } else if (weapon instanceof SMG) {
            weaponName = "Sub Machine Gun";
        } else if (weapon instanceof Pistol) {
            weaponName = "Pistol";
        } else if (weapon instanceof Knife) {
            weaponName = "Knife";
        } else if (weapon instanceof FryingPan) {
            weaponName = "FryingPan";
        } else if (weapon instanceof Crowbar) {
            weaponName = "Crowbar";
        } else if (weapon instanceof Crossbow) {
            weaponName = "Crossbow";
        } else if (weapon instanceof Axe) {
            weaponName = "Axe";
        } else if (weapon instanceof AssaultRifle) {
            weaponName = "AssaultRifle";
        } else {
            //do nothing, assume the character is unequipped
        }
        // Combine the name with the weapon to be printed out in the kill feed
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
