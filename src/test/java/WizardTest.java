import characters.Dwarve;
import characters.Wizard;
import equipment.Armour;
import equipment.Creature;
import equipment.Spells;
import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Dwarve dwarve;

    @Before
    public void before(){
        wizard = new Wizard("GanDave", Creature.PHOENIX);
        dwarve = new Dwarve("Zoltan", Armour.CHAIN, Weapon.AXE);
    }

    @Test
    public void hasName(){
        assertEquals("GanDave", wizard.getName());
    }

    @Test
    public void hasCreature(){
        assertEquals(Creature.PHOENIX, wizard.getCreature());
    }

    @Test
    public void creatureHasResistance(){
        assertEquals(16, wizard.getResistance());
    }

    @Test
    public void canWizardBeAttack(){
        wizard.receiveDamage(17);
        assertEquals(6, wizard.getHP());
    }

    @Test
    public void canAttack(){
        wizard.attack(dwarve);
        assertEquals(9, dwarve.getHP());
    }

    @Test
    public void canChangeSpell(){
        wizard.changeSpell(Spells.FIREBALL);
        wizard.attack(dwarve);
        assertEquals(11, dwarve.getHP());
    }
}
