import characters.Berserker;
import characters.Enemy;
import characters.EnemyType;
import equipment.Armour;
import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BerserkerTest {

    Berserker berserker;
    Enemy chonkyBoy;

    @Before
    public void before(){
        chonkyBoy = new Enemy("Chonkers", EnemyType.BOSS, Armour.LEATHER,Weapon.CLUB);
        berserker = new Berserker("Conan", Weapon.GREATSWORD);
    }

    @Test
    public void canKillBigBoy(){
        berserker.specialAbility();
        berserker.attack(chonkyBoy);
        assertEquals(0, chonkyBoy.getHP());
    }
}
