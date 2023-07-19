package com.example.Mapping_practice.repository;

import com.example.Mapping_practice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,Long> {
}
