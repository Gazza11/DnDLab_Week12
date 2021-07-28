import characters.Dwarve;
import equipment.Armour;
import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarveTest {

    Dwarve dwarve;
    Dwarve dwarve2;

    @Before
    public void before(){
        dwarve = new Dwarve("Zoltan", Armour.CHAIN, Weapon.AXE);
        dwarve2 = new Dwarve("Zoltan", Armour.CHAIN, Weapon.AXE);

    }

    @Test
    public void hasName(){
        assertEquals("Zoltan", dwarve.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(12, dwarve.getHP());
    }

    @Test
    public void hasBaseAttack(){
        assertEquals(6, dwarve.getBaseAttack());
    }

    @Test
    public void hasBaseResistance(){
        assertEquals(4, dwarve.getBaseResistance());
    }

    @Test
    public void hasTakeDamage(){
        dwarve.receiveDamage(10);
        assertEquals(11, dwarve.getHP());
    }

    @Test
    public void canResistDamage(){
        dwarve.receiveDamage(7);
        assertEquals(12, dwarve.getHP());
    }

    @Test
    public void canAttack(){
        dwarve.attack(dwarve2);
        assertEquals(10, dwarve2.getHP());
    }

    @Test
    public void startsWithNoGold(){
        assertEquals(0, dwarve2.getGold());
    }

    @Test
    public void canAddGold(){
        dwarve.addGold(8);
        assertEquals(8, dwarve.getGold());
    }

    @Test
    public void hasSpecialAbility(){ //Will eventually have cooldown and end.
        dwarve.specialAbility();
        assertEquals(8, dwarve.getBaseAttack());
        assertEquals(6, dwarve.getBaseResistance());
    }

    @Test
    public void canChangeArmour(){
        dwarve.changeArmour(Armour.LEATHER);
        assertEquals(Armour.LEATHER, dwarve.getArmour());
        assertEquals(7, dwarve.getResistance());
    }

    @Test
    public void canChangeWeapon(){
        dwarve.changeWeapon(Weapon.CLUB);
        assertEquals(Weapon.CLUB, dwarve.getWeapon());
        assertEquals(8, dwarve.getAttack());
    }

}
