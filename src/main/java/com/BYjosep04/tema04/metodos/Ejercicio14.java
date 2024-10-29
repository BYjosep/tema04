package com.BYjosep04.tema04.metodos;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int n, m,nM;
        long factorialN, factorialM, factorialN_M;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        m = Integer.parseInt(scanner.nextLine());
        scanner.close();
        nM = n-m;
        factorialN= factorial(n);
        factorialM= factorial(m);
        factorialN_M = factorial(nM);
        resultado = combinatorio(factorialN, factorialM, factorialN_M);
        System.out.printf("El resultado de %d!/(%d*(%d-%d)!)= %f",n,m,n,m,resultado);
    }


    public static double combinatorio(long primerNumero, long segundoNumero, long tercerNumero){
        double resultado;
        resultado = primerNumero/((double)segundoNumero*tercerNumero);
        return resultado;
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
