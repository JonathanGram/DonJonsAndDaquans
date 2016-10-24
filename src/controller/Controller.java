package controller;

import entity.Player;
import entity.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entity.Creature;
import entity.Item;
import entity.Weapon;
import entity.Trap;
import java.util.Random;
import entity.Potion;
import entity.Armor;
import entity.Treasure;

public class Controller {

    List<Room> roomList = new ArrayList();
    Player player = new Player("joe");
    Scanner scan = new Scanner(System.in);
    boolean firstStartGame = true;
    Random rand = new Random();

    //create items to be distributed amongst rooms
    Weapon sulfuras = new Weapon("Sulfuras", 35, 8, 40);
    Potion potion = new Potion(75);
    Armor breastplate = new Armor("Iron Breastplate", 12);
    Treasure endTreasure = new Treasure();

    boolean game = true;

    public void createRooms() {

        //creates monsters to populate the rooms with
        Creature crt1 = new Creature("Ronnie", 60, 18, 12, 140);
        Creature crt2 = new Creature("Garrosh Hellscream", 80, 22, 9, 210);
        Creature crt3 = new Creature("Kim Jong Un", 75, 10, 90, 105);
        
        player.setWeapon(sulfuras);

        //Create trap(s) to put in the rooms
        Trap dartTrap = new Trap(25, "A dart flies through the room and hits you in the eye ball.", 60);
        Trap doorTrap = new Trap(10, "The entrance of the room has a fake doorstep, you fall and hurt your knee.. a little.", 100);
        Trap deathTrap = new Trap(9001, "While fondling with your fingers in your pocket, you accidentaly summon the Supreme Leader of the Burning Legion. Sargeras is here.", 20);

        // creates rooms
        Room room1 = new Room(1, "You stand at the entrance of a cavern. There is a eccentric smell coming from the ladder ahead of you..");
        Room room2 = new Room(2, "As you descend the ladder the smell enhances, you end up in a small dark room with next to no visibility", 10, crt1);
        Room room3 = new Room(3, "Blood is smeared on the walls in an unrecognizable pattern");
        Room room4 = new Room(4, "A clothed skeleton lies in the corner");
        Room room5 = new Room(5, "The room is brighter than the previous rooms, you see a small shining object in the corner", 70);
        Room room6 = new Room(6, "Blood is smeared on the walls writing: Get Out", dartTrap);
        Room room7 = new Room(7, "The room is more narrow than the others, almost like it's getting smaller and smaller");
        Room room8 = new Room(8, "Hieroglyphs of the Burning Legion light up on the walls as you enter the room");
        Room room9 = new Room(9, "You enter an even smaller and darker room");
        Room room10 = new Room(10, "THe light from the hieroglyphs fades as you enter the romo, leaving you in total darkness", deathTrap);
        Room room11 = new Room(11, "As you enter the room bats starts flying and screeching above you");
        Room room12 = new Room(12, "The sound of the screeching bats is now replaced with complete silence and darkness", crt2);
        Room room13 = new Room(13, "You see a light coming from a nearby room");
        Room room14 = new Room(14, "This room reminds you of your parents old bedroom.. but why?", doorTrap);
        Room room15 = new Room(15, "A voice cries in the distance, but you can't hear what");
        Room room16 = new Room(16, "The voice becomes more clear");
        Room room17 = new Room(17, "You enter a bright room where you find a chest in the corner containing pornography and gold");
        Room room18 = new Room(18, "The room becomes bigger but still just as dark");
        Room room19 = new Room(19, "Visibility is low, handicapping you of one of your most valuable senses", 25);
        Room room20 = new Room(20, "The room has a gloomy atmosphere", crt3);
        Room room21 = new Room(21, "A deep dark voice echoes through the cave only getting louder and louder as if it came closer and closer", dartTrap);
        Room room22 = new Room(22, "Your old meth teacher appears in a spectre of herself telling you to do your homework");
        Room room23 = new Room(23, "A blue light shines faintly", doorTrap);
        Room room24 = new Room(24, "The blue light enhances");
        Room room25 = new Room(25, "A bright golden light shines from the ceilling of the cave", 45);
        Room room26 = new Room(26, "The brightness has now faded into complete obscurity");
        Room room27 = new Room(27, "You see the light at the end of the tunnel, only for you to realize you're hallucinating");
        Room room28 = new Room(28, "You feel surrounded by a devouring darkness", doorTrap);
        Room room29 = new Room(29, "You sense a lightbeam that has made its way down the cracks from the ceiling above you..");

        //Adds items to the itemLists of the Rooms
        room17.getItemList().add(sulfuras);
        room3.getItemList().add(potion);
        room21.getItemList().add(breastplate);
        room29.getItemList().add(endTreasure);

        //sets players current room to room1
        player.setCroom(room1);

        //adds all romes to roomlist
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);
        roomList.add(room11);
        roomList.add(room12);
        roomList.add(room13);
        roomList.add(room14);
        roomList.add(room15);
        roomList.add(room16);
        roomList.add(room17);
        roomList.add(room18);
        roomList.add(room19);
        roomList.add(room20);
        roomList.add(room21);
        roomList.add(room22);
        roomList.add(room23);
        roomList.add(room24);
        roomList.add(room25);
        roomList.add(room26);
        roomList.add(room27);
        roomList.add(room28);
        roomList.add(room29);

