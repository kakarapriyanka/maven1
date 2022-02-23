package com.priyanka.product.bo;

import com.priyanka.product.dto.Product;

public interface ProductIBO {
	
	void create(Product product);
	
	Product findProduct(int id);

}
