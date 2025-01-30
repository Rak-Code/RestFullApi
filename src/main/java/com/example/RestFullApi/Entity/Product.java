package com.example.RestFullApi.Entity;


public class Product {
    private Long id;
    private String name;
    private double price;
    private String size;
    private String category;

    public Product(Long id, String name, double price, String size, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.category = category;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}

