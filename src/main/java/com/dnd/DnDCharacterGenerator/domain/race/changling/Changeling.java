package com.dnd.DnDCharacterGenerator.domain.race.changling;

import com.dnd.DnDCharacterGenerator.domain.Stat;
import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;

public class Changeling extends AbstractRace {
    private ModifierInput selectedStat;

    Changeling(ModifierInput selectedStat){
        this.selectedStat = selectedStat;
    }


    @Override
    public Stat dexterity() {
        return new Stat.Dexterity(selectedStat == ModifierInput.DEXTERITY ? 1 : 0);
    }

    @Override
    public Stat intelligence() {
        return new Stat.Intelligence(selectedStat == ModifierInput.INTELLIGENCE ? 1 : 0);
    }

    @Override
    public Stat charisma() {
        return new Stat.Charisma(2);
    }

    public enum ModifierInput{
        DEXTERITY,
        INTELLIGENCE;
    }


}