        //sets exits from each room
        room1.setSouth(room2);

        room2.setNorth(room1);
        room2.setEast(room3);
        room2.setWest(room4);

        room3.setWest(room2);
        room3.setEast(room5);
        room3.setSouth(room6);

        room4.setSouth(room8);
        room4.setWest(room7);
        room4.setEast(room2);

        room5.setWest(room3);

        room6.setNorth(room3);

        room7.setSouth(room9);
        room7.setWest(room11);
        room7.setEast(room4);

        room8.setEast(room10);
        room8.setNorth(room4);

        room9.setSouth(room18);
        room9.setNorth(room7);

        room10.setWest(room8);

        room11.setWest(room12);
        room11.setEast(room7);

        room12.setWest(room13);
        room12.setEast(room11);

        room13.setWest(room14);
        room13.setSouth(room15);
        room13.setEast(room12);

        room14.setEast(room13);
        room14.setSouth(room17);

        room15.setSouth(room16);
        room15.setNorth(room13);

        room16.setNorth(room15);

        room17.setNorth(room14);

        room18.setNorth(room9);
        room18.setWest(room19);

        room19.setSouth(room20);
        room19.setEast(room18);

        room20.setWest(room21);
        room20.setSouth(room25);
        room20.setNorth(room19);

        room21.setEast(room20);
        room21.setWest(room22);

        room22.setEast(room21);
        room22.setSouth(room23);

        room23.setNorth(room22);
        room23.setWest(room24);

        room24.setEast(room23);

        room25.setNorth(room20);
        room25.setEast(room26);

        room26.setSouth(room27);
        room26.setWest(room25);

        room27.setNorth(room26);
        room27.setWest(room28);

