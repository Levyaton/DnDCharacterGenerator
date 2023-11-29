package com.dnd.DnDCharacterGenerator.domain.spells;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Spell {
    String name, page, range, components, ritual, duration, concentration, castingTime, level, higherLevel, school, clazz, oaths, material, patrons, circles, domains, archetype;
    Integer id;
    @Column(columnDefinition = "TEXT")
    String desc;
}
