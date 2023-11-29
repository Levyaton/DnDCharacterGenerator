package com.dnd.DnDCharacterGenerator.domain.spells;

import com.dnd.DnDCharacterGenerator.domain.spells.Spell;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class Spellbook {
    private List<Spell> allSpells;

    @PostConstruct
    private void loadSpells() {
        var mapper = new ObjectMapper();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("spells.json")) {
            if (is == null) {
                throw new IllegalArgumentException("Spell file not found!");
            } else {
                allSpells = mapper.readValue(is, new TypeReference<>() {});
            }
        } catch (IOException e) {
            e.printStackTrace();
            allSpells = new ArrayList<>();
        }
    }

    public Spell getSpellById(Integer spellId) {
        var optional = allSpells.stream()
                .filter(spell -> spell.getId().equals(spellId))
                .findFirst();
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new IllegalArgumentException("Spell not found!");
        }
    }

    public List<Spell> getSpellsByClass(String clazz) {
        return allSpells.stream()
                .filter(spell -> spell.getClazz() != null && spell.getClazz().contains(clazz))
                .collect(Collectors.toList());
    }

    public List<Spell> getSpellsByLevel(String level) {
        return allSpells.stream()
                .filter(spell -> spell.getLevel() != null && spell.getLevel().equalsIgnoreCase(level))
                .collect(Collectors.toList());
    }

    public List<Spell> getSpellsByClassAndLevel(String clazz, String level) {
        return allSpells.stream()
                .filter(spell -> spell.getClazz() != null && spell.getClazz().contains(clazz)
                        && spell.getLevel() != null && spell.getLevel().equalsIgnoreCase(level))
                .collect(Collectors.toList());
    }
}
