package com.dnd.DnDCharacterGenerator.persistance;

import com.dnd.DnDCharacterGenerator.domain.*;
import com.dnd.DnDCharacterGenerator.domain.abillity.Ability;
import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class PlayerDao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int speed;
    private String raceJson;
    private String raceJsonType;
    private String name;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PlayerCantrips", joinColumns = @JoinColumn(name = "playerId"))
    private Set<Spell> cantrips;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PlayerSpells", joinColumns = @JoinColumn(name = "playerId"))
    private Set<Spell> spells;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PlayerAbilities", joinColumns = @JoinColumn(name = "playerId"))
    private Set<Ability> genericAbilities;

    @ElementCollection(targetClass = Weapon.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING) // or EnumType.ORDINAL
    @CollectionTable(name = "Weapons")
    @Column(name = "weaponProficiencies")
    private Set<Weapon> weaponProficiencies;

    @ElementCollection(targetClass = Armour.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING) // or EnumType.ORDINAL
    @CollectionTable(name = "Armours")
    @Column(name = "armourProficiencies")
    private Set<Armour> armourProficiencies;


    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "DamageAbilities", joinColumns = @JoinColumn(name = "playerId"))
    protected Set<Ability> damageAbilities;

    @ElementCollection(targetClass = Skill.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "player_skills", joinColumns = @JoinColumn(name = "player_id"))
    @Column(name = "skill")
    protected Set<Skill> proficiencies;

    @ElementCollection(targetClass = Language.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING) // or EnumType.ORDINAL
    @CollectionTable(name = "Languages")
    @Column(name = "languages")
    protected Set<Language> languages;

}
