package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell2level {
    AID(5),
    AUGURY(22),
    BARKSKIN(30),
    BLINDNESS_DEAFNESS(41),
    CALM_EMOTIONS(49),
    CONTINUAL_FLAME(81),
    ENHANCE_ABILITY(130),
    FIND_TRAPS(150),
    FLAMING_SPHERE(159),
    GENTLE_REPOSE(172),
    GUST_OF_WIND(188),
    HOLD_PERSON(202),
    LESSER_RESTORATION(226),
    LOCATE_OBJECT(234),
    MAGIC_WEAPON(244),
    MIRROR_IMAGE(261),
    PASS_WITHOUT_TRACE(277),
    PRAYER_OF_HEALING(292),
    PROTECTION_FROM_POISON(302),
    SCORCHING_RAY(320),
    SHATTER(329),
    SILENCE(334),
    SPIKE_GROWTH(347),
    SPIRITUAL_WEAPON(349),
    SUGGESTION(356),
    WARDING_BOND(396),
    ZONE_OF_TRUTH(410),
;
    private final int id;
    ClericSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
