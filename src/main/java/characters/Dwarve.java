package characters;

import equipment.Armour;
import equipment.Weapon;

public class Dwarve extends BaseCharacter {

    private Armour armour;
    private Weapon weapon;

    public Dwarve(String name, Armour armour, Weapon weapon) {
        super(name, 12, 6, 4);
        this.armour = armour;
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void changeArmour(Armour armour){
        this.armour = armour;
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int getAttack(){
        return getBaseAttack() + weapon.attackModifier;
    }

    public int getResistance(){
        return getBaseResistance() + armour.resistanceModifier;
    }

    public void specialAbility(){
        setBaseAttack(8);
        setBaseResistance(6);
    }


}
