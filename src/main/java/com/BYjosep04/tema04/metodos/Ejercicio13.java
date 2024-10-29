package com.BYjosep04.tema04.metodos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        byte opcion ;
        String mensaje,nombre;
        /*
        * Opcion 1 -> Valenciano
        * Opcion 2 -> Castellano
        * Opcion 3 -> Ingles
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opcion de idioma \n1 Valenciano\n2 Castellano\n3 Ingles ");
        do {
            opcion = scanner.nextByte();
            scanner.nextLine();
            if (opcion != 1 && opcion !=2 && opcion != 3){
                System.out.println("Introduzca un valor valido");   
            }
        }while (opcion != 1 && opcion !=2 && opcion != 3);
        System.out.println("Ingrese el nombre");
        nombre = scanner.nextLine();
        scanner.close();
        mensaje = idioma(opcion, nombre);
        System.out.println(mensaje);
    }

    /**
     * En base a una opcion devuelve un mensaje
     * @param opcion opciones sirve para determinar el idioma
     * @param nombre nombre a poner este tiene que ser un string
     * @return en base a las opciones mensaje es
     */
    public static String idioma(byte opcion, String nombre){
        String mensaje ="";
        switch (opcion){
            case 1 -> mensaje ="Bon dia "+ nombre;
            case 2 -> mensaje ="Buenos dias "+ nombre;
            case 3 -> mensaje ="Good morning "+ nombre;
        }
        return mensaje;
    }
}
