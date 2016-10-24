package entity;

public class Trap {
  int damage;
  String description;
  int procChance;

    public Trap(int damage, String description, int procChance) {
        this.damage = damage;
        this.description = description;
        this.procChance = procChance;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String describtion) {
        this.description = describtion;
    }

    public int getProcChance() {
        return procChance;
    }

    public void setProcChance(int procChance) {
        this.procChance = procChance;
    }
  
  
  
  
}