package characters;

public enum EnemyType {

    ORC(12, 10, 2),//HP, BA, BR
    TROLL(25, 18, 8),
    BOSS(2200, 200, 0),
    GOBLIN(9, 5, 3);

    public final int hP;
    public final int baseAttack;
    public final int baseResistance;

    EnemyType(int hP, int baseAttack, int baseResistance) {
        this.hP = hP;
        this.baseAttack = baseAttack;
        this.baseResistance = baseResistance;
    }
}
