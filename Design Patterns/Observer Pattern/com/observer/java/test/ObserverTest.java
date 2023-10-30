package com.observer.java.test;

import com.observer.java.model.Product;
import com.observer.java.observer.ClientProductObserver;
import com.observer.java.observer.Observer;
import com.observer.java.subject.ProductOutOfStockSubject;
import com.observer.java.service.ProductStockService;
import com.observer.java.subject.Subject;
import java.util.ArrayList;
import java.util.List;

public class ObserverTest {
  public static void main(String[] args) {
    //Create a subject
    Product product = new Product("Java Effective book", 0);

    Subject productOutOfStock = new ProductOutOfStockSubject();
    List<Observer> observers = new ArrayList<>(4);
    //Create observers
    for (int i = 1; i <= 3; i++) {
      observers.add(new ClientProductObserver("email" + i + "@gmail.com"));
    }

    //Register observers to Subject (productOutOfStock)
    for (Observer observer : observers) {
      productOutOfStock.register(observer);
      observer.setSubject(productOutOfStock);
    }

    ProductStockService productStockService = new ProductStockService(product, productOutOfStock);

    //check for an update
    observers.get(0).update();
    observers.get(0).update("hi");

    productStockService.addProductsToStock(2);

    ///productOutOfStock.unregister(observers.get(0));
    //post a message on topic and get all the observers notified.
    ///productOutOfStock.postMessage("Buy it now !");

    observers.get(0).update("has the book arrived ?");
  }
}
