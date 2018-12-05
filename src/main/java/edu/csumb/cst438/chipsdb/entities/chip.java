package edu.csumb.cst438.chipsdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chip")
public class chip{

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private int stock;
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
    public Double getPrice(){
        return this.price;
    }
    public Integer getStock(){
        return this.stock;

    }
    public String getImageUrl(){
        return this.imageUrl;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setStock(Integer stock){
        this.stock = stock;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public boolean isInStock(int amount)
    {
        if(this.stock>=amount)
            return true;
        return false;
    }
    public boolean canPurchase(int amount)
    {
        if(isInStock(amount))
        {
            this.stock-=amount;
            return true;
        }
        return false;
    }
}