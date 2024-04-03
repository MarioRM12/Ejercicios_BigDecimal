package org.iesvdm.OnlineShop;

import java.util.Date;

public class ShoppingCart {

    Date created;

    public ShoppingCart(Date created) {
        this.created = created;

    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
