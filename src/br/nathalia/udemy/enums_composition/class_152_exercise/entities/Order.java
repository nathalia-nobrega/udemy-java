package br.nathalia.udemy.enums_composition.class_152_exercise.entities;

import br.nathalia.udemy.enums_composition.class_152_exercise.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();
    private LocalDateTime moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        return items.stream().mapToDouble(OrderItem::subTotal).sum();
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ORDER SUMMARY: " +
                "Order moment: " + getMoment() +
                "Order status: " + getStatus();
    }
}
