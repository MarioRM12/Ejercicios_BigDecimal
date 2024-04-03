package org.iesvdm;

import org.iesvdm.InteresCompuesto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuestoTest {

    @Test
    public void cuandoPrincipal1000Interes5porcientoY10peridos() {

        String principal = "1000";
        BigDecimal principalBigDecimal = new BigDecimal(principal); // Convierte la cadena en un BigDecimal
        BigDecimal interes = new BigDecimal("0.05"); // La tasa de interés del 5% como decimal
        int periodos = 10;

        InteresCompuesto interesCompuesto = new InteresCompuesto(principalBigDecimal, interes, periodos);
        BigDecimal cantidadFinal = interesCompuesto.calculaMontoFinal();

        Assertions.assertEquals(new BigDecimal("1628.89"), cantidadFinal);
    }


}
