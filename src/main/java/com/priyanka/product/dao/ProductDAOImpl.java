package com.priyanka.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.priyanka.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer,Product> products=new HashMap<>();

	@Override
	public void create(Product product) {
     products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delte(int id) {
		// TODO Auto-generated method stub

	}

}
