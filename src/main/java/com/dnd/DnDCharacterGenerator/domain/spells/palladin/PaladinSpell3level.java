package com.dnd.DnDCharacterGenerator.domain.spells.palladin;

public enum PaladinSpell3level {
    AURA_OF_VITALITY(25),
    BEACON_OF_HOPE(31),
    BLINDING_SMITE(40),
    CREATE_FOOD_AND_WATER(89),
    CRUSADER_S_MANTLE(94),
    DAYLIGHT(99),
    DISPEL_MAGIC(112),
    ELEMENTAL_WEAPON(129),
    HASTE(193),
    MAGIC_CIRCLE(239),
    PLANT_GROWTH(286),
    PROTECTION_FROM_ENERGY(300),
    REMOVE_CURSE(312),
    REVIVIFY(316),
;
    private final int id;
    PaladinSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
