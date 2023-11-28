package com.dnd.DnDCharacterGenerator.service;

import com.dnd.DnDCharacterGenerator.controller.type.PlayerIn;
import com.dnd.DnDCharacterGenerator.persistance.PlayerDao;
import com.dnd.DnDCharacterGenerator.persistance.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public void createPlayer(PlayerIn playerIn) {
        PlayerDao playerDao = new PlayerDao();
        playerDao.setName(playerIn.getName());
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
