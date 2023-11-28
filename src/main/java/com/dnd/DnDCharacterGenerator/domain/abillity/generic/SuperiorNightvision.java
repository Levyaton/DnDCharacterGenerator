package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class SuperiorNightvision extends Nightvision {
    public SuperiorNightvision() {
        var description = super.getDescription();
        super.setDescription( description.replace("60", "120"));
    }
}
