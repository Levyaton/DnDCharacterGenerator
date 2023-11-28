package com.dnd.DnDCharacterGenerator.domain.spells.palladin;

public enum PaladinSpell1level {
    BANE(27),
    BLESS(38),
    COMMAND(62),
    COMPELLED_DUEL(65),
    CURE_WOUNDS(95),
    DETECT_EVIL_AND_GOOD(104),
    DETECT_MAGIC(105),
    DETECT_POISON_AND_DISEASE(106),
    DIVINE_FAVOR(115),
    ENSNARING_STRIKE(132),
    HEROISM(199),
    HUNTER_S_MARK(205),
    PROTECTION_FROM_EVIL_AND_GOOD(301),
    PURIFY_FOOD_AND_DRINK(303),
    SANCTUARY(319),
    SEARING_SMITE(322),
    SHIELD_OF_FAITH(331),
    SPEAK_WITH_ANIMALS(343),
    THUNDEROUS_SMITE(370),
    WRATHFUL_SMITE(409),
;
    private final int id;
    PaladinSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
