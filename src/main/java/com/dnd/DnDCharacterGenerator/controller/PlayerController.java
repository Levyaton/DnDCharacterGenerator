package com.dnd.DnDCharacterGenerator.controller;

import com.dnd.DnDCharacterGenerator.controller.type.PlayerIn;
import com.dnd.DnDCharacterGenerator.service.PlayerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public ResponseEntity<String> createPlayer(@RequestBody PlayerIn player) throws JsonProcessingException {
        playerService.createPlayer(player);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getPlayer(@PathVariable Long id) throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(playerService.getPlayerById(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePlayer(@PathVariable Long id, @RequestBody PlayerIn player) {
        playerService.updatePlayer(id, player);
        return ResponseEntity.ok("Success");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }
}
