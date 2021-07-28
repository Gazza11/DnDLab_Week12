package equipment;

public enum Spells {
    FIREBALL(10),
    LIGHTNING(12),
    AXII(4);

    public final int spellPower;

    Spells(int spellPower) {
        this.spellPower = spellPower;
    }
}
