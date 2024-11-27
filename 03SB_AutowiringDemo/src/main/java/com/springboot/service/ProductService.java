package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.IProduct;

@Service
public class ProductService {

	IProduct product;

	// setter injection
	@Autowired
	public void setProduct(IProduct product) {
		this.product = product;
	}

	public void saveProduct() {
		product.saveProduct();

	}

}
