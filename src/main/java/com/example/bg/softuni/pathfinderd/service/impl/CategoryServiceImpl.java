package com.example.bg.softuni.pathfinderd.service.impl;

import com.example.bg.softuni.pathfinderd.model.entity.Category;
import com.example.bg.softuni.pathfinderd.model.entity.enums.CategoryNameEnum;
import com.example.bg.softuni.pathfinderd.repository.CategoryRepository;
import com.example.bg.softuni.pathfinderd.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findCategoryByName(CategoryNameEnum categoryNameEnum) {
        return categoryRepository
                .findByName(categoryNameEnum)
                .orElse(null) ;
    }
}
