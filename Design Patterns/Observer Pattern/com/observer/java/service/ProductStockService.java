package com.observer.java.service;

import com.observer.java.subject.Subject;
import com.observer.java.model.Product;

public class ProductStockService {
  Product product;
  Subject subject;

  public ProductStockService (Product product, Subject subject){
    this.product = product;
    this.subject = subject;

  }

  public void addProductsToStock(int productsToAdd) {
    if (product.getProductsInStock() == 0)
      if (productsToAdd > 0)
          subject.postMessage("Available product NOW ! Buy " + product.getDescription() + "!");
  }
}
