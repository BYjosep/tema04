package com.BYjosep04.tema04.fecha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {

    public static final String ESC="\u001B";

    public static void main(String[] args) {
        // Llamar al método que inicia la cuenta atrás
        tiempoRestanteParaFinDeAno();
    }

    /**
     * ***********************************************************************************
     * * Este metodo hace un print donde se borra lo que habia en pantalla,              *
     * * imprime la hora actual y el tiempo restante para año nuevo o lo que es lo mismo *
     * * el tiempo que falta para el 1 de enero del siguiente año a las 00:00            *
     * ***********************************************************************************
     */
    public static void tiempoRestanteParaFinDeAno() {
        // Crea un Timer
        Timer timer = new Timer();
        // Define el formato de la fecha y hora
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // Configura la fecha de Año Nuevo
        LocalDateTime newYear = LocalDateTime.of(LocalDateTime.now().getYear() +
                1, 1, 1, 0, 0, 0);

        // Usar el Timer para actualizar la pantalla cada segundo
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                long months ,days ,hours ,minutes ,seconds;
                // Limpiar la pantalla y mover el cursor a la esquina superior izquierda
                System.out.print(ESC+"[H"+ESC+"[2J");
                System.out.flush();
                // Mostrar la fecha y hora actual
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Fecha y hora actual: " + now.format(dateFormatter));

                // Calcular el tiempo restante hasta el Año Nuevo
                months  = ChronoUnit.MONTHS.between(now, newYear);
                days    = ChronoUnit.DAYS.between(now.plusMonths(months), newYear);
                hours   = ChronoUnit.HOURS.between(now.plusMonths(months).plusDays(days), newYear);
                minutes = ChronoUnit.MINUTES.between(now.plusMonths(months).plusDays(days).plusHours(hours), newYear);
                seconds = ChronoUnit.SECONDS.between(now.plusMonths(months).plusDays(days)
                        .plusHours(hours).plusMinutes(minutes), newYear);


                System.out.printf("Faltan: %d meses, %d días, %d horas, %d minutos, %d segundos\n",
                        months, days, hours, minutes, seconds);
            }
        }, 0, 1000); // Actualizar cada segundo (1000 ms == 1s )
    }
}
