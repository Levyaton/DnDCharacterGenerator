package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell7level {
    DELAYED_BLAST_FIREBALL(101),
    ETHEREALNESS(136),
    FINGER_OF_DEATH(151),
    FORCECAGE(164),
    MIRAGE_ARCANE(260),
    MORDENKAINEN_S_MAGNIFICENT_MANSION(268),
    MORDENKAINEN_S_SWORD(270),
    PLANE_SHIFT(285),
    PRISMATIC_SPRAY(295),
    PROJECT_IMAGE(299),
    REVERSE_GRAVITY(315),
    SEQUESTER(326),
    SIMULACRUM(336),
    SYMBOL(361),
    TELEPORT(365),
    WHIRLWIND(403),
;
    private final int id;
    WizardSpell7level(int id) { this.id = id; }
    public int getId() { return id; }
}
