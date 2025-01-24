package com.sdd.gameslistapi.repositories;

import com.sdd.gameslistapi.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
