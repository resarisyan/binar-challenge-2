package org.binarfud.repository;

import org.binarfud.model.Order;
import org.binarfud.model.Product;

import java.util.HashMap;

public class OrderRepositoryImpl implements OrderRepository {
    private final HashMap<Integer, Order> orders = new HashMap<>();
    private int nextOrderId = 1;

    @Override
    public void addOrder(Order order) {
        order.setId(nextOrderId++);
        orders.put(order.getId(), order);
    }

    @Override
    public HashMap<Integer, Order> getAllOrders() {
        return orders;
    }

    @Override
    public Order getOrderById(int id) {
        return orders.get(id);
    }

    @Override
    public Order findOrderByProduct(Product product) {
        int productId = product.getId();
        if (orders.containsKey(productId)) {
            return orders.get(productId);
        }
        return null;
    }

}
