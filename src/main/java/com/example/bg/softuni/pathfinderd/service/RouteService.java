package com.example.bg.softuni.pathfinderd.service;

import com.example.bg.softuni.pathfinderd.model.entity.service.RouteServiceModel;
import com.example.bg.softuni.pathfinderd.model.entity.view.RouteDetailsViewModel;
import com.example.bg.softuni.pathfinderd.model.entity.view.RouteViewModel;

import java.util.List;

public interface RouteService {
    List<RouteViewModel> findAllRoutesView();

    void addNewRoute(RouteServiceModel routeServiceModel);

    RouteDetailsViewModel findRouteById(Long id);

}
