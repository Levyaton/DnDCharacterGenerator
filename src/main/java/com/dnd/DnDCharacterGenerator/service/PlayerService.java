package com.dnd.DnDCharacterGenerator.service;

import com.dnd.DnDCharacterGenerator.controller.type.PlayerIn;
import com.dnd.DnDCharacterGenerator.domain.spells.Spellbook;
import com.dnd.DnDCharacterGenerator.persistance.PlayerDao;
import com.dnd.DnDCharacterGenerator.persistance.PlayerRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final ObjectMapper objectMapper;
    private final Spellbook spellbook;
    public PlayerService(PlayerRepository playerRepository, Spellbook spellbook) {
        this.playerRepository = playerRepository;
        this.objectMapper = new ObjectMapper();
        this.spellbook = spellbook;
    }


    public void createPlayer(PlayerIn playerIn) throws JsonProcessingException {
        playerIn.getRace().setSpellbook(spellbook);
        PlayerDao playerDao = new PlayerDao();
        playerDao.setName(playerIn.getName());
        playerDao.setRaceJson(objectMapper.writeValueAsString(playerIn.getRace()));
        playerDao.setRaceJsonType(playerIn.getRace().getClass().getSimpleName());
        playerDao.setStrength(playerIn.getRace().strength().getValue());
        playerDao.setCharisma(playerIn.getRace().charisma().getValue());
        playerDao.setConstitution(playerIn.getRace().constitution().getValue());
        playerDao.setDexterity(playerIn.getRace().dexterity().getValue());
        playerDao.setIntelligence(playerIn.getRace().intelligence().getValue());
        playerDao.setSpeed(playerIn.getRace().speed());
        playerDao.setWisdom(playerIn.getRace().wisdom().getValue());
        playerDao.setArmourProficiencies(playerIn.getRace().armourProficiencies());
        playerDao.setWeaponProficiencies(playerIn.getRace().weaponProficiencies());
        playerDao.setCantrips(playerIn.getRace().cantrips());
        playerDao.setSpells(playerIn.getRace().spells());
        playerDao.setGenericAbilities(playerIn.getRace().genericAbilities());
        playerDao.setDamageAbilities(playerIn.getRace().damageAbilities());
        playerDao.setLanguages(playerIn.getRace().languages());
        playerDao.setProficiencies(playerIn.getRace().proficiencies());
        playerRepository.save(playerDao);
    }

    public PlayerDao getPlayerById(Long id) {
        Optional<PlayerDao> player = playerRepository.findById(id);
        return player.orElseThrow(() -> new RuntimeException("Player not found"));
    }

    public void updatePlayer(Long id, PlayerIn playerIn) {
        PlayerDao playerDao = getPlayerById(id); // This will throw if the player doesn't exist
        playerDao.setName(playerIn.getName());
        playerRepository.save(playerDao);
    }

    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
