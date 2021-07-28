import characters.BaseCharacter;
import rooms.Room;

import java.util.ArrayList;

public class Quest {

    private String name;
    private int gold;
    private Room currentRoom;
    private ArrayList<Room> rooms;
    private ArrayList<BaseCharacter> heroes;
    private boolean questCompleted;

    public Quest(String name, int gold, ArrayList<Room> rooms, ArrayList<BaseCharacter> heroes) {
        this.name = name;
        this.gold = gold;
        this.currentRoom = rooms.get(0);
        this.rooms = rooms;
        this.heroes = heroes;
        this.questCompleted = false;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public boolean isQuestCompleted() {
        return questCompleted;
    }

    public void setQuestCompleted() {
        this.questCompleted = true;
    }

    public void moveToNextRoom() {
        if(allowedToMoveRoom()){
            int roomNumber = rooms.indexOf(currentRoom);
            if(roomNumber == rooms.size()-1){
                setQuestCompleted();
            } else {
                currentRoom = rooms.get(roomNumber += 1);
            }
        }
    }

    public boolean allowedToMoveRoom(){
        if(currentRoom.getRoomCompleted() == true){
            return true;
        }
        return false;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<BaseCharacter> getHeroes() {
        return heroes;
    }

}
