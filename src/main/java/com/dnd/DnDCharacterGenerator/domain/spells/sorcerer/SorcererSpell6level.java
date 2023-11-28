package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell6level {
    ARCANE_GATE(17),
    CHAIN_LIGHTNING(51),
    CIRCLE_OF_DEATH(55),
    DISINTEGRATE(110),
    EYEBITE(139),
    GLOBE_OF_INVULNERABILITY(175),
    INVESTITURE_OF_FLAME(216),
    INVESTITURE_OF_ICE(217),
    INVESTITURE_OF_STONE(218),
    INVESTITURE_OF_WIND(219),
    MASS_SUGGESTION(249),
    MOVE_EARTH(271),
    PERMANENT_IMAGE(279),
    SUNBEAM(357),
    TRUE_SEEING(382),
;
    private final int id;
    SorcererSpell6level(int id) { this.id = id; }
    public int getId() { return id; }
}
