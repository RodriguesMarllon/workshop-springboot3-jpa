package com.javacourseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourseudemy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
