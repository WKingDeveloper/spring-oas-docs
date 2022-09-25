package com.wkingdev.springoasdocs.repository;

import com.wkingdev.springoasdocs.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
