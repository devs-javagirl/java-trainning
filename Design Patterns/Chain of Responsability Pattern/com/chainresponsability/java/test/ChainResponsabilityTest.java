package com.chainresponsability.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.chainresponsability.java.enumeration.DiscountType;
import com.chainresponsability.java.enumeration.PaymentType;
import com.chainresponsability.java.model.Order;
import com.chainresponsability.java.model.OrderItem;
import com.chainresponsability.java.service.discount.Discount;
import com.chainresponsability.java.service.discount.DiscountPackage;
import com.chainresponsability.java.service.discount.DiscountPixPayment;
import com.chainresponsability.java.service.discount.DiscountPremiumCustomer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ChainResponsabilityTest {

  @Test
  void whenOrderWithAllDiscountsThenCalculateTotalPriceWithAllDiscounts(){

    Order order = getOrderWithThreeBooks(50, 50, 50);
    order.setPaymentType(PaymentType.PIX);
    setDiscountChain(order);

    printDiscounts(order);

    assertEquals(order.getTotalWithDiscount(), 127.5);
    assertEquals(order.getDiscounts().size(), 3);

  }

  @Test
  void whenOrderWithTwoBooksWithMoreThan100ThenGivePremiumCustomerDiscount(){
    Order order = getOrderWithTwoBooks(50, 50);
    order.setPaymentType(PaymentType.CREDIT_CARD);
    setDiscountChain(order);

    printDiscounts(order);

    assertEquals(order.getTotalWithDiscount(), 95);
    assertEquals(order.getDiscounts().size(), 1);

  }

  @Test
  void whenOrderWithThreeBooksUnder100TotalThenGivePackageDiscount(){
    Order order = getOrderWithThreeBooks(15, 15, 15);
    setDiscountChain(order);

    printDiscounts(order);

    assertEquals(order.getTotalWithDiscount(), 42.75);
    assertEquals(order.getDiscounts().size(), 1);

  }

  @Test
  void whenPaymentWithPixThenGivePixPaymentDiscount(){
    Order order = getOrderWithTwoBooks(20, 20);
    order.setPaymentType(PaymentType.PIX);
    setDiscountChain(order);

    printDiscounts(order);

    assertEquals(order.getTotalWithDiscount(), 38);
    assertEquals(order.getDiscounts().size(), 1);
  }

  @Test
  void whenOrderHasNoDiscountsThenTotalIsEqualTotalWithDiscount(){
    Order order = getOrderWithTwoBooks(20, 20);
    setDiscountChain(order);

    printDiscounts(order);

    assertEquals(order.getTotalWithDiscount(), order.getTotal());
    assertEquals(order.getDiscounts().size(), 0);
  }

  private void printDiscounts(Order order){
    order.getDiscounts().stream()
        .map(DiscountType::getDiscountRule)
        .forEach(System.out::println);
  }

  private Order getOrderWithThreeBooks(double firstPrice, double secondPrice, double thirdPrice) {
    Order order = new Order();
    order.setDate(Calendar.getInstance());

    List<OrderItem> items = new ArrayList<>();
    items.add(new OrderItem("Lord of the rings", firstPrice));
    items.add(new OrderItem("Narnia", secondPrice));
    items.add(new OrderItem("Harry Potter", thirdPrice));
    order.setOrderItens(items);

    return order;
  }

  private Order getOrderWithTwoBooks(double firstPrice, double secondPrice) {
    Order order = new Order();
    order.setDate(Calendar.getInstance());

    List<OrderItem> items = new ArrayList<>();
    items.add(new OrderItem("Lord of the rings", firstPrice));
    items.add(new OrderItem("Narnia", secondPrice));

    order.setOrderItens(items);

    return order;
  }

  private void setDiscountChain(Order order){
    Discount discountPackage = new DiscountPackage();
    Discount discountPremiumCustomer = new DiscountPremiumCustomer();
    Discount discountPixPayment = new DiscountPixPayment();

    discountPackage.setNext(discountPremiumCustomer);
    discountPremiumCustomer.setNext(discountPixPayment);

    discountPackage.applyDiscount(order);

  }
}
