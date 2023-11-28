package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell8level {
    ABI_DALZIM_S_HORRID_WILTING(1),
    DOMINATE_MONSTER(119),
    EARTHQUAKE(126),
    INCENDIARY_CLOUD(213),
    POWER_WORD_STUN(291),
    SUNBURST(358),
;
    private final int id;
    SorcererSpell8level(int id) { this.id = id; }
    public int getId() { return id; }
}
