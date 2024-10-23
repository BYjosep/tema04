package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
    int numero;long total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero = Integer.parseInt(scanner.nextLine());
        scanner.close();
        total =factorial(numero);
        if (total<0){
            System.err.println("El valor representado no es el correctodebido a un overflow");
        }
        System.out.println(numero + "! = " + total);
    }

    public static long factorial(int numero){
         long factorial=1;

        for (int i = numero; i > 1; i--) {
            factorial = factorial* numero;
            numero--;
        }
        return factorial;

    }
}
