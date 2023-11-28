package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell9level {
    FORESIGHT(165),
    SHAPECHANGE(328),
    STORM_OF_VENGEANCE(354),
    TRUE_RESURRECTION(381),
;
    private final int id;
    DruidSpell9level(int id) { this.id = id; }
    public int getId() { return id; }
}
