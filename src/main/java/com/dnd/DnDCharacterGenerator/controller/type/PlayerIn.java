package com.dnd.DnDCharacterGenerator.controller.type;

import com.dnd.DnDCharacterGenerator.domain.race.AbstractRace;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayerIn {
    private String name;
    private AbstractRace race;

    public PlayerIn(String name, AbstractRace race) {
        this.name = name;
        this.race = race;
    }
}
