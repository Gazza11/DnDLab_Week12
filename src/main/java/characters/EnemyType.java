package characters;

public enum EnemyType {

    ORC(18, 10, 8),//HP, BA, BR
    TROLL(25, 18, 8),
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
