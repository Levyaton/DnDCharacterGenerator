package com.dnd.DnDCharacterGenerator.domain.spells.palladin;

public enum PaladinSpell4level {
    AURA_OF_LIFE(23),
    AURA_OF_PURITY(24),
    BANISHMENT(29),
    DEATH_WARD(100),
    DIMENSION_DOOR(108),
    FREEDOM_OF_MOVEMENT(166),
    GUARDIAN_OF_FAITH(183),
    ICE_STORM(208),
    LOCATE_CREATURE(233),
    STAGGERING_SMITE(350),
    STONESKIN(353),
;
    private final int id;
    PaladinSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
