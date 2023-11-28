package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell4level {
    BANISHMENT(29),
    BLIGHT(39),
    CONFUSION(69),
    DIMENSION_DOOR(108),
    DOMINATE_BEAST(117),
    GREATER_INVISIBILITY(180),
    ICE_STORM(208),
    POLYMORPH(288),
    STONESKIN(353),
    STORM_SPHERE(355),
    VITRIOLIC_SPHERE(388),
    WALL_OF_FIRE(389),
    WATERY_SPHERE(400),
;
    private final int id;
    SorcererSpell4level(int id) { this.id = id; }
    public int getId() { return id; }
}
