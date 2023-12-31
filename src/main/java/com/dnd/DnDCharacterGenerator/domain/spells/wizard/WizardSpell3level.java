package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell3level {
    ANIMATE_DEAD(11),
    BESTOW_CURSE(34),
    BLINK(42),
    CLAIRVOYANCE(57),
    COUNTERSPELL(87),
    DISPEL_MAGIC(112),
    ERUPTING_EARTH(135),
    FEAR(143),
    FEIGN_DEATH(146),
    FIREBALL(152),
    FLAME_ARROWS(156),
    FLY(161),
    GASEOUS_FORM(169),
    GLYPH_OF_WARDING(176),
    HASTE(193),
    HYPNOTIC_PATTERN(206),
    LEOMUND_S_TINY_HUT(225),
    LIGHTNING_BOLT(230),
    MAGIC_CIRCLE(239),
    MAJOR_IMAGE(245),
    MELF_S_MINUTE_METEORS(254),
    NONDETECTION(272),
    PHANTOM_STEED(282),
    PROTECTION_FROM_ENERGY(300),
    REMOVE_CURSE(312),
    SENDING(325),
    SLEET_STORM(339),
    SLOW(340),
    STINKING_CLOUD(351),
    TIDAL_WAVE(373),
    TONGUES(375),
    VAMPIRIC_TOUCH(386),
    WALL_OF_SAND(392),
    WALL_OF_WATER(395),
    WATER_BREATHING(398),
;
    private final int id;
    WizardSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
