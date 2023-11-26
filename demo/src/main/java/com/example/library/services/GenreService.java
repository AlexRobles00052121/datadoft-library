package com.example.library.services;

import com.example.library.models.GenreModel;
import com.example.library.models.UserModel;
import com.example.library.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    GenreRepository genreRepository;

    public ArrayList<GenreModel> obtainGenre(){
        return (ArrayList<GenreModel>) genreRepository.findAll();
    }

    public GenreModel saveGenre(GenreModel genre){
        return genreRepository.save(genre);
    }

    public Optional<GenreModel> obtainById(Long id){
        return genreRepository.findById(id);
    }

    public boolean deleteGenre(Long id){
        try {
            genreRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
