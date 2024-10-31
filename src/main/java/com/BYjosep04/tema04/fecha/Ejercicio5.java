package com.BYjosep04.tema04.fecha;

//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String salida;
        float velocidad;
        String horaLlegada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de salida de la siguiente forma: dd/mm/yyyy hh:mm:ss");
        salida = scanner.nextLine();
        System.out.println("Ingreses la velocidad en Km/h");
        velocidad = Float.parseFloat(scanner.nextLine());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaSalida = LocalDateTime.parse(salida,formatter);
        horaLlegada = fechaHoraLlegada(LocalDateTime.parse(fechaSalida.format(formatter)), velocidad);
    }

    public static String fechaHoraLlegada(LocalDateTime fechaSalida, float velocidad ){
    final int DISTANCIA=255_000_000 ;
    String llegada="";
    int horas, minutos, segundos;
    int dias, meses, anos;



    //LocalDateTime dia= fechaSalida.;

        return llegada;
    }
}
