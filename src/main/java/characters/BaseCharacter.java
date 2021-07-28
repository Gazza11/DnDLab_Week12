package characters;

public class BaseCharacter implements IAttack{

    private String name;
    private int HP;
    private int baseAttack;
    private int baseResistance;
    private int gold;

    public BaseCharacter(String name, int HP, int baseAttack, int baseResistance) {
        this.name = name;
        this.HP = HP;
        this.baseAttack = baseAttack;
        this.baseResistance = baseResistance;
        this.gold = 0;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseResistance() {
        return baseResistance;
    }

    public int getResistance(){
        return getBaseResistance();
    }

    public void receiveDamage(int damage) {
        if (damage >= getResistance()) {
            this.HP -= (damage - getResistance());
        }

    }

    public int getAttack(){
        return getBaseAttack();
    }

    public void attack(BaseCharacter enemy) {
        enemy.receiveDamage(getAttack());
    }

    public int getGold(){
        return this.gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }
}
