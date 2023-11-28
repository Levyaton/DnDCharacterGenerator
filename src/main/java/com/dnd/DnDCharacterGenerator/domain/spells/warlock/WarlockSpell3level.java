package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell3level {
    BLINK(42),
    CLAIRVOYANCE(57),
    COUNTERSPELL(87),
    DISPEL_MAGIC(112),
    FEAR(143),
    FIREBALL(152),
    FLY(161),
    GASEOUS_FORM(169),
    HUNGER_OF_HADAR(204),
    HYPNOTIC_PATTERN(206),
    MAGIC_CIRCLE(239),
    MAJOR_IMAGE(245),
    PLANT_GROWTH(286),
    REMOVE_CURSE(312),
    SENDING(325),
    STINKING_CLOUD(351),
    TONGUES(375),
    VAMPIRIC_TOUCH(386),
;
    private final int id;
    WarlockSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
