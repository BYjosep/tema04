package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio4 {

    public enum Zodiaco {
        ACUARIO, PISCIS, ARIES, TAURO, GEMINIS, CANCER,
        LEO, VIRGO, LIBRA, ESCORPIO, OFIUCO, SAGITARIO, CAPRICORNIO
    }

    public static void main(String[] args) {
        String nacimiento;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento de la siguiente forma: dd/mm/yyyy");
        nacimiento = scanner.nextLine();
        scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento, formatter);
        System.out.println(fechaZodiaco(fechaNacimiento));
    }

    public static String fechaZodiaco(LocalDate fechanacimitnto) {
        int mes = fechanacimitnto.getMonthValue();
        int dia = fechanacimitnto.getDayOfMonth();
        MonthDay mothday = MonthDay.of(mes, dia);

        if ((mes == 2 && dia >= 18) || (mes == 3 && dia <= 11)) {
            return Zodiaco.ACUARIO.name();
        } else if ((mes == 3 && dia >= 12) || (mes == 4 && dia <= 16)) {
            return Zodiaco.PISCIS.name();
        } else if ((mes == 4 && dia >= 17) || (mes == 5 && dia <= 14)) {
            return Zodiaco.ARIES.name();
        } else if ((mes == 5 && dia >= 15) || (mes == 6 && dia <= 21)) {
            return Zodiaco.TAURO.name();
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 19)) {
            return Zodiaco.GEMINIS.name();
        } else if ((mes == 7 && dia >= 20) || (mes == 8 && dia <= 10)) {
            return Zodiaco.CANCER.name();
        } else if ((mes == 8 && dia >= 11) || (mes == 9 && dia <= 16)) {
            return Zodiaco.LEO.name();
        } else if ((mes == 9 && dia >= 17) || (mes == 10 && dia <= 30)) {
            return Zodiaco.VIRGO.name();
        } else if ((mes == 10 && dia >= 31) || (mes == 11 && dia <= 22)) {
            return Zodiaco.LIBRA.name();
        } else if ((mes == 11 && dia >= 23) || (mes == 11 && dia <= 28)) {
            return Zodiaco.ESCORPIO.name();
        } else if ((mes == 11 && dia >= 29) || (mes == 12 && dia <= 17)) {
            return Zodiaco.OFIUCO.name();
        } else if ((mes == 12 && dia >= 18) || (mes == 1 && dia <= 20)) {
            return Zodiaco.SAGITARIO.name();
        }
        return "";
    }

}
