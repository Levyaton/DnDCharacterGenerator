package com.dnd.DnDCharacterGenerator.domain.spells.druid;

public enum DruidSpellCantrip {
    CONTROL_FLAMES(82),
    CREATE_BONFIRE(88),
    DRUIDCRAFT(122),
    FROSTBITE(168),
    GUIDANCE(185),
    GUST(187),
    MAGIC_STONE(243),
    MENDING(255),
    MOLD_EARTH(265),
    PRODUCE_FLAME(297),
    RESISTANCE(313),
    SHAPE_WATER(327),
    SHILLELAGH(332),
    THORN_WHIP(369),
    THUNDERCLAP(371),
;
    private final int id;
    DruidSpellCantrip(int id) { this.id = id; }
    public int getId() { return id; }
}
