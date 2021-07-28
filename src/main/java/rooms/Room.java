package rooms;

import characters.BaseCharacter;
import characters.Enemy;

import java.util.ArrayList;

public class Room {

    private int gold;
    private ArrayList<Enemy> enemies;
    private ArrayList<BaseCharacter> heroes;
    private boolean roomCompleted;

    public Room(int gold, ArrayList<Enemy> enemies, ArrayList<BaseCharacter> heroes) {
        this.gold = gold;
        this.enemies = enemies;
        this.heroes = heroes;
        this.roomCompleted = false;
    }

    public int getEnemiesAmount(){
        return enemies.size();
    }

    public boolean getRoomCompleted(){
        return roomCompleted;
    }

    public void hasBeenCompleted(){
        if(enemies.size() == 0 && gold == 0){
            roomCompleted = true;
        }
    }

    public void pickUpGold(BaseCharacter hero, int amountGold){
        hero.addGold(amountGold);
        this.gold -= amountGold;
        if(this.gold == 0){
            hasBeenCompleted();
        }
    }

    public void removeDeadEnemy(){
        if(enemies.get(0).getHP() <= 0){
            enemies.remove(0);
            if(enemies.size() == 0){
                hasBeenCompleted();
            }
        }
    }


    public int getGold() {
        return gold;
    }
}
