package com.example.Mapping_practice.service;

import com.example.Mapping_practice.model.Book;
import com.example.Mapping_practice.model.Course;
import com.example.Mapping_practice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void createAllBooks(List<Book> books) {
        bookRepo.saveAll(books);
    }

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public String updateBookPrice(Long id, Long price) {
        Optional<Book> bookDetails=bookRepo.findById(id);
        Book myBook = null;
        if(bookDetails.isPresent())
        {
            myBook = bookDetails.get();
        }
        else {
            return "Id not Found!!!";
        }
        myBook.setPrice(price);
        bookRepo.save(myBook);
        return "Book Price updated";
    }

    public String deleteBookDetail(Long id) {
        bookRepo.deleteById(id);
        return "Book deleted successfully";
    }
}
