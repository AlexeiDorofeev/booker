package com.doro.booker.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
@Data
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Date publicationDate;
    private String ISBN;

    @ManyToMany
    @JoinTable(name = "magazine_author", joinColumns = @JoinColumn(name = "magazine_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;
}
