package com.facade.java.service;

import com.facade.java.enumeration.TransportType;
import com.facade.java.model.DeliveryByBicycle;
import com.facade.java.model.DeliveryByCar;
import com.facade.java.model.DeliveryByTruck;
import com.facade.java.model.PackageInfo;

public class ManageDelivery {
  CalcService calcService;

  public String deliverPackage (PackageInfo packageInfo) {
    calcService = new CalcService();

    double packageVolume = calcService.calculateVolume(packageInfo.getMetersHeight(),
        packageInfo.getMetersWidth(), packageInfo.getMetersLength());

    double packageVolumeInLiters = calcService.convertCubicMetersToLiters(packageVolume);

    if (packageVolumeInLiters <= TransportType.BICYCLE.getMaximumVolume())
      return new DeliveryByBicycle().delivery(packageInfo);
    else if (packageVolumeInLiters <= TransportType.CAR.getMaximumVolume())
      return new DeliveryByCar().delivery(packageInfo);
    else if (packageVolumeInLiters <= TransportType.TRUCK.getMaximumVolume())
      return new DeliveryByTruck().delivery(packageInfo);
    else
      return "Package volume exceeds all tranport types. Please, contact the client !";

  }
}
