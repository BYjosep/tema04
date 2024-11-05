package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio7 {
    public static Scanner scanner = new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        /* ******* VARIABLES ********** */
        byte eleccion;
        LocalDate fechaIni, fechaTrabajo;
        LocalDate fechaModificada = null;
        String fechaFormateada;

        /* ****** Fecha inicial ******* */

        fechaIni = LocalDate.now();
        fechaFormateada = fechaIni.format(formatter);
        fechaTrabajo = fechaIni;
        /* ****** Bucle de comprobacion de la opcion ****** */
        do {
            System.out.println("***********************************\n" +
                    "*** FECHA CALCULADA: " + fechaFormateada + " ***\n" +
                    "***********************************\n" +
                    "1. Modificar fecha calculada\n" +
                    "2. Operaciones …\n" +
                    "------------------------------------\n" +
                    "0. Salir del programa");
            eleccion = Byte.parseByte(scanner.nextLine());
            switch (eleccion) {
                case 1 -> fechaFormateada = modificador(Objects.requireNonNull(fechaModificada));
                case 2 -> {
                    fechaModificada = submenu2(fechaTrabajo);
                    fechaTrabajo = fechaModificada;
                }
                case 0 -> {
                }
                default -> throw new IllegalStateException("Unexpected value: " + eleccion);
            }
        } while (eleccion != 0);

    }

    /**
     * Hace el cambio sea visibles
     * @param fechaModificada Fecha modificada en el submenu
     * @return Devuelce la fecha modificada
     */
    public static String modificador(LocalDate fechaModificada) {
        String fechaFormateada;

        fechaFormateada = fechaModificada.format(formatter);
        return fechaFormateada;
    }

    /**
     * Modifica la fecha, en el caso de este archivo para haer visible la fecha se tiene
     * que hacer efectivo llamando al metodo modificador
     * @param fechaInicio fecha con la que se opera
     * @return Devuelve una fecha modificada
     */
    public static LocalDate submenu2(LocalDate fechaInicio) {
        LocalDate fechaFin = fechaInicio;
        byte eleccion;
        long dato;

        do {
            System.out.println("***********************************\n" +
                    "*** FECHA CALCULADA: " +/*fechaFormateada+*/" ***\n" +
                    "***********************************\n" +
                    "1. Sumar años\n" +
                    "2. Sumar meses\n" +
                    "3. Sumar días\n" +
                    "4. Restar años\n" +
                    "5. Restar meses\n" +
                    "6. Restar días\n" +
                    "-----------------------\n" +
                    "0. Volver al menú principal");
            eleccion = Byte.parseByte(scanner.nextLine());

            switch (eleccion) {
                case 1 -> {
                    System.out.println("Ingrese cuantos años quiere sumar");
                    dato = Long.parseLong(scanner.nextLine());
                    fechaFin = fechaInicio.plusYears(dato);
                }
                case 2 -> {
                    System.out.println("Ingrese cuantos meses quiere sumar");
                    dato = Long.parseLong(scanner.nextLine());
                    fechaFin = fechaInicio.plusMonths(dato);
                }
                case 3 -> {
                    System.out.println("Ingrese cuantos dias quiere sumar");
                    dato = Long.parseLong(scanner.nextLine());
                    fechaFin = fechaInicio.plusDays(dato);
                }
                case 4 -> {
                    System.out.println("Ingrese cuantos años quiere restar");
                    dato = Long.parseLong(scanner.nextLine());
                    fechaFin = fechaInicio.minusYears(dato);
                }
                case 5 -> {
                    System.out.println("Ingrese cuantos meses quiere restar");
                    dato = Long.parseLong(scanner.nextLine());
                    fechaFin = fechaInicio.minusMonths(dato);
                }
                case 6 -> {
                    System.out.println("Ingrese cuantos dias quiere restar");
                    dato = Long.parseLong(scanner.nextLine());
                    fechaFin = fechaInicio.minusDays(dato);
                }
                case 0 -> {

                }
                default -> throw new IllegalStateException("Unexpected value: " + eleccion);
            }


        } while (eleccion != 0);

        return fechaFin;
    }
}
