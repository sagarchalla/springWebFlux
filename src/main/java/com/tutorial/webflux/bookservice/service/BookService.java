package com.tutorial.webflux.bookservice.service;

import com.tutorial.webflux.bookservice.model.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {
    Mono<Book> findById(String id);
    Flux<Book> findAll();
    Mono<Book> save(Book book);
    Mono<Void> deleteById(String id);
}
