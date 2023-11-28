package com.dnd.DnDCharacterGenerator.domain.spells.palladin;

public enum PaladinSpell2level {
    AID(5),
    BRANDING_SMITE(46),
    FIND_STEED(148),
    HOLD_PERSON(202),
    LESSER_RESTORATION(226),
    LOCATE_OBJECT(234),
    MAGIC_WEAPON(244),
    MISTY_STEP(263),
    MOONBEAM(266),
    PROTECTION_FROM_POISON(302),
    ZONE_OF_TRUTH(410),
;
    private final int id;
    PaladinSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
