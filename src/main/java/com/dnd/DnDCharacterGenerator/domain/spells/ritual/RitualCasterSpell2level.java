package com.dnd.DnDCharacterGenerator.domain.spells.ritual;

public enum RitualCasterSpell2level {
    ANIMAL_MESSENGER(9),
    AUGURY(22),
    BEAST_SENSE(33),
    GENTLE_REPOSE(172),
    LOCATE_ANIMALS_OR_PLANTS(232),
    MAGIC_MOUTH(242),
    SILENCE(334),
    SKYWRITE(337),
;
    private final int id;
    RitualCasterSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
