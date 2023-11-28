package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell6level {
    EYEBITE(139),
    FIND_THE_PATH(149),
    GUARDS_AND_WARDS(184),
    MASS_SUGGESTION(249),
    OTTO_S_IRRESISTIBLE_DANCE(276),
    PERMANENT_IMAGE(279),
    PROGRAMMED_ILLUSION(298),
    TRUE_SEEING(382),
;
    private final int id;
    BardSpell6level(int id) { this.id = id; }
    public int getId() { return id; }
}
