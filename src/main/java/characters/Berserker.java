package characters;

import equipment.Armour;
import equipment.Weapon;

public class Berserker extends BaseCharacter{

    private Weapon weapon;


    public Berserker(String name, Weapon weapon) {
        super(name, 10, 12, 4);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public int getAttack(){
        return getBaseAttack() + weapon.attackModifier;
    }

    public void specialAbility(){
        setBaseAttack(getBaseAttack() * 20);
        setBaseResistance(getBaseResistance() - 6);
    }


}
