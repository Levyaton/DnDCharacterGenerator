package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell1level {
    ANIMAL_FRIENDSHIP(8),
    BANE(27),
    BLESS(38),
    BURNING_HANDS(47),
    CHARM_PERSON(52),
    COMMAND(62),
    CREATE_OR_DESTROY_WATER(90),
    CURE_WOUNDS(95),
    DETECT_EVIL_AND_GOOD(104),
    DETECT_MAGIC(105),
    DETECT_POISON_AND_DISEASE(106),
    DISGUISE_SELF(109),
    DIVINE_FAVOR(115),
    FAERIE_FIRE(141),
    FOG_CLOUD(162),
    GUIDING_BOLT(186),
    HEALING_WORD(195),
    IDENTIFY(209),
    INFLICT_WOUNDS(214),
    PROTECTION_FROM_EVIL_AND_GOOD(301),
    PURIFY_FOOD_AND_DRINK(303),
    SANCTUARY(319),
    SHIELD_OF_FAITH(331),
    SPEAK_WITH_ANIMALS(343),
    THUNDERWAVE(372),
;
    private final int id;
    ClericSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
