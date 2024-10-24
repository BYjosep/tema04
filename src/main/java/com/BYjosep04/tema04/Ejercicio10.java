package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número entero positivo (o negativo para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                tablaMultiplicar(numero);
            }
        } while (numero >= 0);
    }

    /**
     *
     * @param numero ingresar el numero
     */
    public static void tablaMultiplicar(int numero) {
        System.out.printf("\nTabla de multiplicar del %d :", numero);
        for (int i = 1; i <= 10; i++) {
            //System.out.println(numero + " x " + i + " = " + (numero * i));
            System.out.printf("%d x %d = %d\n",numero,i,(numero * i));
        }
    }
}

