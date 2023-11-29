package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.Language;
import com.dnd.DnDCharacterGenerator.domain.Skill;
import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.FeyAncestry;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.Nightvision;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.Trance;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.dnd.DnDCharacterGenerator.domain.Skill.PERCEPTION;

@JsonTypeName("elf")
@JsonSubTypes({
        @JsonSubTypes.Type(value = HighElf.class, name = "highElf"),
        @JsonSubTypes.Type(value = WoodElf.class, name = "drow"),
        @JsonSubTypes.Type(value = DarkElfDrow.class, name = "woodElf"),
})
public abstract class Elf extends AbstractRace {
    @Override
    public Stat dexterity() {
        return new Stat.Dexterity(2);
    }

    @Override
    public Set<Ability> genericAbilities() {
        return Set.of(new Nightvision(), new FeyAncestry(), new Trance());
    }

    @Override
    public Set<Language> languages() {
        return Stream.concat(super.languages().stream(), Stream.of(Language.ELVISH)).collect(Collectors.toSet());
    }

    @Override
    public Set<Skill> proficiencies() {
        return Set.of(PERCEPTION);
    }
}
