package entity;


public class Creature {
    String name;
    double health;
    double attackDamage;
    int critChance;
    int critAmplifier;
    boolean Alive = true;
    

    public Creature(String name, double health, double attackDamage, int critChance, int critAmplifier) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.critChance = critChance;
        this.critAmplifier = critAmplifier;
    }

    public boolean isAlive() {
        return Alive;
    }

    public void setAlive(boolean Alive) {
        this.Alive = Alive;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritAmplifier() {
        return critAmplifier;
    }

    public void setCritAmplifier(int critAmplifier) {
        this.critAmplifier = critAmplifier;
    }
    
    
}