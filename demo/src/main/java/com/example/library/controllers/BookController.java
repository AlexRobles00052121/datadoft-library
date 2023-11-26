package com.example.library.controllers;

import com.example.library.dto.dtoBook;
import com.example.library.models.BookModel;
import com.example.library.models.GenreModel;
import com.example.library.services.BookService;
import com.example.library.services.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    GenreService genreService;

    @GetMapping()
    public ArrayList<BookModel> obtainBook(){
        return bookService.obtainBook();
    }

    @PostMapping()
    public BookModel saveBook(@RequestBody dtoBook book){
        GenreModel genre = genreService.obtainById(book.getGenre()).get();
        BookModel bookModel = new BookModel();
        bookModel.setName(book.getName());
        bookModel.setPrice(book.getPrice());
        bookModel.setSummary(book.getSummary());
        bookModel.setStage(book.getStage());
        bookModel.setImage(book.getImage());
        bookModel.setGenre(genre);
        return this.bookService.saveBook(bookModel);
    }
    
    @GetMapping( path = "/{id}")
    public Optional<BookModel> obtainBookBYId(@PathVariable("id") Long id){
        return this.bookService.obtainById(id);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.bookService.deleteBook(id);
        if(ok){
            return "se elimino el libro" + id;
        }else {
            return "No pudo eliminar el libro" + id;
        }
    }

}
