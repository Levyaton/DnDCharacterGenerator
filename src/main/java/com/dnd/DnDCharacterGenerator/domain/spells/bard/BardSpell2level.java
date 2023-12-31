package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell2level {
    ANIMAL_MESSENGER(9),
    BLINDNESS_DEAFNESS(41),
    CALM_EMOTIONS(49),
    CLOUD_OF_DAGGERS(59),
    CROWN_OF_MADNESS(93),
    DETECT_THOUGHTS(107),
    ENHANCE_ABILITY(130),
    ENTHRALL(134),
    HEAT_METAL(196),
    HOLD_PERSON(202),
    INVISIBILITY(220),
    KNOCK(222),
    LESSER_RESTORATION(226),
    LOCATE_ANIMALS_OR_PLANTS(232),
    LOCATE_OBJECT(234),
    MAGIC_MOUTH(242),
    PHANTASMAL_FORCE(280),
    PYROTECHNICS(304),
    SEE_INVISIBILITY(323),
    SHATTER(329),
    SILENCE(334),
    SKYWRITE(337),
    SUGGESTION(356),
    WARDING_WIND(397),
    ZONE_OF_TRUTH(410),
;
    private final int id;
    BardSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
