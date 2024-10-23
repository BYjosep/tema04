package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float x,y;
        float test;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        x= Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el segundo numero");
        y= Float.parseFloat(scanner.nextLine());
        float mayor;
        scanner.close();
        test=mayor(x,y);
        System.out.println("El numero mayor es"+test);

    }

    /**
     * Apartir de dos numeros devuelve un true o false
     * @param a El primer parametro
     * @param b El segundo parametro
     * @return Retorna el valor true si el primer numero es el mayor y false si es el segundo
     */
    public static float mayor(float a, float b){
        float mayor;
        if (a>b){
            mayor= a;
        }else {
            mayor= b;
        }
        return mayor;
    }
}
