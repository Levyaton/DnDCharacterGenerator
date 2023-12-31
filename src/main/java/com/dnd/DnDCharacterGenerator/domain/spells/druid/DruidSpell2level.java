package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell2level {
    ANIMAL_MESSENGER(9),
    BARKSKIN(30),
    BEAST_SENSE(33),
    BLUR(43),
    DARKNESS(97),
    DARKVISION(98),
    DUST_DEVIL(123),
    EARTHBIND(125),
    ENHANCE_ABILITY(130),
    FIND_TRAPS(150),
    FLAME_BLADE(157),
    FLAMING_SPHERE(159),
    GUST_OF_WIND(188),
    HEAT_METAL(196),
    HOLD_PERSON(202),
    INVISIBILITY(220),
    LESSER_RESTORATION(226),
    LOCATE_ANIMALS_OR_PLANTS(232),
    LOCATE_OBJECT(234),
    MELF_S_ACID_ARROW(253),
    MIRROR_IMAGE(261),
    MISTY_STEP(263),
    MOONBEAM(266),
    PASS_WITHOUT_TRACE(277),
    PROTECTION_FROM_POISON(302),
    SILENCE(334),
    SKYWRITE(337),
    SPIDER_CLIMB(346),
    SPIKE_GROWTH(347),
    WARDING_WIND(397),
    WEB(401),
;
    private final int id;
    DruidSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
