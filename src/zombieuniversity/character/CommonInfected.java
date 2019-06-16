package zombieuniversity.character;

public class CommonInfected extends Zombie {
    public CommonInfected() {
        super(30, 5);
    }
    
    @Override
    public String getTypeName() {
        return "CommonInfected";
    }
}