package com.BYjosep04.tema04.lib;

import java.util.Scanner;

/**
 * Libreria de entrada y salida
 */
public class IO {
    /**
     * Solicita un messaje y valida si esta comprendido entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje qye se muestra al usuario
     * @param longitudMinima Numero minimo de caracteres del mensaje
     * @param longitudMaxima Numero maximo de caracteres del mensaje
     * @return El texto leido valido
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
        String mensajeLeido;
        boolean verificacion =true;
        Scanner scanner= new Scanner(System.in);
        do{
            System.out.println(mensaje);
            mensajeLeido =scanner.nextLine();
            verificacion = mensajeLeido.length() >= longitudMinima && mensajeLeido.length()<= longitudMaxima;
            if (!verificacion){
                System.err.println("La longitud debe de estar entr ["+longitudMinima+"-"+longitudMaxima+"]");
            }

        }while (!verificacion);
        scanner.close();
        return mensajeLeido;
    }
    /**
     * Apartir de dos numeros devuelve un true o false
     * @param a El primer parametro
     * @param b El segundo parametro
     * @return Retorna el valor true si el primer numero es el mayor y false si es el segundo
     */
    public static boolean Mayor(float a, float b){
        boolean mayor;
        if (a>b){
            mayor=true;
        }else {
            mayor=false;
        }
        return mayor;
    }
}
