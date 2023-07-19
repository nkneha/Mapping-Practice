package com.example.Mapping_practice.controller;

import com.example.Mapping_practice.model.Book;
import com.example.Mapping_practice.model.Course;
import com.example.Mapping_practice.repository.IBookRepo;
import com.example.Mapping_practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PostMapping("books")
    public void addAllBooks(@RequestBody List<Book> books){
        bookService.createAllBooks(books);
    }
    @PostMapping("book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @PutMapping("book/id/{id}")
    public String updateBookPrice(@PathVariable Long id, @RequestParam Long price){
        return bookService.updateBookPrice(id,price);

    }
    @DeleteMapping("book/id/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookDetail(id);

    }
}
