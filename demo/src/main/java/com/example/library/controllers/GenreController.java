package com.example.library.controllers;

import com.example.library.models.GenreModel;
import com.example.library.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/genre")
public class GenreController {

    @Autowired
    GenreService genreService;

    @GetMapping()
    public ArrayList<GenreModel> obtainGenre(){
        return genreService.obtainGenre();
    }

    @PostMapping()
    public GenreModel saveGenre(@RequestBody GenreModel genre){
        return this.genreService.saveGenre(genre);
    }

    @GetMapping( path = "/{id}")
    public Optional<GenreModel> obtainGenreById(@PathVariable("id") Long id) {
        return this.genreService.obtainById(id);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.genreService.deleteGenre(id);
        if(ok){
            return "Se elimino el genero" + id;
        }else{
            return "No se puedo eliminar el genero " + id;
        }
    }
}
