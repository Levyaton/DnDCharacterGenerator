package com.dnd.DnDCharacterGenerator.domain.spells.ritual;

public enum RitualCasterSpell6level {
    DRAWMIJ_S_INSTANT_SUMMONS(118),
    FORBIDDANCE(163),
;
    private final int id;
    RitualCasterSpell6level(int id) { this.id = id; }
    public int getId() { return id; }
}
