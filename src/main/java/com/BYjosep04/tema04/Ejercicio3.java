package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float x,y;
        boolean test;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        x= Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        y= Float.parseFloat(scanner.nextLine());
        boolean mayor;
        scanner.close();
        test=Mayor(x,y);
        if(test){
            System.out.println("El primer numero es el mayor");
        }else {
            System.out.println("El segundo numero es mayor");
        }

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
