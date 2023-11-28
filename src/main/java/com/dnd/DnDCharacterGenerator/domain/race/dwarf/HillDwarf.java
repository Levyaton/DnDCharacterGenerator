package com.dnd.DnDCharacterGenerator.domain.race.dwarf;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.race.dwarf.Dwarf;

public class HillDwarf extends Dwarf {
    @Override
    protected Stat strength() {
        return new Stat.Strength(2);
    }
}
