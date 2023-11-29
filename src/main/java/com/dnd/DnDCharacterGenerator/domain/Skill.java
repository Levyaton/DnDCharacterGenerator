package com.dnd.DnDCharacterGenerator.domain;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;


public enum Skill {
    ACROBATICS(StatName.DEXTERITY),
    ANIMAL_HANDLING(StatName.WISDOM),
    ARCANA(StatName.INTELLIGENCE),
    ATHLETICS(StatName.STRENGTH),
    DECEPTION(StatName.CHARISMA),
    HISTORY(StatName.INTELLIGENCE),
    INSIGHT(StatName.WISDOM),
    INTIMIDATION(StatName.CHARISMA),
    INVESTIGATION(StatName.INTELLIGENCE),
    MEDICINE(StatName.WISDOM),
    NATURE(StatName.INTELLIGENCE),
    PERCEPTION(StatName.WISDOM),
    PERFORMANCE(StatName.CHARISMA),
    PERSUASION(StatName.CHARISMA),
    RELIGION(StatName.INTELLIGENCE),
    SLEIGHT_OF_HAND(StatName.DEXTERITY),
    STEALTH(StatName.DEXTERITY),
    SURVIVAL(StatName.WISDOM);

    private final StatName associatedStat;

    Skill(StatName associatedStat) {
        this.associatedStat = associatedStat;
    }


}
