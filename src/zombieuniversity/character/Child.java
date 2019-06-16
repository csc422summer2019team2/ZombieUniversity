package zombieuniversity.character;

public class Child extends Survivor {         //inheriting the property of survivor for Child
    public Child() {
        super(20, 2) ;      //health 20 and attack power 2 damage
    }
    
    @Override
    public String getTypeName() {
        return "Child";
    }
}
