package com.priyanka.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.priyanka.product.dto.Product;

public class ProductDAOImplTest2 {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao=new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Its awesome");
		product.setPrice(800);
		
		dao.create(product);
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("Iphone",result.getName());
	}

}
