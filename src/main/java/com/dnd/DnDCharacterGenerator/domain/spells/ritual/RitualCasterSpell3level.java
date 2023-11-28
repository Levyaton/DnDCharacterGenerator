package com.dnd.DnDCharacterGenerator.domain.spells.ritual;

public enum RitualCasterSpell3level {
    FEIGN_DEATH(146),
    LEOMUND_S_TINY_HUT(225),
    MELD_INTO_STONE(252),
    PHANTOM_STEED(282),
    WATER_BREATHING(398),
    WATER_WALK(399),
;
    private final int id;
    RitualCasterSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
