package com.chainresponsability.java.service.discount;

import com.chainresponsability.java.enumeration.DiscountType;
import com.chainresponsability.java.enumeration.PaymentType;
import com.chainresponsability.java.model.Order;

public class DiscountPixPayment implements Discount {
  Discount nextDiscount;

  @Override
  public void applyDiscount(Order order) {
    if (order.getPaymentType() == PaymentType.PIX)
      order.getDiscounts().add(DiscountType.PIX_PAYMENT);

    if (nextDiscount != null)
      nextDiscount.applyDiscount(order);

  }

  @Override
  public void setNext(Discount discount) {
    nextDiscount = discount;
  }
}
