package com.chainresponsability.java.service.discount;

import com.chainresponsability.java.model.Order;

public interface Discount {

  void applyDiscount(Order order);
  void setNext(Discount discount);
}
