package com.example.bg.softuni.pathfinderd.service;

import com.example.bg.softuni.pathfinderd.model.entity.Category;
import com.example.bg.softuni.pathfinderd.model.entity.enums.CategoryNameEnum;

import java.util.Optional;

public interface CategoryService {
    Category findCategoryByName(CategoryNameEnum categoryNameEnum);
}
