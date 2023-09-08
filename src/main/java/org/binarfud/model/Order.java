package org.binarfud.model;

import lombok.*;

@Getter
@Setter
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Order {
    private int id;
    private Product product;
    private int qty;
    private double total;

    public double calculateTotalPrice() {
        return product.getPrice() * qty;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t %d\t\t %.2f", product.getName(), qty, calculateTotalPrice());
    }
}
