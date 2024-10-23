package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        float a,b,c,d;
        int valorMayor;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        a= Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el segundo valor");
        b= Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el tercer valor");
        c= Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese el cuarto valor");
        d= Float.parseFloat(scanner.nextLine());
        scanner.close();
        valorMayor=mayor(a,b,c,d);
        switch (valorMayor){
            case 1-> System.out.printf("El valor mayor es %f que es el 1º valor introducido",a);
            case 2-> System.out.printf("El valor mayor es %f que es el 2º valor introducido",b);
            case 3-> System.out.printf("El valor mayor es %f que es el 3º valor introducido",c);
            case 4-> System.out.printf("El valor mayor es %f que es el 4º valor introducido",d);
        }
    }
    /**
     * Para poder retransmitrir la salida en un mensaje segun el valor
     * es favorable usar un switch
     * @param a Si el primer valor es el mayor es 1
     * @param b Si el segundo valor es el mayor es 2
     * @param c Si el tercer valor es el mayor es 3
     * @param d Si el cuarto valor es el mayor es 4
     * @return Retorna un valor de 1 al 4
     */
    public static int mayor(float a,float b,float c,float d){
        int mayor=0;
        if(a>b && a>c && a>d) {
            mayor =1;
        } else if (a<b && b>c && b>d) {
            mayor=2;
        }else if (c>a && c>b && c>d) {
            mayor=3;
        }else if (d>a && d>b && d>c) {
            mayor=4;
        }
        return mayor;

    }

}
