package characters;

import equipment.Creature;
import equipment.Spells;

public class Wizard extends BaseCharacter{

    private Creature creature;
    private Spells activeSpell;

    public Wizard(String name, Creature creature) {
        super(name, 7, 2, 1);
        this.creature = creature;
        this.activeSpell = Spells.LIGHTNING;
    }

    public Creature getCreature(){
        return creature;
    }

    public int getResistance(){
        return getCreature().defenceValue;
    }

    public Spells getActiveSpell(){
        return activeSpell;
    }

    public void changeSpell(Spells spell){
        this.activeSpell = spell;
    }

    public void attack(BaseCharacter enemy){
        enemy.receiveDamage(activeSpell.spellPower);
    }


}
