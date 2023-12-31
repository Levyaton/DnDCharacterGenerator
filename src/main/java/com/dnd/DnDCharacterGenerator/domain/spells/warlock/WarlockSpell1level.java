package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell1level {
    ARMOR_OF_AGATHYS(19),
    ARMS_OF_HADAR(20),
    BURNING_HANDS(47),
    CHARM_PERSON(52),
    COMMAND(62),
    COMPREHEND_LANGUAGES(66),
    DISSONANT_WHISPERS(113),
    EXPEDITIOUS_RETREAT(138),
    FAERIE_FIRE(141),
    HELLISH_REBUKE(197),
    HEX(200),
    ILLUSORY_SCRIPT(210),
    PROTECTION_FROM_EVIL_AND_GOOD(301),
    SLEEP(338),
    TASHA_S_HIDEOUS_LAUGHTER(362),
    UNSEEN_SERVANT(385),
    WITCH_BOLT(407),
;
    private final int id;
    WarlockSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
