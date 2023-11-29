package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.Weapon;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.*;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.dnd.DnDCharacterGenerator.domain.spells.warlock.WarlockSpell1level.FAERIE_FIRE;
import static com.dnd.DnDCharacterGenerator.domain.spells.warlock.WarlockSpell2level.DARKNESS;
import static com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip.*;

@JsonTypeName("drow")
public class DarkElfDrow extends Elf{
    @Override
    public Set<Ability> genericAbilities() {
        return Stream.concat(
                        super.genericAbilities().stream()
                                .filter(ability -> !(ability instanceof Nightvision)),
                        Stream.of(new SuperiorNightvision(), new DrowMagic(), new SunlightSensitivity())
                )
                .collect(Collectors.toSet());
    }

    @Override
    public Stat charisma() {
        return new Stat.Charisma(1);
    }

    @Override
    public Set<Spell> cantrips() {
        return Set.of(spellbook.getSpellById(DANCING_LIGHTS.getId()));
    }

    @Override
    public Set<Spell> spells() {
        return Set.of(spellbook.getSpellById(FAERIE_FIRE.getId()), spellbook.getSpellById(DARKNESS.getId()));
    }

    @Override
    public Set<Weapon> weaponProficiencies() {
        return Set.of(Weapon.RAPIER, Weapon.SHORTSWORD, Weapon.HAND_CROSSBOW);
    }


}
