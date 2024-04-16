package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Books;

public interface BookRepo extends JpaRepository<Books, Long> {

}
