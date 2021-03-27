package playdough;

public abstract class Humanoid {
    private int age;
    private int healthPoints, energyPoints;
    private boolean isConscious;
    private int strength, agility, wisdom, willpower;
    private String name;


    //constructions
    public Humanoid(int age, boolean isConscious, int strength, int agility, int wisdom, int willpower, String name) {
        this.age = age;
        this.isConscious = isConscious;
        this.strength = strength;
        this.agility = agility;
        this.wisdom = wisdom;
        this.willpower = willpower;
        this.name = name;
    }

    public Humanoid() {

    }

    //get-setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isConscious() {
        return isConscious;
    }

    public void setConscious(boolean conscious) {
        isConscious = conscious;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    public void punch(Humanoid humanoid){
        humanoid.healthPoints -= (int) ((this.strength / 5) + (this.agility / 10) + 5);
    }
    public void kick(Humanoid humanoid){
        humanoid.healthPoints -= (int) ((this.strength/2) + (this.agility / 5) + 8);
    }
}