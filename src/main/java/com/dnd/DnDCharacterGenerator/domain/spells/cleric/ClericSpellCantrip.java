package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpellCantrip {
    GUIDANCE(185),
    LIGHT(228),
    MENDING(255),
    RESISTANCE(313),
    SACRED_FLAME(318),
    SPARE_THE_DYING(342),
    THAUMATURGY(368),
;
    private final int id;
    ClericSpellCantrip(int id) { this.id = id; }
    public int getId() { return id; }
}
