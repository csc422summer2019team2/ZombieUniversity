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
public class Axe implements IWeapon{

    @Override
    public int getAccuracy() {
        return 60;
    }

    @Override
    public int getDamage() {
        return 74;
    }

}
