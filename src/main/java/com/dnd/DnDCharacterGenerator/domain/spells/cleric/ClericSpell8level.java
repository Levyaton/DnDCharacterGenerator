package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell8level {
    ANTIMAGIC_FIELD(14),
    CONTROL_WEATHER(84),
    EARTHQUAKE(126),
    HOLY_AURA(203),
;
    private final int id;
    ClericSpell8level(int id) { this.id = id; }
    public int getId() { return id; }
}
