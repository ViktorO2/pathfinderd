package com.example.bg.softuni.pathfinderd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @GetMapping("/all")
    public String allRoutes(){
        return "routes";
    }


}
