package equipment;

public enum Weapon {
    SWORD(3),
    AXE(5),
    CLUB(2);

    public final int attackModifier;

    Weapon(int attackModifier) {
        this.attackModifier = attackModifier;
    }
}
