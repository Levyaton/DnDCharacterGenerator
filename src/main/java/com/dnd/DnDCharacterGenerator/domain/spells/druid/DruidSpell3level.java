package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell3level {
    CALL_LIGHTNING(48),
    CONJURE_ANIMALS(70),
    CREATE_FOOD_AND_WATER(89),
    DAYLIGHT(99),
    DISPEL_MAGIC(112),
    ERUPTING_EARTH(135),
    FEIGN_DEATH(146),
    FLAME_ARROWS(156),
    GASEOUS_FORM(169),
    HASTE(193),
    LIGHTNING_BOLT(230),
    MELD_INTO_STONE(252),
    PLANT_GROWTH(286),
    PROTECTION_FROM_ENERGY(300),
    SLEET_STORM(339),
    SLOW(340),
    SPEAK_WITH_PLANTS(345),
    STINKING_CLOUD(351),
    TIDAL_WAVE(373),
    WALL_OF_WATER(395),
    WATER_BREATHING(398),
    WATER_WALK(399),
    WIND_WALL(405),
;
    private final int id;
    DruidSpell3level(int id) { this.id = id; }
    public int getId() { return id; }
}
