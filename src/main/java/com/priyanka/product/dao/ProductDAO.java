package com.priyanka.product.dao;

import com.priyanka.product.dto.Product;

public interface ProductDAO {
void create(Product product);
Product read(int id);

void update(Product product);
void delte(int id);
}
