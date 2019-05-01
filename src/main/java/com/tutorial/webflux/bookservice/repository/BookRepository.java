package com.tutorial.webflux.bookservice.repository;

import com.tutorial.webflux.bookservice.model.Book;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookRepository  extends ReactiveMongoRepository<Book , String> {
}
