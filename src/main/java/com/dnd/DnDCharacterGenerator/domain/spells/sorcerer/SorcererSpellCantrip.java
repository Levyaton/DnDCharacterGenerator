package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpellCantrip {
    ACID_SPLASH(3),
    BLADE_WARD(37),
    BOOMING_BLADE(45),
    CHILL_TOUCH(53),
    CONTROL_FLAMES(82),
    CREATE_BONFIRE(88),
    DANCING_LIGHTS(96),
    FIRE_BOLT(153),
    FRIENDS(167),
    FROSTBITE(168),
    GREEN_FLAME_BLADE(182),
    GUST(187),
    LIGHT(228),
    LIGHTNING_LURE(231),
    MAGE_HAND(238),
    MENDING(255),
    MESSAGE(256),
    MINOR_ILLUSION(259),
    MOLD_EARTH(265),
    POISON_SPRAY(287),
    PRESTIDIGITATION(293),
    RAY_OF_FROST(308),
    SHAPE_WATER(327),
    SHOCKING_GRASP(333),
    SWORD_BURST(360),
    THUNDERCLAP(371),
    TRUE_STRIKE(383),
;
    private final int id;
    SorcererSpellCantrip(int id) { this.id = id; }
    public int getId() { return id; }
}
