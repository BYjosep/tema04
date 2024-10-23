package com.BYjosep04.tema04.lib;

import java.util.Scanner;

/**
 * Libreria de entrada y salida
 */
public class IO {
    /**
     * Solicita un messaje y valida si esta comprendido entre longitudMinima y longitudMaxima
     *
     * @param mensaje        Mensaje qye se muestra al usuario
     * @param longitudMinima Numero minimo de caracteres del mensaje
     * @param longitudMaxima Numero maximo de caracteres del mensaje
     * @return El texto leido valido
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima) {
        String mensajeLeido;
        boolean verificacion = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(mensaje);
            mensajeLeido = scanner.nextLine();
            verificacion = mensajeLeido.length() >= longitudMinima && mensajeLeido.length() <= longitudMaxima;
            if (!verificacion) {
                System.err.println("La longitud debe de estar entr [" + longitudMinima + "-" + longitudMaxima + "]");
            }

        } while (!verificacion);
        scanner.close();
        return mensajeLeido;
    }

    /**
     * Apartir de dos numeros devuelve un true o false
     *
     * @param a El primer parametro
     * @param b El segundo parametro
     * @return Retorna el valor true si el primer numero es el mayor y false si es el segundo
     */
    public static boolean mayor(float a, float b) {
        boolean mayor;
        if (a > b) {
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
    }

    /**
     * Para poder retransmitrir la salida en un mensaje segun el valor
     * es favorable usar un switch
     *
     * @param a Si el primer valor es el mayor es 1
     * @param b Si el segundo valor es el mayor es 2
     * @param c Si el tercer valor es el mayor es 3
     * @param d Si el cuarto valor es el mayor es 4
     * @return Retorna un valor de 1 al 4
     */
    public static int mayor(float a, float b, float c, float d) {
        int mayor = 0;
        if (a > b && a > c && a > d) {
            mayor = 1;
        } else if (a < b && b > c && b > d) {
            mayor = 2;
        } else if (c > a && c > b && c > d) {
            mayor = 3;
        } else if (d > a && d > b && d > c) {
            mayor = 4;
        }
        return mayor;

    }
}
