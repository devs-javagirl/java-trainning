 package com.facade.java.model;

public class PackageInfo {
  private double kilogramsWeight; // kilogram
  private double metersHeight; // meter
  private double metersWidth; // meter
  private double metersLength; // meter

  public PackageInfo(double kilogramsWeight, double metersHeight, double metersWidth, double metersLength) {
    this.kilogramsWeight = kilogramsWeight;
    this.metersHeight = metersHeight;
    this.metersWidth = metersWidth;
    this.metersLength = metersLength;
  }

  public double getKilogramsWeight() {
    return kilogramsWeight;
  }

  public void setKilogramsWeight(double kilogramsWeight) {
    this.kilogramsWeight = kilogramsWeight;
  }

  public double getMetersHeight() {
    return metersHeight;
  }

  public void setMetersHeight(double metersHeight) {
    this.metersHeight = metersHeight;
  }

  public double getMetersWidth() {
    return metersWidth;
  }

  public void setMetersWidth(double metersWidth) {
    this.metersWidth = metersWidth;
  }

  public double getMetersLength() {
    return metersLength;
  }

  public void setMetersLength(double metersLength) {
    this.metersLength = metersLength;
  }

  @Override
  public String toString() {
    return "PackageInfo -> " +
        "Weight: " + kilogramsWeight +
        ", Height: " + metersHeight +
        ", Width: " + metersWidth +
        ", Length: " + metersLength;
  }
}
