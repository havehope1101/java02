package com.ltp.globalsuperstore;


import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

public class Store {
    private String Category;
    private Double Price;
    private String name;
    private Double Discount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;


    public Store() {
    }


    public String getCategory() {
        return this.Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Double getPrice() {
        return this.Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDiscount() {
        return this.Discount;
    }

    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Store(String Category, Double Price, String name, Double Discount, Date date) {
        this.Category = Category;
        this.Price = Price;
        this.name = name;
        this.Discount = Discount;
        this.date = date;
    }


}
