package com.dnd.DnDCharacterGenerator.domain.race.dwarf;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;

public class MountainDwarf extends Dwarf {
    @Override
    protected Stat wisdom() {
        return new Stat.Wisdom(1);
    }
}
