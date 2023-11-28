package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell5level {
    CONTACT_OTHER_PLANE(78),
    DOMINATE_PERSON(120),
    DREAM(121),
    FLAME_STRIKE(158),
    HALLOW(190),
    HOLD_MONSTER(201),
    SCRYING(321),
    SEEMING(324),
    TELEKINESIS(363),
;
    private final int id;
    WarlockSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
