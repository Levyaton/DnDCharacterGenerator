package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class MaskOfTheWild extends Ability {
    public MaskOfTheWild() {
        super("MaskOfTheWild", "You can attempt to hide even when " +
                "you are only lightly obscured by foliage, heavy rain, " +
                "falling snow, mist, and other natural phenomena.", 999999, SkillRefreshRate.UNLIMITED);
    }
}
