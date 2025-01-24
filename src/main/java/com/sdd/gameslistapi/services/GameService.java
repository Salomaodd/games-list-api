package com.sdd.gameslistapi.services;

import com.sdd.gameslistapi.gamedto.GameDTO;
import com.sdd.gameslistapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> getAllGames() {
     var result = gameRepository.findAll();
     return result.stream().map(GameDTO::new).toList();
    }

}
