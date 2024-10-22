package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio1 {
    private static void Sum(float x,float y ){
    /**
     * @param x El primer valor.
     * @param y El segundo valor.
     * @return La suma de ambos valores.

    */
        System.out.println((x+y));
    }
    public static void main(String[] args) {
        float primerNumerom, segundoNumero;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        primerNumerom = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        segundoNumero = Float.parseFloat(scanner.nextLine());
        scanner.close();
        //Llamada a la funcion Sum
        Sum(primerNumerom,segundoNumero);

    }
}
