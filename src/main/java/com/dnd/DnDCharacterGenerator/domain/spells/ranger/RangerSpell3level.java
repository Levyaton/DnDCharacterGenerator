package com.dnd.DnDCharacterGenerator.domain.spells.ranger;

public enum RangerSpell3level {
    CONJURE_ANIMALS(70),
    CONJURE_BARRAGE(71),
    DAYLIGHT(99),
    FLAME_ARROWS(156),
    LIGHTNING_ARROW(229),
    NONDETECTION(272),
    PLANT_GROWTH(286),
    PROTECTION_FROM_ENERGY(300),
    SPEAK_WITH_PLANTS(345),
    WATER_BREATHING(398),
    WATER_WALK(399),
    WIND_WALL(405),
;
    private final int id;
    RangerSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
