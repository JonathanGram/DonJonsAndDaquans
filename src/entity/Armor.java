package entity;

/**
 *
 * @author Johan
 */
public class Armor extends Item {
    
    int stamina;
    String name;

    public Armor(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    
    
    
}
