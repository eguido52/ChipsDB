package edu.csumb.cst438.chipsdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chip")
public class chip{

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String imageUrl;
 
    public chip(String name, String description, Double price, Integer stock, String imageUrl){
        //TODO: Correct names
        this.name = name;
        //TODO: add description
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.imageUrl = imageUrl;
    }

    public String getId(){
        return this.id;
    }

    public String getDescription(){
        return this.description;
    }

    public String getName(){
        return this.name;
    }

    public Integer getStock(){
        return this.stock;

    }

    public Double getPrice(){
        return this.price;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }
}