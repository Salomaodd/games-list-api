package com.sdd.gameslistapi.controllers;

import com.sdd.gameslistapi.gamedto.GameListDTO;
import com.sdd.gameslistapi.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> getAllLists() {
        return gameListService.findAll();
    }
}
