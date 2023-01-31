package com.doro.booker.repository;

import com.doro.booker.entity.Author;
import com.doro.booker.entity.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Long> {
    Magazine findByIsbn(String isbn);
    List<Magazine> findByAuthors(Author author);
    List<Magazine> findAllByOrderByTitleAsc();
}
