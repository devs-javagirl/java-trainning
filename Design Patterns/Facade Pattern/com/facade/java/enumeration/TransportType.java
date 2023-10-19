package com.facade.java.enumeration;

public enum TransportType {
  BICYCLE(30),
  CAR(350),
  TRUCK(800);

  private final double maximumVolume;

  TransportType (double maximumVolume){
    this.maximumVolume = maximumVolume;

  }

  public double getMaximumVolume() {
    return maximumVolume;
  }

}
