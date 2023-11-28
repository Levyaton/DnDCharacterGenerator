package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell9level {
    FORESIGHT(165),
    POWER_WORD_HEAL(289),
    POWER_WORD_KILL(290),
    TRUE_POLYMORPH(380),
;
    private final int id;
    BardSpell9level(int id) { this.id = id; }
    public int getId() { return id; }
}
