package zombieuniversity.character;

public class Tank extends Zombie {
    public Tank() {
        super(150, 20);
    }
    
    @Override
    public String getTypeName() {
        return "Tank";
    }
}