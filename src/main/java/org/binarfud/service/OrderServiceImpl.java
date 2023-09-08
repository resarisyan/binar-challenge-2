package org.binarfud.service;

import lombok.RequiredArgsConstructor;
import org.binarfud.model.Order;
import org.binarfud.model.Product;
import org.binarfud.repository.OrderRepository;

import java.util.HashMap;

@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public void addOrder(Product product, int quantity) {
        if (quantity > 0) {
            Order existingOrder = orderRepository.findOrderByProduct(product);

            if (existingOrder != null) {
                int newQuantity = existingOrder.getQty() + quantity;
                double newTotal = product.getPrice() * newQuantity;
                existingOrder.setQty(newQuantity);
                existingOrder.setTotal(newTotal);
            } else {
                double total = product.getPrice() * quantity;
                Order order = new Order();
                order.setProduct(product);
                order.setQty(quantity);
                order.setTotal(total);
                orderRepository.addOrder(order);
            }
        }
    }

    @Override
    public HashMap<Integer, Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @Override
    public Double getTotalPriceOrders() {
        double total = 0;
        for (Order order : orderRepository.getAllOrders().values()) {
            total += order.getTotal();
        }
        return total;
    }

    @Override
    public Integer getTotalQtyOrders() {
        int total = 0;
        for (Order order : orderRepository.getAllOrders().values()) {
            total += order.getQty();
        }
        return total;
    }


}
