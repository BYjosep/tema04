package com.BYjosep04.tema04.fecha;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Variables
        double velocidad;
        String fechaHoraSalidaStr, resultado;
        /* *********** */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha y hora de salida (dd/MM/yyyy HH:mm:ss) ");
        fechaHoraSalidaStr = scanner.nextLine();
        System.out.println("Ingrese la velocidad de la nave (km/h) ");
        velocidad = scanner.nextDouble();
        scanner.close();
        // Calcular el tiempo de viaje y obtener la cadena de resultado
        resultado = calcularViajeAMarte(fechaHoraSalidaStr, velocidad);
        System.out.println(resultado);
    }

    /**
     * Calcula el tiempo de viaje a Marte y genera una cadena con los detalles del viaje.
     * Una cadena de texto con los detalles del viaje, incluyendo tiempo total,
     * fecha estimada de llegada y desglose en horas, minutos, segundos, días, meses y años.
     * Este  calcula el tiempo que tomaría un viaje a Marte, dado una
     * fecha y hora de salida yuna velocidad constante.
     * Se asume una distancia promedio a Marte y se realiza una conversión
     * del tiempo total en horas a un formato más legible.
     * **Nota:** El cálculo de meses y años es una aproximación, asumiendo 30 días por mes.
     * @param fechaHoraSalidaStr La fecha y hora de salida del viaje en formato "dd/MM/yyyy HH:mm:ss".
     *                           En formato String
     * @param velocidad La velocidad de la nave espacial en kilómetros por hora.
     * @return El resultado final incluye la fecha y hora de llegada estimada.
     */
    public static String calcularViajeAMarte(String fechaHoraSalidaStr, double velocidad) {
        // constantes y  Variables
        final double DISTANCIA = 225000000.0;
        final int HMS = 60;
        final int HORAS_A_DIAS = 24;
        double tiempoViajeHoras;
        long dias, horas, minutos, segundos;
        int meses, anos;
        String resultado;

        // Conversor a  LocalDateTime
         java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaHoraSalida = LocalDateTime.parse(fechaHoraSalidaStr, formatter);

        /* ***** Calculador ***** */
        tiempoViajeHoras = DISTANCIA / velocidad;

        dias     = (long) (tiempoViajeHoras / HORAS_A_DIAS);
        horas    = (long) (tiempoViajeHoras % HORAS_A_DIAS);
        minutos  = (long) (tiempoViajeHoras - dias *  HORAS_A_DIAS - horas) * HMS;
        segundos = (long) ((tiempoViajeHoras - dias * HORAS_A_DIAS - horas) * HMS - minutos) * HMS;

        meses = (int) (dias / 30);
        anos  = meses / 12;
        meses = meses % 12;

        // Calcular la fecha y hora de llegada
        LocalDateTime fechaHoraLlegada = fechaHoraSalida.plusDays(dias)
                .plusHours(horas)
                .plusMinutes(minutos)
                .plusSeconds(segundos);

        // Crear la cadena de resultado
        resultado = "Al salir en la fecha: " + fechaHoraSalida.format(formatter) + " con la velocidad de " +
                velocidad + "  Km/h" + " el viaje tarda: " + horas + " horas, " + minutos + " minutos, " +
                segundos + " segundos, " + dias + " días, " + meses + " meses, " + anos + " años." +
                " La fecha estimada de llegada es: " + fechaHoraLlegada.format(formatter);

        return resultado;
    }
}
