package characters;

public class BaseCharacter implements IAttack{

    private String name;
    private int HP;
    private int baseAttack;
    private int baseResistance;
    private int gold;
    private int maxHP;
    private boolean dead;

    public BaseCharacter(String name, int HP, int baseAttack, int baseResistance) {
        this.name = name;
        this.maxHP = HP;
        this.HP = HP;
        this.baseAttack = baseAttack;
        this.baseResistance = baseResistance;
        this.gold = 0;
        this.dead = false;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getMaxHP(){
        return this.maxHP;
    }

    public void healed(int heal){
        if(HP + heal > maxHP){
            HP = maxHP;
        }else{
            this.HP += heal;
        }
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int attack){
        this.baseAttack = attack;
    }

    public int getBaseResistance() {
        return baseResistance;
    }

    public void setBaseResistance(int resistance){
        this.baseResistance = resistance;
    }

    public int getResistance(){
        return getBaseResistance();
    }


    public void receiveDamage(int damage) {
        if (damage >= getResistance()) {
            this.HP -= (damage - getResistance());
            if(HP <= 0){
                dead = true;
                HP = 0;
            }
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

    public boolean getDead(){
        return this.dead;
    }

    public void setDead(){
        this.dead = false;
    }

    public void specialAbility(){

    }

}
