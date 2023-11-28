package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class SunlightSensitivity extends Ability {
    public SunlightSensitivity() {
        super("SunlightSensitivity", "You have disadvantage on attack rolls and on Wisdom (Perception) checks that rely on sight when you, the target of your attack, or whatever you are trying to perceive is in direct sunlight.", 999999, Ability.SkillRefreshRate.UNLIMITED);
    }


}
