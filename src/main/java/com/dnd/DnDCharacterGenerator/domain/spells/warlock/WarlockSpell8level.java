package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell8level {
    DEMIPLANE(102),
    DOMINATE_MONSTER(119),
    FEEBLEMIND(145),
    GLIBNESS(174),
    POWER_WORD_STUN(291),
;
    private final int id;
    WarlockSpell8level(int id) { this.id = id; }
    public int getId() { return id; }
}
