package com.example.bg.softuni.pathfinderd.repository;

import com.example.bg.softuni.pathfinderd.model.entity.Category;
import com.example.bg.softuni.pathfinderd.model.entity.enums.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category> findByName(CategoryNameEnum categoryNameEnum);
}
