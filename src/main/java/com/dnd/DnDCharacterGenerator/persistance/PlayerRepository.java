package com.dnd.DnDCharacterGenerator.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlayerRepository extends JpaRepository<PlayerDao, Long> {

}