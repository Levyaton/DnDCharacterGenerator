package com.dnd.DnDCharacterGenerator.domain.spells.sorcerer;

public enum SorcererSpell7level {
    DELAYED_BLAST_FIREBALL(101),
    ETHEREALNESS(136),
    FINGER_OF_DEATH(151),
    FIRE_STORM(155),
    PLANE_SHIFT(285),
    PRISMATIC_SPRAY(295),
    REVERSE_GRAVITY(315),
    TELEPORT(365),
;
    private final int id;
    SorcererSpell7level(int id) { this.id = id; }
    public int getId() { return id; }
}
