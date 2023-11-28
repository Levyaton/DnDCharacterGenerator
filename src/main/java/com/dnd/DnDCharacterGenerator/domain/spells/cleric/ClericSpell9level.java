package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell9level {
    ASTRAL_PROJECTION(21),
    GATE(170),
    MASS_HEAL(247),
    TRUE_RESURRECTION(381),
;
    private final int id;
    ClericSpell9level(int id) { this.id = id; }
    public int getId() { return id; }
}
