package org.example;

public class ConversorTempo {

    public static String formatarMinutos(
            int minutos
    ) {

        int horas = minutos / 60;

        int minutosRestantes =
                minutos % 60;

        return horas
                + "h "
                + minutosRestantes
                + "min";
    }
}