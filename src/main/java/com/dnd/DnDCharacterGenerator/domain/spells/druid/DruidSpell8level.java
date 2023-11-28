package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpell8level {
    ANIMAL_SHAPES(10),
    ANTIPATHY_SYMPATHY(15),
    CONTROL_WEATHER(84),
    EARTHQUAKE(126),
    FEEBLEMIND(145),
    SUNBURST(358),
    TSUNAMI(384),
;
    private final int id;
    DruidSpell8level(int id) { this.id = id; }
    public int getId() { return id; }
}
