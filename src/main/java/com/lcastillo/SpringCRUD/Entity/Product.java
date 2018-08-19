package com.lcastillo.SpringCRUD.Entity;


public class Product {
    private int id;
    private String prod_name;
    private String prod_description;
    private double prod_price;
    private int prod_quantity;
    private boolean prod_available;
    
    public Product(int id, String prod_name, String prod_description, 
                   double prod_price, int prod_quantity, boolean prod_available) {
        this.id = id;
        this.prod_name = prod_name;
        this.prod_description = prod_description;
        this.prod_price = prod_price;
        this.prod_quantity = prod_quantity;
        this.prod_available = prod_available;
    }
    
    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_description() {
        return prod_description;
    }

    public void setProd_description(String prod_description) {
        this.prod_description = prod_description;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    public int getProd_quantity() {
        return prod_quantity;
    }

    public void setProd_quantity(int prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    public boolean isProd_available() {
        return prod_available;
    }

    public void setProd_available(boolean prod_available) {
        this.prod_available = prod_available;
    }
    
    
}
