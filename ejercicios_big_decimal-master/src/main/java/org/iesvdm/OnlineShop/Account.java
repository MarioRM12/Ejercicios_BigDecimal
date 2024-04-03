package org.iesvdm.OnlineShop;

import java.time.LocalDate;

public class Account {
    private Integer id;
    private Address billing_address;
    private Boolean is_closed;
    private LocalDate open;
    private Customer customer;

    public Account(Address billing_address, Boolean is_closed, LocalDate open, Customer customer) {
        this.id = this.customer.getId();
        this.billing_address = billing_address;
        this.is_closed = is_closed;
        this.open = open;
        this.customer = customer;
    }

    public Address getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(Address billing_address) {
        this.billing_address = billing_address;
    }

    public Boolean getIs_closed() {
        return is_closed;
    }

    public void setIs_closed(Boolean is_closed) {
        this.is_closed = is_closed;
    }

    public LocalDate getOpen() {
        return open;
    }

    public void setOpen(LocalDate open) {
        this.open = open;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

