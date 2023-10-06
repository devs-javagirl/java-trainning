package com.abstractfactory.java.factory;


import com.abstractfactory.java.model.certificate.Certificate;
import com.abstractfactory.java.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
