package com.dnd.DnDCharacterGenerator.controller.type;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayerIn {
    private String name;


    public PlayerIn(String name) {
        this.name = name;
    }
}
