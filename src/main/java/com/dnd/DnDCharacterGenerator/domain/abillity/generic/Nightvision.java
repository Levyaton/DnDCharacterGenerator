package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class Nightvision extends Ability {
    public Nightvision() {
        super("Nightvision", "You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.", 999999, SkillRefreshRate.UNLIMITED);
    }
}
