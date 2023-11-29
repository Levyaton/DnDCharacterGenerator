package com.dnd.DnDCharacterGenerator.domain.abillity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
public class Ability {
    public static final int UNLIMITED_USE_CONSTANT = 999999;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private int useCount;
    @Enumerated(EnumType.STRING)
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

