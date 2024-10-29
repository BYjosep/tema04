package com.BYjosep04.tema04.metodos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    int numero;long total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero = Integer.parseInt(scanner.nextLine());
        scanner.close();
        total =factorial(numero);
        if (total<=0){
            System.err.println("El valor representado no es el correctodebido a un overflow");
        }
        System.out.println(numero + "! = " + total);
    }

    /**
     * Apartir de un valor entero int es capaz de devolver un long.
     * Si se exede demasiado pasa a valer 0
     * @param numero variable de entrada de formato int
     * @return devuelve el factorial del parametro de entrada en formato long
     */
    public static long factorial(int numero){
         long factorial=1;

        for (int i = numero; i > 1; i--) {
            factorial = factorial* numero;
            numero--;
        }
        return factorial;

    }
}
