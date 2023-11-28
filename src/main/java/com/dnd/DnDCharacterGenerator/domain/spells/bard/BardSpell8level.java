package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell8level {
    DOMINATE_MONSTER(119),
    FEEBLEMIND(145),
    GLIBNESS(174),
    MIND_BLANK(258),
    POWER_WORD_STUN(291),
;
    private final int id;
    BardSpell8level(int id) { this.id = id; }
    public int getId() { return id; }
}
