package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class FeyAncestry extends Ability {

    public FeyAncestry() {
        super("Fey", "You have advantage on saving throws against being charmed, and magic can't put you to sleep.", Ability.UNLIMITED_USE_CONSTANT, SkillRefreshRate.UNLIMITED);
    }
}
