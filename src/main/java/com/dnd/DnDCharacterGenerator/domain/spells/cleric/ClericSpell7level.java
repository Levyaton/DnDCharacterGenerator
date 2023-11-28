package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell7level {
    CONJURE_CELESTIAL(72),
    DIVINE_WORD(116),
    ETHEREALNESS(136),
    FIRE_STORM(155),
    PLANE_SHIFT(285),
    REGENERATE(310),
    RESURRECTION(314),
    SYMBOL(361),
;
    private final int id;
    ClericSpell7level(int id) { this.id = id; }
    public int getId() { return id; }
}
