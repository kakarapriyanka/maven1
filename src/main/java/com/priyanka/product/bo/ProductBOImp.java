package com.priyanka.product.bo;

import com.priyanka.product.dao.ProductDAO;
import com.priyanka.product.dao.ProductDAOImpl;
import com.priyanka.product.dto.Product;

public class ProductBOImp implements ProductIBO {
	
	private static ProductDAO dao=new ProductDAOImpl();

	@Override
	public void create(Product product) {
     dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
