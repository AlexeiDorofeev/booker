package com.doro.booker.repository;

import com.doro.booker.entity.Author;
import com.doro.booker.entity.Book;
import com.doro.booker.entity.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByBooks(Book book);
    List<Author> findByMagazines(Magazine magazine);
}
