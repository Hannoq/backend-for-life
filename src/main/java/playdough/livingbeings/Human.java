package playdough.livingbeings;

public class Human extends Humanoid{

    public Human(){
        setStrength(10);
        setAgility(11);
        setWisdom(9);
        setWillpower(10);
    }
    @Override
    public String getRaceName() {
        return "human";
    }
}
