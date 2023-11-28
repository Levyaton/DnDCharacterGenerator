package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell5level {
    ANIMATE_OBJECTS(12),
    CLOUDKILL(60),
    CONE_OF_COLD(68),
    CONTROL_WINDS(85),
    CREATION(92),
    DOMINATE_PERSON(120),
    HOLD_MONSTER(201),
    IMMOLATION(211),
    INSECT_PLAGUE(215),
    SEEMING(324),
    TELEKINESIS(363),
    TELEPORTATION_CIRCLE(366),
    WALL_OF_STONE(393),
;
    private final int id;
    SorcererSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
