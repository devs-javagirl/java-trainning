package com.abstractfactory.java.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.abstractfactory.java.factory.BrazilianRulesAbstractFactory;
import com.abstractfactory.java.factory.CountryRulesAbstractFactory;
import com.abstractfactory.java.factory.USRulesAbstractFactory;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

  @Test
  void whenInstantiateBrazilRulesReturnCertificateAndPackInBrazil(){
    String match = "Brazil";
    CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
    assertTrue(rules.getCertificates().applyCertification().contains(match));
    assertTrue(rules.getPacking().pack().contains(match));

  }

  @Test
  void whenInstantiateUSRulesReturnCertificateAndPackInUS(){
    String match = "US";
    CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
    assertTrue(rules.getCertificates().applyCertification().contains(match));
    assertTrue(rules.getPacking().pack().contains(match));

  }

}
