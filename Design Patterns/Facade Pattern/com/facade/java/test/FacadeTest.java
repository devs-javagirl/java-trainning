package com.facade.java.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.facade.java.model.PackageInfo;
import com.facade.java.service.ManageDelivery;
import org.junit.jupiter.api.Test;

public class FacadeTest {
  PackageInfo packageInfo;
  ManageDelivery manageDelivery;

  @Test
  void whenVolumeInLitersLessThan30ThenDeliverByBike(){
    packageInfo = new PackageInfo(0.5, 0.30, 0.25, 0.40);
    manageDelivery = new ManageDelivery();
    assertTrue(manageDelivery.deliverPackage(packageInfo).contains("bicycle"));

  }

  @Test
  void whenVolumeInLitersMoreThan30AndLessThan305ThenDeliverByCar(){
    packageInfo = new PackageInfo(2.5, 0.30, 0.75, 0.80);
    manageDelivery = new ManageDelivery();
    assertTrue(manageDelivery.deliverPackage(packageInfo).contains("car"));

  }

  @Test
  void whenVolumeInLitersMoreThan350AndLessThan800ThenDeliverByTruck(){
    packageInfo = new PackageInfo(75, 0.50, 0.75, 1.5);
    manageDelivery = new ManageDelivery();
    assertTrue(manageDelivery.deliverPackage(packageInfo).contains("truck"));

  }

  @Test
  void whenVolumeExceedsAllTranportTypes(){
    packageInfo = new PackageInfo(2.75, 1.30, 2.10, 1.5);
    manageDelivery = new ManageDelivery();
    assertTrue(manageDelivery.deliverPackage(packageInfo).contains("client"));
  }
}
