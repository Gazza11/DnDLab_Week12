import characters.Cleric;
import characters.Dwarve;
import equipment.Armour;
import equipment.HealingItems;
import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Dwarve dwarve;

    @Before
    public void before(){
        cleric = new Cleric("Stevie", Armour.LEATHER);
        dwarve = new Dwarve("Zoltan", Armour.CHAIN, Weapon.AXE);
    }

    @Test
    public void healsAlly(){
        assertEquals(12, dwarve.getHP());
        cleric.useHealingItem(dwarve, HealingItems.POTION);
        assertEquals(22, dwarve.getHP());
        assertEquals(2, cleric.getHealingBag().size());
    }

    @Test
    public void canAddHealingItem(){
        cleric.addHealingItem(HealingItems.HERBS);
        assertEquals(4, cleric.getHealingBag().size());
    }


}
