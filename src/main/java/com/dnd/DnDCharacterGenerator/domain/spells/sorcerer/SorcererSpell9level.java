package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell9level {
    GATE(170),
    METEOR_SWARM(257),
    POWER_WORD_KILL(290),
    TIME_STOP(374),
    WISH(406),
;
    private final int id;
    SorcererSpell9level(int id) { this.id = id; }
    public int getId() { return id; }
}
