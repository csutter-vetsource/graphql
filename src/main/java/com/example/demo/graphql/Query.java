package com.example.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public Book book(){
        return new Book(1,"War of the worlds", 1);
    }


}
