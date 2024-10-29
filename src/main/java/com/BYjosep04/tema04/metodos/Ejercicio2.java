package com.BYjosep04.tema04.metodos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float radio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        radio= Float.parseFloat(scanner.nextLine());
        scanner.close();
        System.out.println("El area de un circulo con radio "+radio+" es: "+Area(radio));
        System.out.println("La circunferencia de un circulo con radio "+radio+" es: "+Circunferencia(radio));

    }
    // Calculador de area
    /**
     * Calcula el área de un círculo.
     * @param radio El radio del círculo.
     * @return El área calculada del círculo.
     * @see Math#PI
     * */
    public static double Area(float radio){

        if (radio < 0) {
            System.err.println("El radio no puede ser menor de 0");
        }
        return Math.PI * radio * radio;
    }

    //Calcula la circunferencia
    /**
     * Calcula la circunferencia de un círculo.
     * @param radio El radio del círculo.
     * @return La circunferencia calculada del círculo.
     * @see Math#PI
     * */
    public static double Circunferencia(float radio){

        if (radio < 0) {
            System.err.println("El radio no puede ser menor de 0");
        }
        return Math.PI * (radio *2);
    }

}
