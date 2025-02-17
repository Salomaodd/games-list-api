package com.sdd.gameslistapi.gamedto;

import com.sdd.gameslistapi.entities.Game;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {}

    public GameDTO(Game game) {
        id = game.getId();
        title = game.getTitle();
        genre = game.getGenre();
        year = game.getYear();
        platforms = game.getPlatforms();
        score = game.getScore();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
        longDescription = game.getLongDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public Double getScore() {
        return score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
