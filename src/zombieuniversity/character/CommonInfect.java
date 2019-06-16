package zombieuniversity.character;

public class CommonInfect extends Zombie {
    public CommonInfect() {
        super(30, 5);
    }
    
    @Override
    public String getTypeName() {
        return "Common Infected";
    }
}