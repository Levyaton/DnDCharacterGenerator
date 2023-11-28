package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell4level {
    BLIGHT(39),
    CONFUSION(69),
    CONJURE_MINOR_ELEMENTALS(75),
    CONJURE_WOODLAND_BEINGS(77),
    CONTROL_WATER(83),
    DIVINATION(114),
    DOMINATE_BEAST(117),
    ELEMENTAL_BANE(128),
    FREEDOM_OF_MOVEMENT(166),
    GIANT_INSECT(173),
    GRASPING_VINE(178),
    GREATER_INVISIBILITY(180),
    HALLUCINATORY_TERRAIN(191),
    ICE_STORM(208),
    LOCATE_CREATURE(233),
    POLYMORPH(288),
    STONE_SHAPE(352),
    STONESKIN(353),
    WALL_OF_FIRE(389),
    WATERY_SPHERE(400),
;
    private final int id;
    DruidSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
