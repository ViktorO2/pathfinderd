package com.example.bg.softuni.pathfinderd.service.impl;

import com.example.bg.softuni.pathfinderd.model.entity.Category;
import com.example.bg.softuni.pathfinderd.model.entity.Route;
import com.example.bg.softuni.pathfinderd.model.entity.service.RouteServiceModel;
import com.example.bg.softuni.pathfinderd.model.entity.view.RouteDetailsViewModel;
import com.example.bg.softuni.pathfinderd.model.entity.view.RouteViewModel;
import com.example.bg.softuni.pathfinderd.repository.RouteRepository;
import com.example.bg.softuni.pathfinderd.service.CategoryService;
import com.example.bg.softuni.pathfinderd.service.RouteService;
import com.example.bg.softuni.pathfinderd.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {
   private final RouteRepository routeRepository;
   private final UserService userService;
   private final CategoryService categoryService;
   private final ModelMapper modelMapper;

    public RouteServiceImpl(RouteRepository routeRepository, UserService userService, CategoryService categoryService, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.userService = userService;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RouteViewModel> findAllRoutesView() {
        return routeRepository
                .findAll()
                .stream()
                .map(route -> {
                    RouteViewModel routeViewModel=modelMapper.map(route,RouteViewModel.class);
                    if (route.getPictures().isEmpty()){
                        routeViewModel.setPictureUrl("/images/pic4.jpg");
                    }else{
                        routeViewModel.setPictureUrl(route.getPictures().stream().findFirst().get().getUrl());
                    }

                    return routeViewModel;
                }).collect(Collectors.toList());
    }

    @Override
    public void addNewRoute(RouteServiceModel routeServiceModel) {
        Route route=modelMapper.map(routeServiceModel, Route.class);
        route.setAuthor(userService.findCurrentLoginUserEntity());
        route.setCategories(routeServiceModel
                .getCategories()
                .stream()
                .map(categoryService::findCategoryByName)
                .collect(Collectors.toSet()));


        routeRepository.save(route);
    }

    @Override
    public RouteDetailsViewModel findRouteById(Long id) {
        return routeRepository.findById(id)
                .map(route -> modelMapper.map(route,RouteDetailsViewModel.class))
                .orElse(null);
    }
}
