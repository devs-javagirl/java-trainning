package com.facade.java.model;

public class DeliveryByBicycle implements DeliveryTransport {

  @Override
  public String delivery(PackageInfo packageInfo) {
    String message = "Delivery using bicycle. " + packageInfo;
    System.out.println(message);
    return message;
  }
}
