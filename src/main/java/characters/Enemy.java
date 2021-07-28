package characters;

import equipment.Armour;
import equipment.Weapon;

public class Enemy extends BaseCharacter{

    private EnemyType enemyType;
    private Armour armour;
    private Weapon weapon;

    public Enemy(String name, EnemyType enemyType, Armour armour, Weapon weapon) {
        super(name, enemyType.hP, enemyType.baseAttack, enemyType.baseResistance);
        this.enemyType = enemyType;
        this.armour = armour;
        this.weapon = weapon;
    }

    public int getAttack(){
        return getBaseAttack() + weapon.attackModifier;
    }

    public int getResistance(){
        return getBaseResistance() + armour.resistanceModifier;
    }
}
