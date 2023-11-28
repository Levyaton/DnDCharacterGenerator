package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.Weapon;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.abillity.generic.*;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;

import java.util.List;
import java.util.stream.Stream;

import static com.dnd.DnDCharacterGenerator.domain.spells.warlock.WarlockSpell1level.FAERIE_FIRE;
import static com.dnd.DnDCharacterGenerator.domain.spells.warlock.WarlockSpell2level.DARKNESS;
import static com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip.*;

public class DarkElfDrow extends Elf{
    @Override
    protected List<Ability> genericAbilities() {
        return Stream.concat(
                        super.genericAbilities().stream()
                                .filter(ability -> !(ability instanceof Nightvision)),
                        Stream.of(new SuperiorNightvision(), new DrowMagic(), new SunlightSensitivity())
                )
                .toList();
    }

    @Override
    protected Stat charisma() {
        return new Stat.Charisma(1);
    }

    @Override
    protected List<Spell> cantrips() {
        return List.of(spellbook.getSpellById(DANCING_LIGHTS.getId()));
    }

    @Override
    protected List<Spell> spells() {
        return List.of(spellbook.getSpellById(FAERIE_FIRE.getId()), spellbook.getSpellById(DARKNESS.getId()));
    }

    @Override
    protected List<Weapon> weaponProficiencies() {
        return List.of(Weapon.RAPIER, Weapon.SHORTSWORD, Weapon.HAND_CROSSBOW);
    }


}
