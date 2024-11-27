package com.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao implements IProduct {

	@Override
	public void saveProduct() {

		// JPA logic to save
		System.out.println("Product saved...");
	}

}
