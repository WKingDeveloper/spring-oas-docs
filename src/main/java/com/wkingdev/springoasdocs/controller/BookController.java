package com.wkingdev.springoasdocs.controller;

import com.wkingdev.springoasdocs.model.Book;
import com.wkingdev.springoasdocs.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    List<Book> readBooks() {
        List<Book> books = bookService.getAllBooks();
        return books;
    }

    @GetMapping("/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    Book readBook(@PathVariable(value = "id")Long bookId) {
        Book book = bookService.getBookById(bookId);
        return book;
    }

}
