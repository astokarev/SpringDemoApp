package com.example.springdemoapp.repository;

import com.example.springdemoapp.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
