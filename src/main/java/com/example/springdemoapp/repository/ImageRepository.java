package com.example.springdemoapp.repository;

import com.example.springdemoapp.model.Image;
import com.example.springdemoapp.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface ImageRepository extends JpaRepository<Image, Long> {
}
