package org.example.catalogservice.domain;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;



public interface BookRepository {

    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);

}