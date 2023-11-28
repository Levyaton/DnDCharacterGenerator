package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell7level {
    ETHEREALNESS(136),
    FINGER_OF_DEATH(151),
    FORCECAGE(164),
    PLANE_SHIFT(285),
;
    private final int id;
    WarlockSpell7level(int id) { this.id = id; }
    public int getId() { return id; }
}
