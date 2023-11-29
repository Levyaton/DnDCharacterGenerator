package com.dnd.DnDCharacterGenerator.domain.race;

import com.dnd.DnDCharacterGenerator.domain.*;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.race.dragonborn.Dragonborn;
import com.dnd.DnDCharacterGenerator.domain.race.elf.DarkElfDrow;
import com.dnd.DnDCharacterGenerator.domain.race.elf.Elf;
import com.dnd.DnDCharacterGenerator.domain.race.elf.HighElf;
import com.dnd.DnDCharacterGenerator.domain.race.elf.WoodElf;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.dnd.DnDCharacterGenerator.domain.spells.Spellbook;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;
import java.util.Set;

@Getter
@Setter
@Component
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Elf.class, name = "highElf"),
        @JsonSubTypes.Type(value = Dragonborn.class, name = "dragonborn")
})
public abstract class AbstractRace {
    @Autowired
    @JsonIgnore
    protected Spellbook spellbook;

    public String otherTraits() {
        return "";
    }

    public int speed() {
        return 30; // Default speed
    }

    public Set<Spell> cantrips() {
        return Collections.emptySet();
    }

    public Set<Spell> spells() {
        return Collections.emptySet();
    }

    public Set<Ability> genericAbilities() {
        return Collections.emptySet();
    }

    public Set<Ability> damageAbilities() {
        return Collections.emptySet();
    }

    public Set<Skill> proficiencies() {
        return Collections.emptySet();
    }

    public Set<Language> languages(){
        return Set.of(Language.COMMON);
    }

    public Set<Armour> armourProficiencies() {
        return Collections.emptySet();
    }

    public Set<Weapon> weaponProficiencies() {
        return Collections.emptySet();
    }

    public Stat strength() {
        return new Stat.Strength(0);
    }

    public Stat dexterity() {
        return new Stat.Dexterity(0);
    }

    public Stat constitution() {
        return new Stat.Constitution(0);
    }

    public Stat intelligence() {
        return new Stat.Intelligence(0);
    }

    public Stat wisdom() {
        return new Stat.Wisdom(0);
    }

    public Stat charisma() {
        return new Stat.Charisma(0);
    }

}