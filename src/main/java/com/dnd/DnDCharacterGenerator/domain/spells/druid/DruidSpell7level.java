package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell7level {
    FIRE_STORM(155),
    MIRAGE_ARCANE(260),
    REGENERATE(310),
    REVERSE_GRAVITY(315),
    WHIRLWIND(403),
;
    private final int id;
    DruidSpell7level(int id) { this.id = id; }
    public int getId() { return id; }
}
