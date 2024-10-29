package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Ejercicio1 {
    public static void main(String[] args) {
        String nacimiento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento de la siguiente forma: dd/mm/yyyy");
        nacimiento = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento,formatter);
        System.out.printf("Tienes %d anos\n",edad(fechaNacimiento));

    }

    public static int edad(LocalDate fechaNacimiento){
        LocalDate ahora = LocalDate.now();
        Period period = Period.between(fechaNacimiento, ahora);
        return period.getYears();
    }
}
