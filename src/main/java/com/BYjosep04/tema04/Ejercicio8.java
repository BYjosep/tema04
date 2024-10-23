package com.BYjosep04.tema04;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int a,b,c,d;
        boolean capicua;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese el 1º numero");
        a= Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el 2º numero");
        b= Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el 3º numero");
        c= Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el 4º numero");
        d= Integer.parseInt(scanner.nextLine());
        scanner.close();
        capicua=esCapicua(a,b,c,d);
        System.out.println(capicua);
    }
    public static Boolean esCapicua( int a ,int b, int c, int d){
        boolean esCapicua;
        esCapicua = a == d && b == c;
        return esCapicua;

    }
}
