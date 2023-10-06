package com.abstractfactory.java.factory;


import com.abstractfactory.java.model.certificate.BrazilianCertificate;
import com.abstractfactory.java.model.certificate.Certificate;
import com.abstractfactory.java.model.packing.BrazilianPacking;
import com.abstractfactory.java.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
