package com.wkingdev.springoasdocs.service;

import com.wkingdev.springoasdocs.model.Book;
import com.wkingdev.springoasdocs.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;


    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    public Book getBookById(Long id) {
        Optional<Book> getBook = bookRepository.findById(id);
        if (!getBook.isPresent()) {
            return null;
        }
        return getBook.get();
    }


}
