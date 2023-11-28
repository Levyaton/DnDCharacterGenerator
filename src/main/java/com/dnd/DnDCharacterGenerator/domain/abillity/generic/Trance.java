package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class Trance extends Ability {
    public Trance() {
        super("Trance", "Elves don't need to sleep. Instead, they meditate deeply, remaining " +
                "semiconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") " +
                "While meditating, you can dream after a fashion; such dreams are actually mental exercises that " +
                "have become reflexive through years of practice. After " +
                "resting in this way, you gain the same benefit that a " +
                "human does from 8 hours of sleep.", Ability.UNLIMITED_USE_CONSTANT, SkillRefreshRate.UNLIMITED);
    }
}
