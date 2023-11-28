package com.dnd.DnDCharacterGenerator.domain.spells.ranger;

public enum RangerSpell4level {
    CONJURE_WOODLAND_BEINGS(77),
    FREEDOM_OF_MOVEMENT(166),
    GRASPING_VINE(178),
    LOCATE_CREATURE(233),
    STONESKIN(353),
;
    private final int id;
    RangerSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
