package equipment;

public enum Creature {

    WYVERN(20),
    PHOENIX(16),
    TOAD(1),
    ROACH(20);

    public final int defenceValue;

    Creature(int defenceValue) {
        this.defenceValue = defenceValue;
    }
}
