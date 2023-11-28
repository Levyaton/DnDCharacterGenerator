package com.dnd.DnDCharacterGenerator.domain;

public record DnDCharacter(
        String name,
        String race,
        String characterClass,
        int level,
        String alignment,
        String background,
        int strength,
        int dexterity,
        int constitution,
        int intelligence,
        int wisdom,
        int charisma,
        int hitPoints,
        int armorClass,
        int initiative,
        int speed
) {
    // Additional methods for character functionality
    // ...

    // You can still add custom methods or override the default ones if needed
}
