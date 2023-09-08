package org.binarfud.repository;

import org.binarfud.model.Product;

import java.util.HashMap;

public interface ProductRepository {
    HashMap<Integer, Product> getAllProducts();
    Product getProductById(int id);
    void initProduct();
}
