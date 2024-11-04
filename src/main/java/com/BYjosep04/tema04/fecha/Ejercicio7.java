package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        LocalDate fechaIni;
        String fechaFormateada;
        Scanner scanner =new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaIni = LocalDate.now();
        fechaFormateada = fechaIni.format(formatter);

        System.out.println("***********************************\n" +
                           "*** FECHA CALCULADA: "+fechaFormateada+" ***\n" +
                           "***********************************\n" +
                            "1. Modificar fecha calculada\n" +
                            "2. Operaciones …\n" +
                           "------------------------------------\n" +
                            "0. Salir del programa");


    }

    public static void submenu1(){

        System.out.println("***********************************\n" +
                "*** FECHA CALCULADA: "+/*fechaFormateada+*/" ***\n" +
                "***********************************\n" +
                "1. Sumar años\n"+"2. Sumar meses\n"+"3. Sumar días\n"+
                "4. Restar años\n"+
                "5. Restar meses\n"+
                "6. Restar días\n"+
                "-----------------------\n"+
                "0. Volver al menú principal");
    }
}
