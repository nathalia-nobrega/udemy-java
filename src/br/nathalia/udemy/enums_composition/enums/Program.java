package br.nathalia.udemy.enums_composition.enums;

import br.nathalia.udemy.enums_composition.enums.entities.Order;
import br.nathalia.udemy.enums_composition.enums.entities.enums.OrderStatus;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1998L);
        order.setMoment(LocalDateTime.now());
        order.setOrderStatus(OrderStatus.PROCESSING);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.SHIPPED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
