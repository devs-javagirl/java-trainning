package com.facade.java.model;

public class DeliveryByCar implements DeliveryTransport {

  @Override
  public String delivery(PackageInfo packageInfo) {
    String message = "Delivery using car. " + packageInfo;
    System.out.println(message);
    return message;
  }
}
