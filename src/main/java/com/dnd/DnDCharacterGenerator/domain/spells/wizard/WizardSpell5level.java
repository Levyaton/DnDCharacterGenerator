package com.dnd.DnDCharacterGenerator.domain.spells.wizard;

public enum WizardSpell5level {
    ANIMATE_OBJECTS(12),
    BIGBY_S_HAND(35),
    CLOUDKILL(60),
    CONE_OF_COLD(68),
    CONJURE_ELEMENTAL(73),
    CONTACT_OTHER_PLANE(78),
    CONTROL_WINDS(85),
    CREATION(92),
    DOMINATE_PERSON(120),
    DREAM(121),
    GEAS(171),
    HOLD_MONSTER(201),
    IMMOLATION(211),
    LEGEND_LORE(223),
    MISLEAD(262),
    MODIFY_MEMORY(264),
    PASSWALL(278),
    PLANAR_BINDING(284),
    RARY_S_TELEPATHIC_BOND(306),
    SCRYING(321),
    SEEMING(324),
    TELEKINESIS(363),
    TELEPORTATION_CIRCLE(366),
    TRANSMUTE_ROCK(376),
    WALL_OF_FORCE(390),
    WALL_OF_STONE(393),
;
    private final int id;
    WizardSpell5level(int id) { this.id = id; }
    public int getId() { return id; }
}
