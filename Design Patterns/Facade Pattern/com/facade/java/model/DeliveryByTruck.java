package com.facade.java.model;

public class DeliveryByTruck implements DeliveryTransport{

  @Override
  public String delivery(PackageInfo packageInfo) {
    String message = "Delivery using truck. " + packageInfo;
    System.out.println(message);
    return message;
  }
}
