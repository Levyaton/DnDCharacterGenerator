package com.dnd.DnDCharacterGenerator.domain.abillity.generic;

import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;

public class DrowMagic extends Ability {
    public DrowMagic() {
        super("DrowMagic", "You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.", 1, SkillRefreshRate.DAY);
    }
}
