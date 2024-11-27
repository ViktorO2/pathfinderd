package com.example.bg.softuni.pathfinderd.model.entity.view;

import com.example.bg.softuni.pathfinderd.model.entity.enums.LevelEnum;

public class RouteViewModel {

    private Long id;
    private String name;



    private String description;
    private LevelEnum level;
    private String pictureUrl;

    public RouteViewModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
