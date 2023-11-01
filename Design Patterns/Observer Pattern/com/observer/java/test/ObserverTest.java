package com.observer.java.test;

import com.observer.java.model.Product;
import com.observer.java.observer.ClientProductObserver;
import com.observer.java.observer.Observer;
import com.observer.java.subject.ProductOutOfStockSubject;
import com.observer.java.service.ProductStockService;
import com.observer.java.subject.Subject;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ObserverTest {

  @Test
  void whenProductOutOfStockThenAddStockAndNotifyObservers(){

    Product product = new Product("Java Effective book", 0);

    Subject productOutOfStock = new ProductOutOfStockSubject();
    List<Observer> observers = getObservers();
    registerObservers(productOutOfStock, observers);

    ProductStockService productStockService = new ProductStockService(product, productOutOfStock);

    productStockService.addProductsToStock(2);

    // Check console for notification messages

  }

  List<Observer> getObservers(){
    List<Observer> observers = new ArrayList<>();

    //Create observers
    for (int i = 1; i <= 3; i++) {
      observers.add(new ClientProductObserver("email" + i + "@gmail.com"));
    }

    return observers;

  }

  void registerObservers(Subject subject, List<Observer> observers){
    //Register observers to Subject (productOutOfStock)
    for (Observer observer : observers) {
      subject.register(observer);
      observer.setSubject(subject);
    }
  }
}
