package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell2level {
    BLINDNESS_DEAFNESS(41),
    CALM_EMOTIONS(49),
    CLOUD_OF_DAGGERS(59),
    CROWN_OF_MADNESS(93),
    DARKNESS(97),
    DETECT_THOUGHTS(107),
    EARTHBIND(125),
    ENTHRALL(134),
    HOLD_PERSON(202),
    INVISIBILITY(220),
    MIRROR_IMAGE(261),
    MISTY_STEP(263),
    PHANTASMAL_FORCE(280),
    RAY_OF_ENFEEBLEMENT(307),
    SCORCHING_RAY(320),
    SHATTER(329),
    SPIDER_CLIMB(346),
    SUGGESTION(356),
;
    private final int id;
    WarlockSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
