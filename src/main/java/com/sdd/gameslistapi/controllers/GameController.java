package com.sdd.gameslistapi.controllers;

import com.sdd.gameslistapi.gamedto.GameDTO;
import com.sdd.gameslistapi.gamedto.GameListDTO;
import com.sdd.gameslistapi.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping(value = "/{id}")
    public Optional<GameDTO> getGameById(@PathVariable Long id) {
        return gameService.getGameById(id);
    }
}
