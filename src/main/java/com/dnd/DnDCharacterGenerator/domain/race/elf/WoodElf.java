package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.Language;
import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.Weapon;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.MaskOfTheWild;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonTypeName("woodElf")
public class WoodElf extends Elf{

    @Override
    public Stat wisdom() {
        return new Stat.Wisdom(1);
    }

    @Override
    public int speed() {
        return 35;
    }

    @Override
    public Set<Ability> genericAbilities() {
        return Stream.concat(Stream.of(new MaskOfTheWild()), super.genericAbilities().stream()).collect(Collectors.toSet());
    }

    @Override
    public Set<Weapon> weaponProficiencies() {
        return Set.of(Weapon.LONGSWORD, Weapon.SHORTSWORD, Weapon.SHORTBOW, Weapon.LONGBOW);
    }
}
