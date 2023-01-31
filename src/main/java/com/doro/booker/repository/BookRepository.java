package com.doro.booker.repository;

import com.doro.booker.entity.Author;
import com.doro.booker.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByIsbn(String isbn);
    List<Book> findByAuthors(Author author);
    List<Book> findAllByOrderByTitleAsc();
}
