package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell4level {
    COMPULSION(67),
    CONFUSION(69),
    DIMENSION_DOOR(108),
    FREEDOM_OF_MOVEMENT(166),
    GREATER_INVISIBILITY(180),
    HALLUCINATORY_TERRAIN(191),
    LOCATE_CREATURE(233),
    POLYMORPH(288),
;
    private final int id;
    BardSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
