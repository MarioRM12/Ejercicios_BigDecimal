package org.iesvdm.haversine;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanciaUtilTest {

    @Test
    public void testDistanciaKm() {
        Posicion igualada = new Posicion(new BigDecimal("41.57879"), new BigDecimal("1.617221"));
        Posicion granada = new Posicion(new BigDecimal("37.176487"), new BigDecimal("-3.597929"));

        BigDecimal distancia = DistanciaUtil.distanciaKm(igualada, granada);
        BigDecimal expectedDistancia = new BigDecimal("664.0");

        assertEquals(expectedDistancia, distancia.setScale(1, BigDecimal.ROUND_HALF_EVEN));
    }
}


