package characters;

import equipment.Armour;
import equipment.HealingItems;

import java.util.ArrayList;
import java.util.Arrays;

public class Cleric extends BaseCharacter{

    private ArrayList<HealingItems> healingBag;
    private Armour armour;

    public Cleric(String name, Armour armour) {
        super(name, 4, 1, 3);
        this.healingBag = new ArrayList<>(Arrays.asList(HealingItems.POTION, HealingItems.POTION, HealingItems.HERBS));
        this.armour = armour;
    }

    public Armour getArmour() {
        return armour;
    }

    public void changeArmour(Armour armour){
        this.armour = armour;
    }

    public ArrayList<HealingItems> getHealingBag() {
        return healingBag;
    }

    public void useHealingItem(BaseCharacter ally, HealingItems item){
        ally.healed(item.healingFactor);
        healingBag.remove(item);
    }

    public void addHealingItem(HealingItems item){
        this.healingBag.add(item);
    }


}
