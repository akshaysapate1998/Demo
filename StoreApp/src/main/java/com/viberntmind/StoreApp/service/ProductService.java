package com.viberntmind.StoreApp.service;

import java.util.List;

import com.viberntmind.StoreApp.domain.Product;

public interface ProductService {

	public Product createProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product getProduct(Integer id);
	
	public boolean deleteProduct(Integer id);
	
	public List<Product>getallProducts();
}
