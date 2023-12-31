package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell6level {
    ARCANE_GATE(17),
    CHAIN_LIGHTNING(51),
    CIRCLE_OF_DEATH(55),
    CONTINGENCY(80),
    CREATE_UNDEAD(91),
    DISINTEGRATE(110),
    DRAWMIJ_S_INSTANT_SUMMONS(118),
    EYEBITE(139),
    FLESH_TO_STONE(160),
    GLOBE_OF_INVULNERABILITY(175),
    GUARDS_AND_WARDS(184),
    INVESTITURE_OF_FLAME(216),
    INVESTITURE_OF_ICE(217),
    INVESTITURE_OF_STONE(218),
    INVESTITURE_OF_WIND(219),
    MAGIC_JAR(240),
    MASS_SUGGESTION(249),
    MOVE_EARTH(271),
    OTILUKE_S_FREEZING_SPHERE(274),
    OTTO_S_IRRESISTIBLE_DANCE(276),
    PERMANENT_IMAGE(279),
    PROGRAMMED_ILLUSION(298),
    SUNBEAM(357),
    TRUE_SEEING(382),
    WALL_OF_ICE(391),
;
    private final int id;
    WizardSpell6level(int id) { this.id = id; }
    public int getId() { return id; }
}
