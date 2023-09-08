package org.binarfud.repository;

import org.binarfud.model.Product;

import java.util.HashMap;

public class ProductRepositoryImpl implements ProductRepository {
    private final HashMap<Integer, Product> products = new HashMap<>();

    public HashMap<Integer, Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return products.get(id);
    }

    @Override
    public void initProduct() {
        products.put(1, (new Product(1, "Nasi Goreng", 15000.0)));
        products.put(2, (new Product(2, "Mie Goreng", 13000.0)));
        products.put(3, (new Product(3, "Nasi + Ayam", 18000.0)));
        products.put(4, (new Product(4, "Es Teh Manis", 3000.0)));
        products.put(5, (new Product(5, "Es Jeruk", 5000.0)));
    }
}
