package entity;
import entity.Room;
import java.util.ArrayList;
import java.util.List;

public class Player {
    
    double health = 100.0;
    String name;
    int gold;
    Room croom;
    Room prevRoom;
    double baseAttack = 20;
    int critChance = 35;
    int critAmplifier = 150;
    Weapon weapon;
    Armor armor;
    
    List<Item> inventoryList = new ArrayList();

    public List<Item> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<Item> itemList) {
        this.inventoryList = itemList;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getCritAmplifier() {
        if(null != this.getWeapon()){
            return critAmplifier+this.getWeapon().getCritAmp();
        }
        return critAmplifier;
    }

    public void setCritAmplifier(int critAmplifier) {
        this.critAmplifier = critAmplifier;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }    

    public double getBaseAttack() {
        
        if(null != this.getWeapon()){
            return baseAttack+this.getWeapon().getDamage();
        }
        else return baseAttack;
    }

    public void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

    public Room getPrevRoom() {
        return prevRoom;
    }

    public void setPrevRoom(Room prevRoom) {
        this.prevRoom = prevRoom;
    }
    
    public Room getCroom() {
        return croom;
    }

    public void setCroom(Room croom) {
        this.croom = croom;
    }

    public Player(String name) {
        this.name = name;
    }

    public double getHealth() {
        
        if(null != this.getArmor() && null != this.getWeapon()){
            return health+(this.getArmor().getStamina()*10)+(this.getWeapon().getStamina()*10);
        }
        
        if(null != this.getArmor()){
            return health+(this.getArmor().getStamina()*10);
        }
        
        if(null != this.getWeapon()){
            return health+(this.getWeapon().getStamina()*10);
        }
        
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
    public double getTotalHealth(){
        
        if(null != this.getArmor() && null != this.getWeapon()){
            return 100+(this.getArmor().getStamina()*10)+(this.getWeapon().getStamina()*10);
        }
        if(null != this.getArmor()){
            return 100+(this.getArmor().getStamina()*10);
        }
        if(null != this.getWeapon()){
            return 100+(this.getWeapon().getStamina()*10);
        }
        
        return 100;
        
    }
    
    public double getHealthPreItems() {
        return health;
    }
    
    
    
    
    
    
}
