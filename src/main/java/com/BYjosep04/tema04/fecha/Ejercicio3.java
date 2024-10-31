package com.BYjosep04.tema04.fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Planeta{
        MERCURIO,VENUS,TIERRA,MARTE,JUPITER,SATURNO,URANO,NEPTUNO
    }
    public static void main(String[] args) {
        String nacimiento;
        Planeta eleccion = null;
        int planeta;double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento de la siguiente forma: dd/mm/yyyy");
        nacimiento = scanner.nextLine();

        do {
            System.out.println("Ingrese el planeta:");
            System.out.println("1. Mercurio, 2.Venus, 3.La Tierra, 4.Marte, 5.Jupiter, 6.Saturno, 7.Urano,8.Neptuno");
            planeta = Integer.parseInt(scanner.nextLine());
            switch (planeta){
                case 1-> eleccion= Planeta.MERCURIO;
                case 2-> eleccion= Planeta.VENUS;
                case 3-> eleccion= Planeta.TIERRA;
                case 4-> eleccion= Planeta.MARTE;
                case 5-> eleccion= Planeta.JUPITER;
                case 6-> eleccion= Planeta.SATURNO;
                case 7-> eleccion= Planeta.URANO;
                case 8-> eleccion= Planeta.NEPTUNO;
                default -> {
                    System.out.println("EL VALOR ESCRITO ES INCORRECTO");
                    System.out.println("Introduzca un numero no valido");
                }
            }
        }while (planeta <= 0 || planeta >= 9);
        scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento,formatter);
        resultado= calculadorPlanetario(fechaNacimiento,eleccion);
        System.out.printf("Desde la fecha %s hasta hoy han pasado %f años", nacimiento,resultado);
    }

    /**
     *
     * @param fechaNacimiento fecha que se introduce ya parseada con el formato(dd/MM/yyyy)
     * @param planeta enumerado con los planetas
     * @return Devuelve un double con el valor en años de la division
     * entre los dias transcurridos desde la fecha indicada hasta la fecha actual
     * y los dias de años pasados segun el planeta elegido
     */
    public static double calculadorPlanetario(LocalDate fechaNacimiento, Planeta planeta){
    long dias =Ejercicio2.diasEdad(fechaNacimiento);
    float calculo=0;
        switch (planeta.ordinal()){
            case 0-> calculo=  dias/(float)87.9;
            case 1-> calculo=  dias/(float)224.7;
            case 2-> calculo=  dias/(float)365.25;
            case 3-> calculo=  dias/(float)687;
            case 4-> calculo=  dias/(float)4333;
            case 5-> calculo=  dias/(float)10759;
            case 6-> calculo=  dias/(float)30668;
            case 7-> calculo=  dias/(float)60182;
    }
    return calculo;
    }
}
