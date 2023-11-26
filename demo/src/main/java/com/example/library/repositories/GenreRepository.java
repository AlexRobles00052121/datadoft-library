package com.example.library.repositories;

import com.example.library.models.GenreModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<GenreModel, Long> {
}
