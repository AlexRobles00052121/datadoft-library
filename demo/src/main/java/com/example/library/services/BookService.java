package com.example.library.services;

import com.example.library.models.BookModel;
import com.example.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public ArrayList<BookModel> obtainBook(){
        return (ArrayList<BookModel>) bookRepository.findAll();
    }

    public BookModel saveBook(BookModel book){
        return bookRepository.save(book);
    }

    public Optional<BookModel> obtainById(Long id){
        return bookRepository.findById(id);
    }
    public boolean deleteBook(Long id){
        try{
            bookRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
