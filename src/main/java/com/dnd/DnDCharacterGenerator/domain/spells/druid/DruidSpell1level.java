package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell1level {
    ABSORB_ELEMENTS(2),
    ANIMAL_FRIENDSHIP(8),
    BEAST_BOND(32),
    CHARM_PERSON(52),
    CREATE_OR_DESTROY_WATER(90),
    CURE_WOUNDS(95),
    DETECT_MAGIC(105),
    DETECT_POISON_AND_DISEASE(106),
    EARTH_TREMOR(124),
    ENTANGLE(133),
    FAERIE_FIRE(141),
    FOG_CLOUD(162),
    GOODBERRY(177),
    HEALING_WORD(195),
    ICE_KNIFE(207),
    JUMP(221),
    LONGSTRIDER(235),
    PURIFY_FOOD_AND_DRINK(303),
    SPEAK_WITH_ANIMALS(343),
    THUNDERWAVE(372),
;
    private final int id;
    DruidSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
