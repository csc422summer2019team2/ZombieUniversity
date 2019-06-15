
package zombieuniversity.character;

public class Soldier extends Survivor {         //inheriting the property of survivor for Soldier
    public Soldier() {
        super(100, 10) ;      //health 100 and attack power 10 damage 
    }
    
    @Override
    public String toString() {
        return "Soldier";
    }
}

