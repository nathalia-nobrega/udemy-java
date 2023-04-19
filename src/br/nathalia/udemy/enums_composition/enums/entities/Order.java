package br.nathalia.udemy.enums_composition.enums.entities;

import br.nathalia.udemy.enums_composition.enums.entities.enums.OrderStatus;

import java.time.LocalDateTime;

public class Order {
    private Long id;
    private LocalDateTime moment;
    private OrderStatus orderStatus;

    public Order() {
    }

    public Order(Long id, LocalDateTime moment, OrderStatus orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", orderStatus=" + orderStatus +
                '}';
    }
}


