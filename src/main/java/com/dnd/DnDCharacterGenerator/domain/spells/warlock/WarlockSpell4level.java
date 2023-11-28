package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpell4level {
    BANISHMENT(29),
    BLIGHT(39),
    DIMENSION_DOOR(108),
    DOMINATE_BEAST(117),
    ELEMENTAL_BANE(128),
    EVARD_S_BLACK_TENTACLES(137),
    FIRE_SHIELD(154),
    GREATER_INVISIBILITY(180),
    HALLUCINATORY_TERRAIN(191),
    WALL_OF_FIRE(389),
;
    private final int id;
    WarlockSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