        room28.setSouth(room29);
        room28.setEast(room27);

    }

    public void startGame() {

        if (firstStartGame) {
            System.out.println("Welcome to Sars");
            System.out.println("Your mission is to move through the dungeon,");
            System.out.println("slay the mobs in your way, retrieve all the gold you can acquire,");
            System.out.println("and find the gleaming treasure at the end!");
            System.out.println("NOTE: You start with one potion, once it has been used you have no more, untill you find more.");

            //gives player 1 potion to start the game with
            player.getInventoryList().add(potion);

            firstStartGame = false;
        }

        //prints room description for immersion xxD
        System.out.println("*******************************");
        System.out.println(player.getCroom().getDescription());
        System.out.println("*******************************");

        while (game) {

            //if pointing to current rooms trap element is NOT null, trap is activated
            checkRoomForTrap();

            //checks for monsters in current room
            checkForMonstersAndHandleResult();

            //asks player for instructions (movement, pick up gold, misc.)
            handleUserInput(printOptionsAndWaitForAnswer());

        }

        System.out.println("With the extra power from the end treasure,");
        System.out.println("you jump forcefully, smashing your head into cracks in the ceiling,");
        System.out.println("and somehow you venture all the way through, untill you reach open space with fresh air.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Congratulations, you have ventured through the dungeon,");
        System.out.println("fought monsters, looted gold, and found the End Treasure.");
        System.out.println("-----The game is over-----");

    }

    public void checkForMonstersAndHandleResult() {

        //if rooms monsterlist contains a monster AND it is alive
        if (player.getCroom().getMonsterList().size() > 0 && player.getCroom().getMonsterList().get(0).isAlive()) {

            String mobChoice;

            System.out.println("There is a " + player.getCroom().getMonsterList().get(0).getName() + " in here!");
            System.out.println("You must defeat it, in order to move further this way into the dungeon.");
            System.out.println("What do you do?");
            System.out.println("<<<<<<<<<<<<<<<");
            System.out.println("Fight it");
            System.out.println("Run");
            System.out.println("<<<<<<<<<<<<<<<");

            mobChoice = scan.nextLine();

            while (!mobChoice.equalsIgnoreCase("fight it") && !mobChoice.equalsIgnoreCase("run") && !mobChoice.equalsIgnoreCase("persuade it")) {
                System.out.print("your decision: ");
                mobChoice = scan.nextLine().toLowerCase();
            }

            if (mobChoice.equals("fight it")) {
                executeFightingEnvironment();
            }
            if (mobChoice.equals("run")) {
                //sets players current room to the previous room and starts roomhandling over
                player.setCroom(player.getPrevRoom());
                System.out.println("You flee to the previous room..!");
                startGame();
            }

        }

    }

    public void checkRoomForTrap() {

        //checks if room has a trap
        if (null != player.getCroom().getTrap()) {

            //rolls to check if trap procs
            int chance = rand.nextInt(100) + 1;
            if (chance < player.getCroom().getTrap().getProcChance()) {

                System.out.println("xxxxxxxxxxxxxxxxxxxxx");
                System.out.println("You activated a trap!");
                System.out.println("xxxxxxxxxxxxxxxxxxxxx");

                System.out.println(player.getCroom().getTrap().getDescription() + " it deals " + player.getCroom().getTrap().getDamage() + " damage to you!");

                //reduces players health by traps damage
                player.setHealth(player.getHealth() - player.getCroom().getTrap().getDamage());
                System.out.println("xxxxxxxxxxxxxxxxxxxxx");

                checkForDeath();
            }
        }

    }

    public String printOptionsAndWaitForAnswer() {
        int i = 1;

        System.out.println("|---------------|");
        System.out.println("[0] Check player status");
        if (null != player.getCroom().getNorth()) {
            System.out.println("[" + i + "] Move north");
            i++;
        }
        if (null != player.getCroom().getSouth()) {
            System.out.println("[" + i + "] Move south");
            i++;
        }
        if (null != player.getCroom().getWest()) {
            System.out.println("[" + i + "] Move west");
            i++;
        }
        if (null != player.getCroom().getEast()) {
            System.out.println("[" + i + "] Move east");
            i++;
        }
        System.out.println("[" + i + "] Cry for help");
        i++;

        checkForMoreOptions(i);

        System.out.println("|---------------|");

        System.out.print("Your choice: ");
        String reply = scan.nextLine().toLowerCase();

        return reply;

    }

    public void checkForDeath() {

        if (player.getHealth() <= 0) {
            System.out.println("You have died. Well done");
            System.out.println("----- GAME OVER -----");
            System.exit(0);
        }

    }

    public void checkForMoreOptions(int i) {

        if (player.getCroom().getGold() > 0) {
            System.out.println("[" + i + "] Pick up gold");
            i++;
        }
        if (player.getCroom().getItemList().size() > 0) {
            System.out.println("[" + i + "] Pick up item");
            i++;
        }
        if (player.getInventoryList().size() > 0) {
            System.out.println("[" + i + "] Check inventory");
            i++;
        }

    }

    public void handleUserInput(String userInput) {

        switch (userInput) {

            case "move north": {

                if (null == player.getCroom().getNorth()) {
                    System.out.println("Moving north is not a valid option");
                    break;
                } else {

                    //sets players "previous" room to current room
                    player.setPrevRoom(player.getCroom());

                    Room nxtRoom = player.getCroom().getNorth();

                    //sets players current room to next room (nxtroom decided by input)
                    player.setCroom(nxtRoom);
                    // prints description of the room... for immersion xDD
                    System.out.println("*******************************");
                    System.out.println(player.getCroom().getDescription());
                    System.out.println("*******************************");
                    break;

                }

            }

            case "move south": {

                if (null == player.getCroom().getSouth()) {
                    System.out.println("Moving south is not a valid option");
                    break;
                } else {

                    //sets players "previous" room to current room
                    player.setPrevRoom(player.getCroom());

                    Room nxtRoom = player.getCroom().getSouth();

                    //sets players current room to next room (nxtroom decided by input)
                    player.setCroom(nxtRoom);
                    // prints description of the room... for immersion xDD
                    System.out.println("*******************************");
                    System.out.println(player.getCroom().getDescription());
                    System.out.println("*******************************");
                    break;

                }

            }

            case "move east": {

                if (null == player.getCroom().getEast()) {
                    System.out.println("Moving east is not a valid option");
                    break;
                } else {

                    //sets players "previous" room to current room
                    player.setPrevRoom(player.getCroom());

                    Room nxtRoom = player.getCroom().getEast();

                    //sets players current room to next room (nxtroom decided by input)
                    player.setCroom(nxtRoom);
                    // prints description of the room... for immersion xDD
                    System.out.println("*******************************");
                    System.out.println(player.getCroom().getDescription());
                    System.out.println("*******************************");
                    break;

                }

            }

            case "move west": {

                if (null == player.getCroom().getWest()) {
                    System.out.println("Moving west is not a valid option");
                    break;
                } else {

                    //sets players "previous" room to current room
                    player.setPrevRoom(player.getCroom());

                    Room nxtRoom = player.getCroom().getWest();

                    //sets players current room to next room (nxtroom decided by input)
                    player.setCroom(nxtRoom);
                    // prints description of the room... for immersion xDD
                    System.out.println("*******************************");
                    System.out.println(player.getCroom().getDescription());
                    System.out.println("*******************************");
                    break;

                }

            }

            case "pick up gold": {

                if (player.getCroom().getGold() > 0) {
                    //adds rooms gold to players current gold count
                    player.setGold(player.getCroom().getGold() + player.getGold());
                    System.out.println("You picked up " + player.getCroom().getGold() + " gold!");

                    //removes gold from the room
                    player.getCroom().setGold(0);
                }
                break;

            }

            case "cry for help": {

                System.out.println("SARGERAS YELLS: THERE IS NO HELP HERE, YOUNG PADAWAN");
                break;

            }

            case "pick up item": {

                if (player.getCroom().getItemList().size() > 0) {

                    Item cItem = player.getCroom().getItemList().get(0);

                    //gives the player the item in the list (there is always only one, had there been less you will not get in here)
                    player.getInventoryList().add(player.getCroom().getItemList().get(0));
                    System.out.println("You looted " + player.getCroom().getItemList().get(0).getName());

                    //removes item from the rooms inventory list
                    player.getCroom().getItemList().remove(0);

                    //checks if the item looted was the End Treasure
                    if (cItem.getName().equals("End Treasure")) {
                        game = false;
                    }

                }

                break;
            }

            case "check inventory": {

                if (player.getInventoryList().size() <= 0) {
                    break;
                }

                manageInventory();

                break;
            }
            
            case "check player status": {
                
                givePlayerStatus();
                
            }

        }

    }
    
    public void givePlayerStatus() {
        
        System.out.println("|-----------------------|");
        System.out.println("|Current health : " + player.getHealth());
        System.out.println("|Total health   : " + player.getTotalHealth());
        System.out.println("|Gold collected : " + player.getGold());
        System.out.println("|Base attack    : " + player.getBaseAttack());
        System.out.println("|Crit chance    : " + player.getCritChance());
        System.out.println("|Crit amplifier : " + player.getCritAmplifier());
        if(null != player.getArmor()){
        System.out.println("|Equipped armor : " + player.getArmor().getName());
        }
        if(null != player.getWeapon()){
        System.out.println("|Equipped weapon: " + player.getWeapon().getName());
        }
        System.out.println("|-----------------------|");
        
    }

    public void manageInventory() {

        System.out.println("Your inventory contains:");
        for (Item cItem : player.getInventoryList()) {

            System.out.println("--" + cItem.getName());

        }
        System.out.println("To equip items,             type: 'equip <itemname> without <>'");
        System.out.println("To drink potions,           type: 'drink potion'");
        System.out.println("To exit your inventory,     type: 'exit inventory'");

        String invAction = scan.nextLine();
        String invActionSub = "";

        if (invAction.length() > 4) {
            invActionSub = invAction.substring(0, 5);
        }

        if (invActionSub.equals("equip")) {
            String equipItem = invAction.substring(6);

            //loops through items in inventory list to find the requested item
            for (Item cItem : player.getInventoryList()) {

                //checks if current item is the requested item
                if (cItem.getName().equalsIgnoreCase(equipItem)) {

                    if (cItem instanceof Armor) {
                        System.out.println("got in here");
                        if (null != player.getArmor()) {
                            player.getInventoryList().add(player.getArmor());
                            player.setArmor(null);
                        }
                        player.setArmor((Armor) cItem);
                        System.out.println("You equipped: " + cItem.getName());

                        int indexOfWeapon = player.getInventoryList().indexOf(cItem);

                        player.getInventoryList().remove(indexOfWeapon);
                        break;

                    }
                    if (cItem instanceof Weapon) {

                        if (null != player.getWeapon()) {
                            player.getInventoryList().add(player.getWeapon());
                            player.setWeapon(null);
                        }
                        player.setWeapon((Weapon) cItem);
                        System.out.println("You equipped: " + cItem.getName());

                        int indexOfWeapon = player.getInventoryList().indexOf(cItem);

                        player.getInventoryList().remove(indexOfWeapon);
                        break;
                    }
                    break;
                }

            }

        }

        if (invActionSub.equals("drink") && player.getInventoryList().contains(potion)) {

            //finds index of potion and assigns potion to variable cPotion
            int indexOfPotion = player.getInventoryList().indexOf(potion);
            Potion cPotion = (Potion) player.getInventoryList().get(indexOfPotion);

            //prints healthgain, using calculateHealing to determine how much health you get (to avoid going above max health)
            System.out.println("You heal for " + calculateHealing(cPotion));

            //sets players health to current health + potions heal amount
            player.setHealth(player.getHealth() + calculateHealing(cPotion));

            //removes potion from inventory list
            player.getInventoryList().remove(indexOfPotion);

        }

    }

    public double calculateHealing(Potion cPotion) {

        double res = 0.0;
        
        double missingHP = player.getTotalHealth() - player.getHealth();
        double healAmount = cPotion.getHealAmount();
        
        if (healAmount <= missingHP) {
            return healAmount;
        }
        
        return missingHP;

    }

    public void executeFightingEnvironment() {

        boolean mobAlive = true;

        // loop continues aslong as mob is alive OR untill player flees
        while (mobAlive) {

            //assigns current creautre to variable currentCreature
            Creature currentCreature = player.getCroom().getMonsterList().get(0);

            //prints mobs health
            System.out.println(currentCreature.getName() + " has " + currentCreature.getHealth() + " health");
            System.out.println("------------------");

            //gets monsters hit damage (includes chance for critical hit)
            double monsterHit = calculateCreatureAttack();

            //reduces players health by the amount of monsterHit
            player.setHealth(player.getHealthPreItems()- monsterHit);

            System.out.println(currentCreature.getName() + " hits you for " + monsterHit + " damage!");
            System.out.println("You have " + player.getHealth() + " health");
            System.out.println("------------------");
            System.out.println("Type attack to hit the monster");

            String atkAnswer = scan.nextLine().toLowerCase();

            //player only deals damage if attack is actually written
            if ("attack".equals(atkAnswer)) {

                double playerHit = calculatePlayerAttack();

                //reduces creatures health by players attack
                currentCreature.setHealth(currentCreature.getHealth() - playerHit);

                System.out.println("------------------");
                System.out.println("You hit " + currentCreature.getName() + " for " + playerHit + " damage!");

            }

            //checks if mob is dead, handles it by changing boolean
            if (currentCreature.getHealth() <= 0) {
                mobAlive = false;
                currentCreature.setAlive(false);
            }

            //checks if player is dead, terminates thread if that is the case
            checkForDeath();

        }

        System.out.println("--------------------------------");
        System.out.println("You killed the " + player.getCroom().getMonsterList().get(0).getName() + ", good job!");

    }

    public double calculatePlayerAttack() {

        double res;

        double playerDamage = player.getBaseAttack();

        //rolls to check if attack is critical
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;
        if (chance < player.getCritChance()) {
            res = (player.getCritAmplifier() * playerDamage) / 100;
            return res;
        } else {

            res = player.getBaseAttack();
            return res;

        }

    }

    public double calculateCreatureAttack() {

        double res;

        Creature currentCreature = player.getCroom().getMonsterList().get(0);

        double creatureDamage = currentCreature.getAttackDamage();

        //rolls to check if attack is critical
        int chance = rand.nextInt(100) + 1;
        if (chance < currentCreature.getCritChance()) {
            res = (currentCreature.getCritAmplifier() * currentCreature.getAttackDamage()) / 100;
            return res;
        } else {

            res = currentCreature.getAttackDamage();
            return res;

        }

    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

}
