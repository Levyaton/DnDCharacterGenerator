package com.dnd.DnDCharacterGenerator.domain.spells.bard;

public enum BardSpell5level {
    ANIMATE_OBJECTS(12),
    AWAKEN(26),
    DOMINATE_PERSON(120),
    DREAM(121),
    GEAS(171),
    GREATER_RESTORATION(181),
    HOLD_MONSTER(201),
    LEGEND_LORE(223),
    MASS_CURE_WOUNDS(246),
    MISLEAD(262),
    MODIFY_MEMORY(264),
    PLANAR_BINDING(284),
    RAISE_DEAD(305),
    SCRYING(321),
    SEEMING(324),
    TELEPORTATION_CIRCLE(366),
;
    private final int id;
    BardSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
