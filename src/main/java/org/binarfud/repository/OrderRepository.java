package org.binarfud.repository;

import org.binarfud.model.Order;
import org.binarfud.model.Product;

import java.util.HashMap;

public interface OrderRepository {
    void addOrder(Order order);

    Order getOrderById(int id);

    HashMap<Integer, Order> getAllOrders();

    Order findOrderByProduct(Product product);
}
