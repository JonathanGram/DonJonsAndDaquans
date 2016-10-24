package entity;
   
import java.util.ArrayList;
import java.util.List;

public class Room {
    
    int roomId;
    String description;
    Trap trap;
    List<Item> itemList = new ArrayList();
    List<Creature> monsterList = new ArrayList();
    int gold;
    
    Room west;
    Room east;
    Room south;
    Room north;

    public Room(int roomId, String description) {
        this.roomId = roomId;
        this.description = description;
    }
    public Room(int roomId, String description, Creature creature) {
        this.roomId = roomId;
        this.description = description;
        this.getMonsterList().add(creature);
    }
    public Room(int roomId, String description, int gold) {
        this.roomId = roomId;
        this.description = description;
        this.gold = gold;
    }
    public Room(int roomId, String description, int gold, Trap trap) {
        this.roomId = roomId;
        this.description = description;
        this.gold = gold;
        this.trap = trap;
    }
    public Room(int roomId, String description, Trap trap) {
        this.roomId = roomId;
        this.description = description;
        this.gold = gold;
        this.trap = trap;
    }
    public Room(int roomId, String description, int gold, Creature crt1) {
        this.roomId = roomId;
        this.description = description;
        this.gold = gold;
        this.getMonsterList().add(crt1);
    }
    public Room(int roomId, String description, int gold, Creature crt1, Creature crt2) {
        this.roomId = roomId;
        this.description = description;
        this.gold = gold;
        this.getMonsterList().add(crt1);
        this.getMonsterList().add(crt2);
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
    public Trap getTrap() {
        return trap;
    }

    public void setTrap(Trap trap) {
        this.trap = trap;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Creature> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<Creature> monsterList) {
        this.monsterList = monsterList;
    }
    
        
    
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }
    
    
    
    
    
    
    
    
}
