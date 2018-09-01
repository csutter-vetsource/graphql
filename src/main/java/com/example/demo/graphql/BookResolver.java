package com.example.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
class BookResolver implements GraphQLResolver<Book> /* This class is a resolver for the Book "Data Class" */ {


    public Author author(Book book) {
        return new Author(1, "Hello");
    }

}