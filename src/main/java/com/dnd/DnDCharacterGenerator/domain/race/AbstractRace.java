package com.dnd.DnDCharacterGenerator.domain.race;

import com.dnd.DnDCharacterGenerator.domain.*;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.dnd.DnDCharacterGenerator.domain.spells.Spellbook;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Getter
@Setter
@Component
public abstract class AbstractRace {
    @Autowired
    protected Spellbook spellbook;

    protected int speed() {
        return 30; // Default speed
    }

    protected List<Spell> cantrips() {
        return Collections.emptyList();
    }

    protected List<Spell> spells() {
        return Collections.emptyList();
    }

    protected List<Ability> genericAbilities() {
        return Collections.emptyList();
    }

    protected List<Ability> damageAbilities() {
        return Collections.emptyList();
    }

    protected List<Ability> genericSkills() {
        return Collections.emptyList();
    }

    protected List<Skill> proficiencies() {
        return Collections.emptyList();
    }

    protected List<Language> languages(){
        return List.of(Language.COMMON);
    }

    protected List<Armour> armourProficiencies() {
        return Collections.emptyList();
    }

    protected List<Weapon> weaponProficiencies() {
        return Collections.emptyList();
    }

    protected Stat strength() {
        return new Stat.Strength(0);
    }

    protected Stat dexterity() {
        return new Stat.Dexterity(0);
    }

    protected Stat constitution() {
        return new Stat.Constitution(0);
    }

    protected Stat intelligence() {
        return new Stat.Intelligence(0);
    }

    protected Stat wisdom() {
        return new Stat.Wisdom(0);
    }

    protected Stat charisma() {
        return new Stat.Charisma(0);
    }

}