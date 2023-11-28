package com.dnd.DnDCharacterGenerator.domain.spells.ritual;

public enum RitualCasterSpell5level {
    COMMUNE(63),
    COMMUNE_WITH_NATURE(64),
    CONTACT_OTHER_PLANE(78),
    RARY_S_TELEPATHIC_BOND(306),
;
    private final int id;
    RitualCasterSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
