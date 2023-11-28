package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell6level {
    ARCANE_GATE(17),
    CIRCLE_OF_DEATH(55),
    CONJURE_FEY(74),
    CREATE_UNDEAD(91),
    EYEBITE(139),
    FLESH_TO_STONE(160),
    INVESTITURE_OF_FLAME(216),
    INVESTITURE_OF_ICE(217),
    INVESTITURE_OF_STONE(218),
    INVESTITURE_OF_WIND(219),
    MASS_SUGGESTION(249),
    PERMANENT_IMAGE(279),
    TRUE_SEEING(382),
;
    private final int id;
    WarlockSpell6level(int id) { this.id = id; }
    public int getId() { return id; }
}
