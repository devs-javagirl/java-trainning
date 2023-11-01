package com.observer.java.model;

public class Product {
  private String description;
  private int productsInStock;

  public Product(String description, int productsInStock) {
    this.description = description;
    this.productsInStock = productsInStock;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getProductsInStock() {
    return productsInStock;
  }

  public void setProductsInStock(int productsInStock) {
    this.productsInStock = productsInStock;
  }
}
