package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.*;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonTypeName("highElf")
public class HighElf extends Elf{

    private WizardSpellCantrip cantrip;
    private Language extraLanguage;
    public HighElf(WizardSpellCantrip cantrip, Language extraLanguage) {
        this.cantrip = cantrip;
        this.extraLanguage = extraLanguage;
    }

    @Override
    public Stat intelligence() {
        return new Stat.Intelligence(1);
    }

    @Override
    public Set<Language> languages() {
        return Stream.concat(Stream.of(extraLanguage), super.languages().stream()).collect(Collectors.toSet());
    }

    @Override
    public Set<Spell> cantrips() {
        return Set.of(spellbook.getSpellById(cantrip.getId()));
    }

    @Override
    public Set<Weapon> weaponProficiencies() {
        return Set.of(Weapon.LONGSWORD, Weapon.SHORTSWORD, Weapon.SHORTBOW, Weapon.LONGBOW);
    }
}
