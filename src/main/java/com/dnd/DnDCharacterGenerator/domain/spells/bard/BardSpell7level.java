package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell7level {
    ETHEREALNESS(136),
    FORCECAGE(164),
    MIRAGE_ARCANE(260),
    MORDENKAINEN_S_MAGNIFICENT_MANSION(268),
    MORDENKAINEN_S_SWORD(270),
    PROJECT_IMAGE(299),
    REGENERATE(310),
    RESURRECTION(314),
    SYMBOL(361),
    TELEPORT(365),
;
    private final int id;
    BardSpell7level(int id) { this.id = id; }
    public int getId() { return id; }
}
