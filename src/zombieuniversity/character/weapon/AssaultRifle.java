/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieuniversity.character.weapon;

/**
 *
 * @author ianbergstrom
 */
public class AssaultRifle implements IWeapon {

    @Override
    public int getAccuracy() {
        return 88;
    }

    @Override
    public int getDamage() {
        return 30;
    }

}
