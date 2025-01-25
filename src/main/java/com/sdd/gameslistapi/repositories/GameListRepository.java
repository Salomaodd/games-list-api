package com.sdd.gameslistapi.repositories;

import com.sdd.gameslistapi.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
