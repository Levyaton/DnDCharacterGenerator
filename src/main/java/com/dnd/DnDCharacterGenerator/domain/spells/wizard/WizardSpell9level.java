package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell9level {
    ASTRAL_PROJECTION(21),
    FORESIGHT(165),
    GATE(170),
    IMPRISONMENT(212),
    METEOR_SWARM(257),
    POWER_WORD_KILL(290),
    PRISMATIC_WALL(296),
    SHAPECHANGE(328),
    TIME_STOP(374),
    TRUE_POLYMORPH(380),
    WEIRD(402),
    WISH(406),
;
    private final int id;
    WizardSpell9level(int id) { this.id = id; }
    public int getId() { return id; }
}
