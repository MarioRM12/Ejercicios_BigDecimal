package org.iesvdm.haversine;

import java.math.BigDecimal;

public class DistanciaUtil {
    private static final BigDecimal RADIO_TIERRA_KM = new BigDecimal("6378.0");

    public static BigDecimal distanciaKm(Posicion posOrigen, Posicion posDestino) {
        BigDecimal difLatitud = posDestino.getLatitud().subtract(posOrigen.getLatitud());
        BigDecimal difLongitud = posDestino.getLongitud().subtract(posOrigen.getLongitud());

        double lat1 = posOrigen.getLatitud().doubleValue() * Math.PI / 180.0;
        double lat2 = posDestino.getLatitud().doubleValue() * Math.PI / 180.0;
        double lon1 = posOrigen.getLongitud().doubleValue() * Math.PI / 180.0;
        double lon2 = posDestino.getLongitud().doubleValue() * Math.PI / 180.0;

        double a = Math.sin(difLatitud.doubleValue() / 2) * Math.sin(difLatitud.doubleValue() / 2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.sin(difLongitud.doubleValue() / 2) * Math.sin(difLongitud.doubleValue() / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return RADIO_TIERRA_KM.multiply(BigDecimal.valueOf(c));
    }

}
