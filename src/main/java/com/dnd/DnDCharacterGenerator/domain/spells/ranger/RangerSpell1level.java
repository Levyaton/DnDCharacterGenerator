package com.dnd.DnDCharacterGenerator.domain.spells.ranger;

public enum RangerSpell1level {
    ABSORB_ELEMENTS(2),
    ALARM(6),
    ANIMAL_FRIENDSHIP(8),
    BEAST_BOND(32),
    CURE_WOUNDS(95),
    DETECT_MAGIC(105),
    DETECT_POISON_AND_DISEASE(106),
    ENSNARING_STRIKE(132),
    FOG_CLOUD(162),
    GOODBERRY(177),
    HAIL_OF_THORNS(189),
    HUNTER_S_MARK(205),
    JUMP(221),
    LONGSTRIDER(235),
    SPEAK_WITH_ANIMALS(343),
;
    private final int id;
    RangerSpell1level(int id) { this.id = id; }
    public int getId() { return id; }
}
