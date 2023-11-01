package com.chainresponsability.java.enumeration;

public enum DiscountType {
  PACKAGE_THREE_BOOKS("5% de desconto na compra de 3 livros", 5.0, 3.0),
  PIX_PAYMENT("Desconto de 5% para pagamentos com PIX", 5.0, 0.0),
  PREMIUM_CUSTOMER("Desconto de 5% para compras acima de 100 reais", 5.0, 100.0);

  private final String discountRule;
  private final double discountPercentage;
  private final double amount;

  DiscountType(String discountRule, double discountPercentage, double amount){
    this.discountRule = discountRule;
    this.discountPercentage = discountPercentage;
    this.amount = amount;
  }

  public String getDiscountRule() {
    return discountRule;
  }

  public double getDiscountPercentage() {
    return discountPercentage;
  }

  public double getAmount() {
    return amount;
  }
}
