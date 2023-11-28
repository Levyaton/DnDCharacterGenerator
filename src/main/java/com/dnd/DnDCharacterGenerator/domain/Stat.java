package com.dnd.DnDCharacterGenerator.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Stat {

    private final int value;
    private final StatName name;


    public static final class Strength extends Stat {
        public Strength(int value) {
            super(value, StatName.STRENGTH);
        }
    }

    public static final class Dexterity extends Stat {
        public Dexterity(int value) {
            super(value, StatName.DEXTERITY);
        }
    }

    private String woof(){return "";}

    public static final class Constitution extends Stat {
        public Constitution(int value) {
            super(value, StatName.CONSTITUTION);
        }
    }

    public static final class Intelligence extends Stat {
        public Intelligence(int value) {
            super(value,  StatName.INTELLIGENCE);
        }
    }

    public static final class Wisdom extends Stat {
        public Wisdom(int value) {
            super(value, StatName.WISDOM);
        }
    }

    public static final class Charisma extends Stat {
        public Charisma(int value) {
            super(value, StatName.CHARISMA);
        }
    }




}
