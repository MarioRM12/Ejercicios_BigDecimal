package org.iesvdm.OnlineShop;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {

    private static Integer contador = 0;
    private Integer id;
    private LocalDate paid;
    private BigDecimal total;
    private String details;

    public Payment(LocalDate paid, BigDecimal total, String details) {
        this.id = contador++;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getPaid() {
        return paid;
    }

    public void setPaid(LocalDate paid) {
        this.paid = paid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
