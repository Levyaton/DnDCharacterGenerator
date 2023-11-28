package com.dnd.DnDCharacterGenerator.domain.spells.palladin;

public enum PaladinSpell5level {
    BANISHING_SMITE(28),
    CIRCLE_OF_POWER(56),
    COMMUNE(63),
    COMMUNE_WITH_NATURE(64),
    DESTRUCTIVE_WAVE(103),
    DISPEL_EVIL_AND_GOOD(111),
    FLAME_STRIKE(158),
    GEAS(171),
    HOLD_MONSTER(201),
    RAISE_DEAD(305),
    SCRYING(321),
    TREE_STRIDE(379),
;
    private final int id;
    PaladinSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
