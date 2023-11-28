package com.dnd.DnDCharacterGenerator.domain.race.halforc;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;

public class HalfOrc extends AbstractRace {

    @Override
    public Stat strength() {
        return new Stat.Strength(2); // Orcs have +2 Strength
    }

    @Override
    public Stat constitution() {
        return new Stat.Constitution(1); // Orcs have +1 Constitution
    }
}
