package playdough;

public abstract class Thing {  //ANY object in the game
    class Stats {
        int healthPoints, staminaPoints; //healthPoints - global stat for every Thing object
        int strengtPoints, agilityPoints, wisdomPoints, charismaPoints;
    }
    Stats stats;
    String name;

}
