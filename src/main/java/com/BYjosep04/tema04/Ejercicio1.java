package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * @param x El primer valor.
     * @param y El segundo valor.
     * devuelve La suma de ambos valores.

     */
    private static int Sum(int x,int y ){
        return x+y;
    }
    public static void main(String[] args) {
        int primerNumerom, segundoNumero;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        primerNumerom = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        segundoNumero = Integer.parseInt(scanner.nextLine());
        scanner.close();
        //Llamada a la funcion Sum
        System.out.println(Sum(primerNumerom,segundoNumero));

    }
}
