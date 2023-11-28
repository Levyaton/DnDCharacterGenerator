package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell8level {
    ABI_DALZIM_S_HORRID_WILTING(1),
    ANTIMAGIC_FIELD(14),
    ANTIPATHY_SYMPATHY(15),
    CLONE(58),
    CONTROL_WEATHER(84),
    DEMIPLANE(102),
    DOMINATE_MONSTER(119),
    FEEBLEMIND(145),
    INCENDIARY_CLOUD(213),
    MAZE(251),
    MIND_BLANK(258),
    POWER_WORD_STUN(291),
    SUNBURST(358),
    TELEPATHY(364),
    TRAP_THE_SOUL(378),
;
    private final int id;
    WizardSpell8level(int id) { this.id = id; }
    public int getId() { return id; }
}
