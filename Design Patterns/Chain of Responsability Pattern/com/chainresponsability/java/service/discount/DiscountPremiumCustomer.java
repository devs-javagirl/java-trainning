package com.chainresponsability.java.service.discount;

import com.chainresponsability.java.enumeration.DiscountType;
import com.chainresponsability.java.model.Order;

public class DiscountPremiumCustomer implements Discount {
  private Discount nextDiscount;

  @Override
  public void applyDiscount(Order order) {
    if (order.getTotalWithDiscount() >= DiscountType.PREMIUM_CUSTOMER.getAmount())
      order.getDiscounts().add(DiscountType.PREMIUM_CUSTOMER);

    if (nextDiscount != null)
      nextDiscount.applyDiscount(order);
  }

  @Override
  public void setNext(Discount discount) {
    nextDiscount = discount;
  }
}
