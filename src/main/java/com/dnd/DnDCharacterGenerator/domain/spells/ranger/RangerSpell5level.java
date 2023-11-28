package com.dnd.DnDCharacterGenerator.domain.spells.ranger;

public enum RangerSpell5level {
    COMMUNE_WITH_NATURE(64),
    CONJURE_VOLLEY(76),
    SWIFT_QUIVER(359),
    TREE_STRIDE(379),
;
    private final int id;
    RangerSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
