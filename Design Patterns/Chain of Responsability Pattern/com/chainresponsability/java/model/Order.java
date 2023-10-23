package com.chainresponsability.java.model;

import com.chainresponsability.java.enumeration.DiscountType;
import com.chainresponsability.java.enumeration.PaymentType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order {
  private Calendar date;
  private double total;
  private double totalWithDiscount;
  private PaymentType paymentType;
  private List<OrderItem> orderItems = new ArrayList<>();
  private List<DiscountType> discounts = new ArrayList<>();

  public Calendar getDate() {
    return date;
  }

  public void setDate(Calendar date) {
    this.date = date;
  }

  public double getTotal() {
    return orderItems.stream()
        .map(item -> item.getPrice())
        .reduce(0.0, Double::sum);
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getTotalWithDiscount() {
    double total = getTotal();

    double totalDiscount = discounts.stream()
        .map(item -> (item.getDiscountPercentage()/100) * total)
        .reduce(0.0, Double::sum);

    return total - totalDiscount;
  }

  public void setTotalWithDiscount(double totalWithDiscount) {
    this.totalWithDiscount = totalWithDiscount;
  }

  public PaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public List<OrderItem> getOrderItens() {
    return orderItems;
  }

  public void setOrderItens(List<OrderItem> orderItens) {
    this.orderItems = orderItens;
  }

  public List<DiscountType> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<DiscountType> discounts) {
    this.discounts = discounts;
  }
}
