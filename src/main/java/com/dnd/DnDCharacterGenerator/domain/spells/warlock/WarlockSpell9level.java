package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell9level {
    ASTRAL_PROJECTION(21),
    FORESIGHT(165),
    IMPRISONMENT(212),
    POWER_WORD_KILL(290),
    TRUE_POLYMORPH(380),
;
    private final int id;
    WarlockSpell9level(int id) { this.id = id; }
    public int getId() { return id; }
}
