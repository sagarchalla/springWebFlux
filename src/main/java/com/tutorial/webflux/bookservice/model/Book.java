package com.tutorial.webflux.bookservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // identified as mongo db object
@Data  //
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String id;
    private String title;
    private String author;
}
