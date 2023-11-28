package com.dnd.DnDCharacterGenerator.domain.abillity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ability {
    public static final int UNLIMITED_USE_CONSTANT = 999999;
    private String name;
    private String description;
    private int useCount;
    private SkillRefreshRate refreshRate;

    protected Ability(String name, String description, int useCount, SkillRefreshRate refreshRate) {
        this.name = name;
        this.description = description;
        this.useCount = useCount;
        this.refreshRate = refreshRate;
    }

    public enum SkillRefreshRate {
        SHORT_REST,
        LONG_REST,
        DAY,
        UNLIMITED
    }

    // Additional methods and logic...
}

