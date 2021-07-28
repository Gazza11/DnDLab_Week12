public class BaseCharacter {

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

    public void receiveDamage(int damage) {
        this.HP -= (damage - baseResistance);
    }

    public void attack(BaseCharacter enemy) {
        enemy.receiveDamage(getBaseAttack());
    }

    public int getGold(){
        return this.gold;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }
}
