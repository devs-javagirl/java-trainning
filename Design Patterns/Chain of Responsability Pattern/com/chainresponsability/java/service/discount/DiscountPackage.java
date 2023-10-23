package com.chainresponsability.java.service.discount;

import static com.chainresponsability.java.enumeration.DiscountType.PACKAGE_THREE_BOOKS;

import com.chainresponsability.java.model.Order;

public class DiscountPackage implements Discount{
  private Discount nextDiscount;

  @Override
  public void applyDiscount(Order order) {
    if (order.getOrderItens().size() >= PACKAGE_THREE_BOOKS.getAmount())
      order.getDiscounts().add(PACKAGE_THREE_BOOKS);

    if (nextDiscount != null)
        nextDiscount.applyDiscount(order);
  }

  @Override
  public void setNext(Discount discount) {
    nextDiscount = discount;
  }
}
