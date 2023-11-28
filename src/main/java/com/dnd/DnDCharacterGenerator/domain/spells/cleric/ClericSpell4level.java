package com.dnd.DnDCharacterGenerator.domain.spells.cleric;

public enum ClericSpell4level {
    ARCANE_EYE(16),
    BANISHMENT(29),
    CONFUSION(69),
    CONTROL_WATER(83),
    DEATH_WARD(100),
    DIMENSION_DOOR(108),
    DIVINATION(114),
    DOMINATE_BEAST(117),
    FREEDOM_OF_MOVEMENT(166),
    GRASPING_VINE(178),
    GUARDIAN_OF_FAITH(183),
    ICE_STORM(208),
    LOCATE_CREATURE(233),
    POLYMORPH(288),
    STONE_SHAPE(352),
    STONESKIN(353),
    WALL_OF_FIRE(389),
;
    private final int id;
    ClericSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
