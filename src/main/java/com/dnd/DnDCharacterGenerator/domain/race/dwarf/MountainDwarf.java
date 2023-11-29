package com.dnd.DnDCharacterGenerator.domain.race.dwarf;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;

public class MountainDwarf extends Dwarf {
    @Override
    public Stat wisdom() {
        return new Stat.Wisdom(1);
    }
}
