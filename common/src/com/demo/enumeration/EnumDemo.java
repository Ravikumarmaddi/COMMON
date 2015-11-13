package com.demo.enumeration;

public class EnumDemo {
	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}

	Company cName;

	public EnumDemo(Company cName) {
		this.cName = cName;
	}

	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
		default:
			System.out
					.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}

	public static void main(String[] args) {
		EnumDemo ebay = new EnumDemo(Company.EBAY);
		ebay.companyDetails();
		EnumDemo paypal = new EnumDemo(Company.PAYPAL);
		paypal.companyDetails();
		EnumDemo google = new EnumDemo(Company.GOOGLE);
		google.companyDetails();
		EnumDemo yahoo = new EnumDemo(Company.YAHOO);
		yahoo.companyDetails();
		EnumDemo att = new EnumDemo(Company.ATT);
		att.companyDetails();
	}
}