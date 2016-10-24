package entity;

/**
 *
 * @author Johan
 */
public class Weapon extends Item {
    
    int damage;
    int stamina;
    String name;
    int critAmp;

    public Weapon(String name,int damage, int stamina, int critamp) {
        this.name = name;
        this.damage = damage;
        this.stamina = stamina;
        this.critAmp = critamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCritAmp() {
        return critAmp;
    }

    public void setCritAmp(int critAmp) {
        this.critAmp = critAmp;
    }
    
}
