package com.dnd.DnDCharacterGenerator.domain.spells;


import com.dnd.DnDCharacterGenerator.domain.Stat;

public record Spell(String name, String desc, String page, String range,
                    String components, String ritual, String duration,
                    String concentration, String castingTime, String level, String higherLevel,
                    String school, String clazz, String oaths, String material, String patrons, Integer id,String circles, String domains, String archetype) {}
