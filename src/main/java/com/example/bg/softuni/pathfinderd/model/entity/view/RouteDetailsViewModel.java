package com.example.bg.softuni.pathfinderd.model.entity.view;

import com.example.bg.softuni.pathfinderd.model.entity.Category;
import com.example.bg.softuni.pathfinderd.model.entity.Picture;
import com.example.bg.softuni.pathfinderd.model.entity.User;
import com.example.bg.softuni.pathfinderd.model.entity.enums.LevelEnum;

import java.util.Set;

public class RouteDetailsViewModel {

    private String gpxCoordinates;
    private String description;
    private LevelEnum level;
    private String name;
    private String videoUrl;
    private Set<Picture> pictures;


    public RouteDetailsViewModel() {
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public void setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }
}
