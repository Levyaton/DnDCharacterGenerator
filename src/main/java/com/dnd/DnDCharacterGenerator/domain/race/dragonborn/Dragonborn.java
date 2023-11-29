package com.dnd.DnDCharacterGenerator.domain.race.dragonborn;

import com.dnd.DnDCharacterGenerator.DiceType;
import com.dnd.DnDCharacterGenerator.domain.DamageType;
import com.dnd.DnDCharacterGenerator.domain.StatName;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.abillity.AttackAbility;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("dragonborn")
public class Dragonborn extends AbstractRace {
    private final Color color;

    Dragonborn(Color color){
        this.color = color;
    }

    @Override
    public Stat strength() {
        return new Stat.Strength(2);
    }

    @Override
    public Stat charisma() {
        return new Stat.Charisma(1);
    }

    @Override
    public String otherTraits() {
        return color.name() + " Dragonborn";
    }
    public enum Color{
        BLACK,
        BLUE,
        BRASS,
        BRONZE,
        COPPER,
        GOLD,
        GREEN,
        RED,
        SILVER,
        WHITE;
    }

    private Ability dragonBreath = new AttackAbility(
            "Dragon Breath",
            "You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.",
            1,
            Ability.SkillRefreshRate.SHORT_REST,
            "5 by 30 ft. line",
        getStatName(),
        getDamageType(),
        DiceType.D6,
        StatName.CONSTITUTION,
        true
    );

    private DamageType getDamageType(){
        return switch (color) {
            case BLACK -> DamageType.ACID;
            case BLUE -> DamageType.LIGHTNING;
            case BRASS -> DamageType.FIRE;
            case BRONZE -> DamageType.LIGHTNING;
            case COPPER -> DamageType.ACID;
            case GOLD -> DamageType.FIRE;
            case GREEN -> DamageType.POISON;
            case RED -> DamageType.FIRE;
            case SILVER -> DamageType.COLD;
            case WHITE -> DamageType.COLD;
        };
    }

    private StatName getStatName(){
        return switch (color){
            case BLACK, COPPER,BRASS,GOLD, RED, BLUE, BRONZE -> StatName.DEXTERITY;
            case GREEN, SILVER, WHITE -> StatName.CONSTITUTION;
        };
    }


}
