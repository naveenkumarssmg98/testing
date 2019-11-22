package com.polymorphism;

public class MainClass1 {
	public static void main(String[] args) {
		Bank bank;
		bank = new SBI();
		System.out.println(bank.rateOfInterest());
		bank = new CanaraBank();
		double rate= bank.rateOfInterest();
		System.out.println(rate);
		bank = new ICICI();
		System.out.println(bank.rateOfInterest());
		bank = new SBIInTouch();
		System.out.println(bank.rateOfInterest());
		
	}

}
