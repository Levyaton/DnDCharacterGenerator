package com.dnd.DnDCharacterGenerator.domain.spells.warlock;

public enum WarlockSpellCantrip {
    BLADE_WARD(37),
    BOOMING_BLADE(45),
    CHILL_TOUCH(53),
    CREATE_BONFIRE(88),
    ELDRITCH_BLAST(127),
    FRIENDS(167),
    FROSTBITE(168),
    GREEN_FLAME_BLADE(182),
    LIGHTNING_LURE(231),
    MAGE_HAND(238),
    MAGIC_STONE(243),
    MINOR_ILLUSION(259),
    POISON_SPRAY(287),
    PRESTIDIGITATION(293),
    SWORD_BURST(360),
    THUNDERCLAP(371),
    TRUE_STRIKE(383),
;
    private final int id;
    WarlockSpellCantrip(int id) { this.id = id; }
    public int getId() { return id; }
}
