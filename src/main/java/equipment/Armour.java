package equipment;

public enum Armour {
    LEATHER(3),
    CHAIN(5),
    PLATE(8);

    public final int resistanceModifier;

    Armour(int resistanceModifier) {
        this.resistanceModifier = resistanceModifier;
    }
}
