package com.dnd.DnDCharacterGenerator.domain.abillity;

import com.dnd.DnDCharacterGenerator.DiceType;
import com.dnd.DnDCharacterGenerator.domain.DamageType;
import com.dnd.DnDCharacterGenerator.domain.StatName;

public class AttackAbility extends Ability{
    protected String distance;
    protected StatName savingThrow;
    protected DamageType damageType;
    protected DiceType damageDice;
    protected DiceType difficultyDice;
    protected StatName throwModifier;
    boolean addProficiencyBonus;

    public String getAccuracyInfo(){
        return difficultyDice.name() + " + player " + throwModifier.name() + " modifier" + (addProficiencyBonus ? " + proficiency bonus" : "");
    }


    public AttackAbility(String name, String description, int useCount, SkillRefreshRate refreshRate, String distance, StatName savingThrow, DamageType damageType, DiceType damageDice, StatName throwModifier, boolean addProficiencyBonus) {
        super(name, description, useCount, refreshRate);
        this.distance = distance;
        this.savingThrow = savingThrow;
        this.damageType = damageType;
        this.damageDice = damageDice;
        this.difficultyDice = difficultyDice;
        this.throwModifier = throwModifier;
        this.addProficiencyBonus = addProficiencyBonus;
    }
}
