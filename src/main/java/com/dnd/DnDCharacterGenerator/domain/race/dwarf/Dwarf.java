package com.dnd.DnDCharacterGenerator.domain.race.dwarf;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;

public abstract class Dwarf extends AbstractRace {
    @Override
    protected Stat constitution() {
        return new Stat.Constitution(2);
    }
}
