package com.abstractfactory.java.factory;

import com.abstractfactory.java.model.certificate.Certificate;
import com.abstractfactory.java.model.certificate.USCertificate;
import com.abstractfactory.java.model.packing.Packing;
import com.abstractfactory.java.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
