package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.Language;
import com.dnd.DnDCharacterGenerator.domain.Skill;
import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.FeyAncestry;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.Nightvision;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.Trance;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static com.dnd.DnDCharacterGenerator.domain.Skill.PERCEPTION;

public abstract class Elf extends AbstractRace {
    @Override
    protected Stat dexterity() {
        return new Stat.Dexterity(2);
    }

    @Override
    protected List<Ability> genericAbilities() {
        return List.of(new Nightvision(), new FeyAncestry(), new Trance());
    }

    @Override
    protected List<Ability> genericSkills() {
        return List.of();
    }

    @Override
    protected List<Language> languages() {
        return Stream.concat(super.languages().stream(), Stream.of(Language.ELVISH)).toList();
    }

    @Override
    protected List<Skill> proficiencies() {
        return List.of(PERCEPTION);
    }
}
