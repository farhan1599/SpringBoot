package com.springboot.service.restaurant;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.service.ICreditCard;
import com.springboot.service.IDebitCard;
import com.springboot.service.IUpi;

@Service
public class Restaurant {

	private IUpi upi;
	private IDebitCard debitCard;
	private ICreditCard creditCard;

	@Autowired
	public Restaurant(IUpi upi, IDebitCard debitCard, ICreditCard creditCard) {
		this.upi = upi;
		this.debitCard = debitCard;
		this.creditCard = creditCard;
	}

	public void generateBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a payment method (Debit Card/ Credit Card/ UPI)");
		String payMethod = sc.nextLine();

		switch (payMethod) {
		case "upi":

			System.out.println("Choose any one plateform (GooglePay/ PhonePay/ Paytm)");
			String plateform = sc.nextLine();

			if (plateform.equalsIgnoreCase("googlepay")) {
				double googlePay = upi.upiPay();
				if (googlePay > 0) {
					System.out.println("---Bill generated---");
					System.out.println("Amount recieved: " + googlePay + " /-");
				} else {
					System.out.println("Payment failed !!");
				}

				System.out.println("payment method: " + payMethod.toUpperCase() + "-" + plateform);

			} else if (plateform.equalsIgnoreCase("phonepay")) {
				double phonePay = upi.upiPay();
				if (phonePay > 0) {
					System.out.println("---Bill generated---");
					System.out.println("Amount recieved: " + phonePay + " /-");
				} else {
					System.out.println("Payment failed !!");
				}

				System.out.println("payment method: " + payMethod.toUpperCase() + "-" + plateform);

			} else if (plateform.equalsIgnoreCase("paytm")) {
				double paytm = upi.upiPay();
				if (paytm > 0) {
					System.out.println("---Bill generated---");
					System.out.println("Amount recieved: " + paytm + " /-");
				} else {
					System.out.println("Payment failed !!");
				}

				System.out.println("payment method: " + payMethod.toUpperCase() + "-" + plateform);
			}

			else {
				System.out.println("Please choose a valid plateform !!");

			}
			break;

		case "debit card":
			double debitPay = debitCard.debitPay();
			if (debitPay > 0) {
				System.out.println("---Bill generated---");
				System.out.println("Amount recieved: " + debitPay + " /-");

			} else {
				System.out.println("Payment failed !!");
			}

			System.out.println("payment method: " + payMethod.toUpperCase());
			break;

		case "credit card":
			double creditPay = creditCard.creditPay();
			if (creditPay > 0) {
				System.out.println("---Bill generated---");
				System.out.println("Amount recieved: " + creditPay + " /-");

			} else {
				System.out.println("Payment failed !!");
			}

			System.out.println("payment method: " + payMethod.toUpperCase());
			break;
		default:
			System.out.println("Please choose a valid payment method !!");
		}

		/*
		 * if (payMethod.equalsIgnoreCase("upi")) {
		 * System.out.println("Choose any one plateform (GooglePay/ PhonePay/ Paytm)");
		 * String plateform = sc.nextLine();
		 * 
		 * if (plateform.equalsIgnoreCase("googlepay")) { double googlePay =
		 * upi.googlePay(); if (googlePay > 0) {
		 * System.out.println("---Bill generated---");
		 * System.out.println("Amount recieved: " + googlePay + " /-"); } else {
		 * System.out.println("Payment failed !!"); }
		 * System.out.println("payment method: " + payMethod.toUpperCase() + "-"
		 * +plateform); } else if (plateform.equalsIgnoreCase("phonepay")) {
		 * upi.phonePay(); System.out.println("payment method: " +
		 * payMethod.toUpperCase() + "-"+ plateform); } else if
		 * (plateform.equalsIgnoreCase("paytm")) { upi.paytm();
		 * System.out.println("payment method: " + payMethod.toUpperCase() + "-"
		 * +plateform); } else {
		 * System.out.println("Please choose a valid plateform !!"); } } else if
		 * (payMethod.equalsIgnoreCase("debit card")) { debitCard.debitPay();
		 * System.out.println("payment method: " + payMethod.toUpperCase()); } else if
		 * (payMethod.equalsIgnoreCase("credit card")) { creditCard.creditPay();
		 * System.out.println("payment method: " + payMethod.toUpperCase());
		 * 
		 * } else { System.out.println("Choose a valid payment method !!"); }
		 */
	}
}
