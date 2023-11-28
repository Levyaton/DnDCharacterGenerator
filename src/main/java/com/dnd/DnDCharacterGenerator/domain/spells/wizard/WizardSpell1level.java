package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell1level {
    ABSORB_ELEMENTS(2),
    ALARM(6),
    BEAST_BOND(32),
    BURNING_HANDS(47),
    CATAPULT(50),
    CHARM_PERSON(52),
    CHROMATIC_ORB(54),
    COLOR_SPRAY(61),
    COMPREHEND_LANGUAGES(66),
    DETECT_MAGIC(105),
    DISGUISE_SELF(109),
    EARTH_TREMOR(124),
    EXPEDITIOUS_RETREAT(138),
    FALSE_LIFE(142),
    FEATHER_FALL(144),
    FIND_FAMILIAR(147),
    FOG_CLOUD(162),
    GREASE(179),
    ICE_KNIFE(207),
    IDENTIFY(209),
    ILLUSORY_SCRIPT(210),
    JUMP(221),
    LONGSTRIDER(235),
    MAGE_ARMOR(237),
    MAGIC_MISSILE(241),
    PROTECTION_FROM_EVIL_AND_GOOD(301),
    RAY_OF_SICKNESS(309),
    SHIELD(330),
    SILENT_IMAGE(335),
    SLEEP(338),
    TASHA_S_HIDEOUS_LAUGHTER(362),
    TENSER_S_FLOATING_DISK(367),
    THUNDERWAVE(372),
    UNSEEN_SERVANT(385),
    WITCH_BOLT(407),
;
    private final int id;
    WizardSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
