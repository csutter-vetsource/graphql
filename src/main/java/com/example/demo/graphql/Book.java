package com.example.demo.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Book {
    private int id;
    private String name;
    private int authorId;

    public boolean isInStock(int storeId){
        return false;
    }

}