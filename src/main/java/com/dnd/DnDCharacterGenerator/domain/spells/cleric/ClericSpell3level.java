package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell3level {
    ANIMATE_DEAD(11),
    BEACON_OF_HOPE(31),
    BESTOW_CURSE(34),
    BLINK(42),
    CALL_LIGHTNING(48),
    CLAIRVOYANCE(57),
    CREATE_FOOD_AND_WATER(89),
    CRUSADER_S_MANTLE(94),
    DAYLIGHT(99),
    DISPEL_MAGIC(112),
    FEIGN_DEATH(146),
    FIREBALL(152),
    GLYPH_OF_WARDING(176),
    MAGIC_CIRCLE(239),
    MASS_HEALING_WORD(248),
    MELD_INTO_STONE(252),
    NONDETECTION(272),
    PLANT_GROWTH(286),
    PROTECTION_FROM_ENERGY(300),
    REMOVE_CURSE(312),
    REVIVIFY(316),
    SENDING(325),
    SLEET_STORM(339),
    SPEAK_WITH_DEAD(344),
    SPIRIT_GUARDIANS(348),
    TONGUES(375),
    WATER_WALK(399),
    WIND_WALL(405),
;
    private final int id;
    ClericSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
