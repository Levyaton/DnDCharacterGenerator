package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell6level {
    BLADE_BARRIER(36),
    CREATE_UNDEAD(91),
    FIND_THE_PATH(149),
    FORBIDDANCE(163),
    HARM(192),
    HEAL(194),
    HEROES__FEAST(198),
    PLANAR_ALLY(283),
    TRUE_SEEING(382),
    WORD_OF_RECALL(408),
;
    private final int id;
    ClericSpell6level(int id) { this.id = id; }
    public int getId() { return id; }
}
