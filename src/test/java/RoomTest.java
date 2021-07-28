import characters.*;
import equipment.Armour;
import equipment.Creature;
import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    BaseCharacter wizard;
    BaseCharacter dwarve;
    Enemy enemy;
    ArrayList<Enemy> enemies;
    ArrayList<BaseCharacter> heroes;


    @Before
    public void before(){
        wizard = new Wizard("GanDave", Creature.PHOENIX);
        dwarve = new Dwarve("Zoltan", Armour.CHAIN, Weapon.AXE);
        enemy = new Enemy("Lurtz", EnemyType.ORC, Armour.LEATHER, Weapon.CLUB);
        heroes = new ArrayList<>();
        enemies = new ArrayList<>();
        enemies.add(enemy);
        heroes.add(wizard);
        heroes.add(dwarve);
        room = new Room(10, enemies, heroes);
    }

    @Test
    public void canHeroAttackEnemy(){
        heroes.get(0).attack(enemies.get(0));
        assertEquals(5, enemies.get(0).getHP());
    }

    @Test
    public void canHeroKillEnemy(){
        assertEquals(1, room.getEnemiesAmount());
        heroes.get(0).attack(enemies.get(0));
        heroes.get(0).attack(enemies.get(0));
        room.removeDeadEnemy();
        assertEquals(0, room.getEnemiesAmount());
    }

    @Test
    public void canCollectGold(){
        room.pickUpGold(heroes.get(0), 10);
        assertEquals(10, heroes.get(0).getGold());
        assertEquals(0, room.getGold());
    }

    @Test
    public void canCompleteRoom(){
        assertEquals(false, room.getRoomCompleted());
        heroes.get(0).attack(enemies.get(0));
        heroes.get(0).attack(enemies.get(0));
        room.removeDeadEnemy();
        assertEquals(false, room.getRoomCompleted());
        room.pickUpGold(heroes.get(0), 10);
        assertEquals(true, room.getRoomCompleted());
    }


}
