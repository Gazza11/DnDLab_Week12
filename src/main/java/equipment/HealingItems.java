package equipment;

public enum HealingItems {

    POTION(10),
    HERBS(3);

    public final int healingFactor;


    HealingItems(int healingFactor) {
        this.healingFactor = healingFactor;
    }
}
