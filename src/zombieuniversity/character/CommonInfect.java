package zombieuniversity.character;

public class CommonInfect extends Zombie {
    public CommonInfect() {
        super(30, 5);
    }
    
    @Override
    public String toString() {
        return "Common Infected";
    }
}