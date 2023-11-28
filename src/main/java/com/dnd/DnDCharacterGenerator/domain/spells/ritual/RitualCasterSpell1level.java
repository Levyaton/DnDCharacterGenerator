package com.dnd.DnDCharacterGenerator.domain.spells.ritual;

public enum RitualCasterSpell1level {
    ALARM(6),
    COMPREHEND_LANGUAGES(66),
    DETECT_MAGIC(105),
    DETECT_POISON_AND_DISEASE(106),
    FIND_FAMILIAR(147),
    IDENTIFY(209),
    ILLUSORY_SCRIPT(210),
    PURIFY_FOOD_AND_DRINK(303),
    SPEAK_WITH_ANIMALS(343),
    TENSER_S_FLOATING_DISK(367),
    UNSEEN_SERVANT(385),
;
    private final int id;


    RitualCasterSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
