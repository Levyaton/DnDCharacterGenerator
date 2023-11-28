package com.dnd.DnDCharacterGenerator.domain.race.elf;

import com.dnd.DnDCharacterGenerator.domain.*;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import com.dnd.DnDCharacterGenerator.domain.spells.wizard.WizardSpellCantrip;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

public class HighElf extends Elf{

    private WizardSpellCantrip cantrip;
    private Language extraLanguage;
    public HighElf(WizardSpellCantrip cantrip, Language language) {
        this.cantrip = cantrip;
        this.extraLanguage = language;
    }

    @Override
    protected Stat intelligence() {
        return new Stat.Intelligence(1);
    }

    @Override
    protected List<Language> languages() {
        return Stream.concat(Stream.of(extraLanguage), super.languages().stream()).toList();
    }

    @Override
    protected List<Spell> cantrips() {
        return List.of(spellbook.getSpellById(cantrip.getId()));
    }

    @Override
    protected List<Weapon> weaponProficiencies() {
        return List.of(Weapon.LONGSWORD, Weapon.SHORTSWORD, Weapon.SHORTBOW, Weapon.LONGBOW);
    }
}
