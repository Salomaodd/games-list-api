package com.sdd.gameslistapi.services;

import com.sdd.gameslistapi.entities.GameList;
import com.sdd.gameslistapi.gamedto.GameListDTO;
import com.sdd.gameslistapi.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
