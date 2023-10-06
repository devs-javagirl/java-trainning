package com.abstractfactory.java.model.certificate;

public class BrazilianCertificate implements Certificate {
  @Override
  public String applyCertification() {
    return "\t- Calibrating Brazil rules\n\t- Applying Anatel's Stamp";
  }
}
