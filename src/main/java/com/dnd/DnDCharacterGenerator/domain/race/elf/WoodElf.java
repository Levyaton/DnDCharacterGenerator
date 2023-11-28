package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.Language;
import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.Weapon;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.MaskOfTheWild;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip;

import java.util.List;
import java.util.stream.Stream;

public class WoodElf extends Elf{

    @Override
    protected Stat wisdom() {
        return new Stat.Wisdom(1);
    }

    @Override
    protected int speed() {
        return 35;
    }

    @Override
    protected List<Ability> genericAbilities() {
        return Stream.concat(Stream.of(new MaskOfTheWild()), super.genericAbilities().stream()).toList();
    }

    @Override
    protected List<Weapon> weaponProficiencies() {
        return List.of(Weapon.LONGSWORD, Weapon.SHORTSWORD, Weapon.SHORTBOW, Weapon.LONGBOW);
    }
}
