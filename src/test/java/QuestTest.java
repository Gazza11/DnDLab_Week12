import characters.*;
import equipment.Armour;
import equipment.Creature;
import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Room room;
    Room room2;
    ArrayList<Room> rooms;
    BaseCharacter wizard;
    BaseCharacter dwarve;
    Enemy enemy;
    Enemy troll;
    ArrayList<Enemy> enemies;
    ArrayList<Enemy> enemies2;
    ArrayList<BaseCharacter> heroes;
    Quest quest;

    @Before
    public void before(){
        wizard = new Wizard("GanDave", Creature.PHOENIX);
        dwarve = new Dwarve("Zoltan", Armour.CHAIN, Weapon.AXE);
        enemy = new Enemy("Lurtz", EnemyType.ORC, Armour.LEATHER, Weapon.CLUB);
        troll = new Enemy("Big Pete", EnemyType.TROLL, Armour.LEATHER, Weapon.CLUB);
        heroes = new ArrayList<>();
        enemies = new ArrayList<>();
        enemies2 = new ArrayList<>();
        enemies2.add(troll);
        enemies.add(enemy);
        heroes.add(wizard);
        heroes.add(dwarve);
        room = new Room(10, enemies);
        room2 = new Room(2, enemies2);
        rooms = new ArrayList<>();
        rooms.add(room);
        rooms.add(room2);
        quest = new Quest("Chonky Boy", 200, rooms, heroes);
    }

    @Test
    public void canMoveRoom__false(){
        assertEquals(false, quest.allowedToMoveRoom());
    }

    @Test
    public void canMoveRoom__True(){
        quest.getCurrentRoom().pickUpGold(heroes.get(0), 10);
        assertEquals(10, wizard.getGold());
        heroes.get(0).attack(quest.getCurrentRoom().getEnemies().get(0));
        quest.getCurrentRoom().removeDeadEnemy();
        assertEquals(true, quest.allowedToMoveRoom());
    }

    @Test
    public void canCompleteQuest(){
        quest.getCurrentRoom().pickUpGold(heroes.get(0), 10);
        assertEquals(10, wizard.getGold());
        quest.moveToNextRoom();
        assertEquals(0, room.getGold());
        heroes.get(0).attack(quest.getCurrentRoom().getEnemies().get(0));
        quest.getCurrentRoom().removeDeadEnemy();
        quest.moveToNextRoom();
        quest.getCurrentRoom().pickUpGold(heroes.get(0), 2);
        heroes.get(0).attack(troll);
        quest.getCurrentRoom().removeDeadEnemy();
        quest.moveToNextRoom();
        assertEquals(true, quest.isQuestCompleted());
    }
}
