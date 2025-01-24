package com.sdd.gameslistapi.services;

import com.sdd.gameslistapi.entities.Game;
import com.sdd.gameslistapi.gamedto.GameDTO;
import com.sdd.gameslistapi.gamedto.GameListDTO;
import com.sdd.gameslistapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameListDTO> getAllGames() {
     var result = gameRepository.findAll();
     return result.stream().map(GameListDTO::new).toList();
    }

    public Optional<GameDTO> getGameById(Long id) {
        Optional<Game> result = gameRepository.findById(id);
        return result.map(GameDTO::new);
    }

}
