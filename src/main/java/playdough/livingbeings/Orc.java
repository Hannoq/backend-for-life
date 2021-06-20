package playdough.livingbeings;

public class Orc extends Humanoid{

    public Orc(){
        setStrength(13);
        setAgility(9);
        setWisdom(6);
        setWillpower(10);
    }
    @Override
    public String getRaceName() {
        return "orc";
    }
}
