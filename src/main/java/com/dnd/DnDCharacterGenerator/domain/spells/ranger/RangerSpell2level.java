package com.dnd.DnDCharacterGenerator.domain.spells.ranger;

public enum RangerSpell2level {
    ANIMAL_MESSENGER(9),
    BARKSKIN(30),
    BEAST_SENSE(33),
    CORDON_OF_ARROWS(86),
    DARKVISION(98),
    FIND_TRAPS(150),
    LESSER_RESTORATION(226),
    LOCATE_ANIMALS_OR_PLANTS(232),
    LOCATE_OBJECT(234),
    PASS_WITHOUT_TRACE(277),
    PROTECTION_FROM_POISON(302),
    SILENCE(334),
    SPIKE_GROWTH(347),
;
    private final int id;
    RangerSpell2level(int id) { this.id = id; }
    public int getId() { return id; }
}
