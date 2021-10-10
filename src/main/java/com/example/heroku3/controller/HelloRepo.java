package com.example.heroku3.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepo extends JpaRepository<Hello, Long> {
}
