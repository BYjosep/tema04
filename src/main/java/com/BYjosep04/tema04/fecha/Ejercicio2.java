package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nacimiento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento de la siguiente forma: dd/mm/yyyy");
        nacimiento = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento,formatter);
        System.out.printf("An pasado %d dias desde que has nacido\n", diasEdad(fechaNacimiento));
    }
    public static long diasEdad(LocalDate fechaNacimiento){
        LocalDate ahora = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaNacimiento, ahora);


    }

}
