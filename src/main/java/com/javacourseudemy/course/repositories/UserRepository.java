package com.javacourseudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourseudemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
