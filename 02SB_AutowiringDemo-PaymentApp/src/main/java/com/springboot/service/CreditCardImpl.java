package com.springboot.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CreditCardImpl implements ICreditCard {
	Scanner sc = new Scanner(System.in);

	@Override
	public double creditPay() {
		System.out.println("Enter amount to pay :");
		double amount = sc.nextDouble();
		System.out.println("-".repeat(40));
		if (amount > 0) {
			System.out.println("Payment Successful...");
		} else {
			System.out.println("Please enter a valid amount !!");
		}
		System.out.println("-".repeat(40));
		return amount;
	}

}
