package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        int numero;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero= Integer.parseInt(scanner.nextLine());
        long sDeFact = sumatorio(numero);
        System.out.println(sDeFact);
    }
    /**
     * Apartir de un valor entero int es capaz de devolver un long.
     * Si se exede demasiado pasa a valer 0
     * @param numero variable de entrada de formato int
     * @return devuelve el sumatorio del parametro de entrada en formato long
     */
    public static long sumatorio(int numero){
        long total=1;

        for (int i = numero; i > 1; i--) {
            total = total+ numero;
            numero--;
        }
        return total;

    }
}
