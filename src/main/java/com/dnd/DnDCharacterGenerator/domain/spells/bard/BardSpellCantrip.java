package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpellCantrip {
    BLADE_WARD(37),
    DANCING_LIGHTS(96),
    FRIENDS(167),
    LIGHT(228),
    MAGE_HAND(238),
    MENDING(255),
    MESSAGE(256),
    MINOR_ILLUSION(259),
    PRESTIDIGITATION(293),
    THUNDERCLAP(371),
    TRUE_STRIKE(383),
    VICIOUS_MOCKERY(387),
;
    private final int id;
    BardSpellCantrip(int id) { this.id = id; }
    public int getId() { return id; }
}
