package zombieuniversity.character;

public class Teacher extends Survivor {         //inheriting the property of survivor for Teacher
    public Teacher() {
        super(50, 5) ;      //health 50 and attack power 5 damage
    }
    
    @Override
    public String toString() {
        return "Teacher";
    }
}
