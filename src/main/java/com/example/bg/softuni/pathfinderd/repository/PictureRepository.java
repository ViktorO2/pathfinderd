package com.example.bg.softuni.pathfinderd.repository;

import com.example.bg.softuni.pathfinderd.model.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PictureRepository extends JpaRepository<Picture,Long> {
    @Query("SELECT p.url from Picture p")
    List<String> findAllUrls();
}
