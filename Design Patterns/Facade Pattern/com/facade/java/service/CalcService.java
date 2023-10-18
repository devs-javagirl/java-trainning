package com.facade.java.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalcService {

  public double calculateVolume (double height, double width, double length){
    double area = height * width * length;
    System.out.println("area " + area);
    // arredonda o valor para 2 casas decimais
    return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }

  public double convertCubicMetersToLiters (double cubicMetersVolume) {
    System.out.println("liters " + cubicMetersVolume*1000);
    return cubicMetersVolume * 1000;
  }

}
