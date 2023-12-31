package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell3level {
    BESTOW_CURSE(34),
    CLAIRVOYANCE(57),
    DISPEL_MAGIC(112),
    FEAR(143),
    FEIGN_DEATH(146),
    GLYPH_OF_WARDING(176),
    HYPNOTIC_PATTERN(206),
    LEOMUND_S_TINY_HUT(225),
    MAJOR_IMAGE(245),
    NONDETECTION(272),
    PLANT_GROWTH(286),
    SENDING(325),
    SPEAK_WITH_DEAD(344),
    SPEAK_WITH_PLANTS(345),
    STINKING_CLOUD(351),
    TONGUES(375),
;
    private final int id;
    BardSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
