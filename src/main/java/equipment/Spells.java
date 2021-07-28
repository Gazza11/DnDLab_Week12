package equipment;

public enum Spells {
    FIREBALL(6),
    LIGHTNING(8),
    AXII(2);

    public final int spellPower;

    Spells(int spellPower) {
        this.spellPower = spellPower;
    }
}
