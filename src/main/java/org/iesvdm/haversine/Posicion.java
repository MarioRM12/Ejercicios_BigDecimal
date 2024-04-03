package org.iesvdm.haversine;

import java.math.BigDecimal;

public class Posicion {
    private BigDecimal latitud;
    private BigDecimal longitud;

    public Posicion(BigDecimal latitud, BigDecimal longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }
}


