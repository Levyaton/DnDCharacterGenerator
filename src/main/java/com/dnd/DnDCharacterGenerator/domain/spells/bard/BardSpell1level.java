package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell1level {
    ANIMAL_FRIENDSHIP(8),
    BANE(27),
    CHARM_PERSON(52),
    COMPREHEND_LANGUAGES(66),
    CURE_WOUNDS(95),
    DETECT_MAGIC(105),
    DISGUISE_SELF(109),
    DISSONANT_WHISPERS(113),
    EARTH_TREMOR(124),
    FAERIE_FIRE(141),
    FEATHER_FALL(144),
    HEALING_WORD(195),
    HEROISM(199),
    IDENTIFY(209),
    ILLUSORY_SCRIPT(210),
    LONGSTRIDER(235),
    SILENT_IMAGE(335),
    SLEEP(338),
    SPEAK_WITH_ANIMALS(343),
    TASHA_S_HIDEOUS_LAUGHTER(362),
    THUNDERWAVE(372),
    UNSEEN_SERVANT(385),
;
    private final int id;
    BardSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
