package org.iesvdm.OnlineShop;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Order {
    private static Integer contador = 0;
    private Integer number;
    private LocalDate ordered;
    private LocalDate shipped;
    private Address Ship_to;
    private OrderStatus status;
    private BigDecimal total;
    private LinkedHashSet LineItemList;

    public Order(LocalDate ordered, LocalDate shipped, Address ship_to, OrderStatus status) {
        this.number = contador++;
        this.ordered = ordered;
        this.shipped = shipped;
        Ship_to = ship_to;
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public void setOrdered(LocalDate ordered) {
        this.ordered = ordered;
    }

    public LocalDate getShipped() {
        return shipped;
    }

    public void setShipped(LocalDate shipped) {
        this.shipped = shipped;
    }

    public Address getShip_to() {
        return Ship_to;
    }

    public void setShip_to(Address ship_to) {
        Ship_to = ship_to;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
