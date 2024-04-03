package org.iesvdm.haversine;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.pow;

public class DistanciaUtil {
    private static final BigDecimal RADIO_TIERRA_KM = new BigDecimal("6378.0");

    public static BigDecimal distanciaKm(Posicion posOrigen, Posicion posDestino) {
        BigDecimal difLatitud = posDestino.getLatitud().subtract(posOrigen.getLatitud());
        BigDecimal difLongitud = posDestino.getLongitud().subtract(posOrigen.getLongitud());

        BigDecimal PI = BigDecimal.valueOf(Math.PI);

        BigDecimal lat1 = posOrigen.getLatitud().multiply(PI).divide(new BigDecimal("180"),RoundingMode.HALF_EVEN);
        BigDecimal lat2 = posDestino.getLatitud().multiply(PI).divide(new BigDecimal("180"),RoundingMode.HALF_EVEN);
        BigDecimal lon1 = posOrigen.getLongitud().multiply(PI).divide(new BigDecimal("180"),RoundingMode.HALF_EVEN);
        BigDecimal lon2 = posDestino.getLongitud().multiply(PI).divide(new BigDecimal("180"),RoundingMode.HALF_EVEN);

        BigDecimal a = BigDecimal.valueOf(Math.sin(difLatitud.doubleValue() / 2))
                .multiply(BigDecimal.valueOf(Math.sin(difLatitud.doubleValue() / 2)))
                .add(BigDecimal.valueOf(Math.cos(lat1.doubleValue()))
                        .multiply(BigDecimal.valueOf(Math.cos(lat2.doubleValue())))
                        .multiply(BigDecimal.valueOf(Math.sin(difLongitud.doubleValue() / 2)))
                        .multiply(BigDecimal.valueOf(Math.sin(difLongitud.doubleValue() / 2))));

        BigDecimal c = BigDecimal.valueOf(2)
                .multiply(BigDecimal.valueOf(Math.atan2(a.doubleValue(), 1 - a.doubleValue())));

        return RADIO_TIERRA_KM.multiply(c);
    }

}
