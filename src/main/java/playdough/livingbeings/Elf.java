package playdough.livingbeings;

public class Elf extends Humanoid{

    public Elf(){
        setStrength(7);
        setAgility(15);
        setWisdom(12);
        setWillpower(11);
    }
    @Override
    public String getRaceName() {
        return "elf";
    }
}
